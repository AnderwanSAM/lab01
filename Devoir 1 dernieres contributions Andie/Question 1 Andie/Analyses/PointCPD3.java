
public class PointCPD3 {
	
    private char typeCoord;

    /**
     * Contains the current value of RHO.
     */
    private double x;

    /**
     * Contains the current value of THETA.
     */
    private double y ;


    //Constructors ******************************************************

    /**
     * Constructs a coordinate object, with a type identifier.
     * Stores in Polar and converts from Cartesian if necessary.
     */
    public PointCPD3(char type, double x, double y) {
        if(type != 'C' && type != 'P')
            throw new IllegalArgumentException();
        this.typeCoord = type;
        if(this.typeCoord == 'P'){
            this.x = (Math.cos(Math.toRadians(y)) * x);;
            this.y = (Math.sin(Math.toRadians(y)) * x);
        }else{
            this.x = x;
            this.y = y;
        }

    }


    //Instance methods **************************************************


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRho() {
    	return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));
    }

    public double getTheta() {
    	return Math.toDegrees(Math.atan2(y, x));
    }

    /**
     * Converts Cartesian coordinates to Polar coordinates.
     * Does nothing since this implementation has only one storage format
     */
    public void convertStorageToPolar()
    {
        return;
    }

    /**
     * Converts Polar coordinates to Cartesian coordinates.
     * Does nothing since this implementation has only one storage format
     */
    public void convertStorageToCartesian()
    {
        return;
    }


    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointA The first point.
     * @param temp2 The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCPD3 temp2) {
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - temp2.getX();
        double deltaY = getY() - temp2.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param point    The point to rotate
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCPD3 rotatePoint(double rotation) {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCPD3(typeCoord,
                (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    /**
     * Returns information about the coordinates.
     *
     * @return A String containing information about the coordinates.
     */
    public String toString() {
        return "Stored as Polar  (" + getTheta() + "," + getRho() + ")\n" +
                "Computed Cartesian as ("+getX()+", "+getY()+")";
    }

}

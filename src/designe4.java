
public class designe4 {
	private char typeCoord;

	/**
	* Contains the current value of X or RHO depending on the type
	* of coordinates.
	*/
	private double xOrRho;
	double x,y,rho,theta;
	/**
	* Contains the current value of Y or THETA value depending on the
	* type of coordinates.
	*/
	private double yOrTheta;
		

	//Constructors ******************************************************

	/**
	* Constructs a coordinate object, with a type identifier.
	*/
	public designe4(char type, double xOrRho, double yOrTheta,double x, double y, double rho, double theta)
	{
	 if(type != 'C' && type != 'P')
	   throw new IllegalArgumentException();
	 this.xOrRho = xOrRho;
	 this.yOrTheta = yOrTheta;
	 this.x =x;
	 this.y=y;
	 this.rho=rho;
	 this.theta=theta;
	 typeCoord = type;
	}
		

	//Instance methods **************************************************


	public double getX()
	{
	 if(typeCoord == 'C') 
	   return x;
	 else 
	   return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
	}

	public double getY()
	{
	 if(typeCoord == 'C') 
	   return y;
	 else 
	   return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
	}

	public double getRho()
	{
	 if(typeCoord == 'P') 
	   return rho;
	 else 
	   return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
	}

	public double getTheta()
	{
	 if(typeCoord == 'P')
	   return theta;
	 else 
	   return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
	}

		
	/**
	* Converts Cartesian coordinates to Polar coordinates.
	*/
	public void convertStorageToPolar()
	{
	 if(typeCoord != 'P')
	 {
	   //Calculate RHO and THETA
	   double temp = getRho();
	   theta = getTheta();
	   rho = temp;
	   
	   typeCoord = 'P';  //Change coord type identifier
	 }
	}
		
	/**
	* Converts Polar coordinates to Cartesian coordinates.
	*/
	public void convertStorageToCartesian()
	{
	 if(typeCoord != 'C')
	 {
	   //Calculate X and Y
	   double temp = getX();
	   y = getY();
	   x = temp;

	   typeCoord = 'C';	//Change coord type identifier
	 }
	}

	/**
	* Calculates the distance in between two points using the Pythagorean
	* theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
	*
	* @param pointA The first point.
	* @param pointB The second point.
	* @return The distance between the two points.
	*/
	public double getDistance(question1 pointB)
	{
	 // Obtain differences in X and Y, sign is not important as these values
	 // will be squared later.
	 double deltaX = getX() - pointB.getX();
	 double deltaY = getY() - pointB.getY();
	 
	 return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
	}

	/**
	* Rotates the specified point by the specified number of degrees.
	* Not required until E2.30
	*
	* @param point The point to rotate
	* @param rotation The number of degrees to rotate the point.
	* @return The rotated image of the original point.
	*/
	public question1 rotatePoint(double rotation)
	{
	 double radRotation = Math.toRadians(rotation);
	 double X = getX();
	 double Y = getY();
	     
	 return new question1('C',
	   (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
	   (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
	}

	/**
	* Returns information about the coordinates.
	*
	* @return A String containing information about the coordinates.
	*/
	public String toString()
	{
	 return "Stored as " + (typeCoord == 'C' 
	    ? "Cartesian  (" + getX() + "," + getY() + ")"
	    : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
	}


}

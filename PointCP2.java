// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
<<<<<<< HEAD
// license found at www.lloseng.com
=======
// license found at www.lloseng.com 
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
<<<<<<< HEAD
public class PointCP
=======
public class PointCP2
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  private char typeCoord;
<<<<<<< HEAD

=======
  
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  private double xOrRho;
<<<<<<< HEAD

=======
  
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  private double yOrTheta;
<<<<<<< HEAD


=======
	
  
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
<<<<<<< HEAD
  public PointCP(char type, double xOrRho, double yOrTheta)
=======
  public PointCP2(char type, double xOrRho, double yOrTheta)
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  {
    if(type != 'C' && type != 'P')
      throw new IllegalArgumentException();
    this.xOrRho = xOrRho;
    this.yOrTheta = yOrTheta;
    typeCoord = type;
  }
<<<<<<< HEAD


  //Instance methods **************************************************


  public double getX()
  {
    if(typeCoord == 'C')
      return xOrRho;
    else
      return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getY()
  {
    if(typeCoord == 'C')
      return yOrTheta;
    else
      return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
  }

  public double getRho()
  {
    if(typeCoord == 'P')
      return xOrRho;
    else
      return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
  }

  public double getTheta()
  {
    if(typeCoord == 'P')
      return yOrTheta;
    else
      return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
  }


=======
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {   
    double result = 0;  
      if(typeCoord == 'C') {

        result = (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    }
        return result;
  }
  
  public double getY()
  {   
    double result = 0;  
      if(typeCoord == 'C') {

        result = (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    }
        return result;
  }
     
  
  public double getRho()
  { 
      return xOrRho;
  }
  
  public double getTheta()
  {
      return yOrTheta;
  }
  
	
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  public void convertStorageToPolar()
  {
    if(typeCoord != 'P')
    {
      //Calculate RHO and THETA
      double temp = getRho();
      yOrTheta = getTheta();
      xOrRho = temp;
<<<<<<< HEAD

      typeCoord = 'P';  //Change coord type identifier
    }
  }

  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
=======
      
      typeCoord = 'P';  //Change coord type identifier
    }
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  public void convertStorageToCartesian()
  {
    if(typeCoord != 'C')
    {
      //Calculate X and Y
      double temp = getX();
      yOrTheta = getY();
      xOrRho = temp;
<<<<<<< HEAD

=======
   
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
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
<<<<<<< HEAD
  public double getDistance(PointCP pointB)
=======
  public double getDistance(PointCP2 pointB)
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
<<<<<<< HEAD

=======
    
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
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
<<<<<<< HEAD
  public PointCP rotatePoint(double rotation)
=======
  public PointCP2 rotatePoint(double rotation)
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
<<<<<<< HEAD

    return new PointCP('C',
=======
        
    return new PointCP2('C',
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
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
<<<<<<< HEAD
    return "Stored as " + (typeCoord == 'C'
       ? "Cartesian  (" + getX() + "," + getY() + ")"
       : "Polar [" + getRho() + "," + getTheta() + "]") + "\n";
=======
    return "Stored as " /* (typeCoord == 'C' 
       ? "Cartesian  (" + getX() + "," + getY() + ")":"*/
       + "Polar" + "["+ getRho() + "," + getTheta()  +"]" + "\n";
>>>>>>> 557ef43142d143f42518e3bdf3bf3afdfacddc22
  }
}

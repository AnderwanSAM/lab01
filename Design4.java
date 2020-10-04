
public class Design4 {
	//This file contains material supporting section 2.9 of the textbook:
		//"Object Oriented Software Engineering" and is issued under the open-source
		//license found at www.lloseng.com 

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

		//Instance variables ************************************************

		/**
		* Contains C(artesian) or P(olar) to identify the type of
		* coordinates that are being dealt with.
		*/
		private char typeCoord;

		/**
		* Contains the current value of X  
		*/
		private double X;
		/**
		* Contains the current value of  RHO 
		*
		*/
		private double Rho;// Contains Rho
		/**
		* Contains the current value of Y 
		*/
		private double Y;
		/**
		* Contains the current value of  THETA 
		*/
		private double Theta;
		//Constructors ******************************************************

		/**
		* Constructs a coordinate object, with a type identifier.
		*/
		public Design4( double X, double Y,double Rho, double Theta)
		{
		//Store both types of coordinates
		 this.X = X;
		 this.Y = Y;
		 this.Rho = Rho;
		 this.Theta = Theta;
		
		}
			

		//Instance methods **************************************************


		public double getX()
		{
		 
		   return X;
		
		}

		public double getY()
		{
		
		  return Y;
		
		}

		public double getRho()
		{
		 
		   return Rho;
		 
		}

		public double getTheta()
		{
		 
		   return Theta;
		
		}

			
		/**
		* Converts Cartesian coordinates to Polar coordinates.
		*/
		public void convertStorageToPolar()
		{
		
		   double temp = getRho();
		   Theta = getTheta();
		   Rho = temp;
		   
		
		}
			
		/**
		* Converts Polar coordinates to Cartesian coordinates.
		*/
		public void convertStorageToCartesian()
		{
		
		   double temp = getX();
		   Y = getY();
		   X = temp;

		
		}

		/**
		* Calculates the distance in between two points using the Pythagorean
		* theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
		*
		* @param pointA The first point.
		* @param pointB The second point.
		* @return The distance between the two points.
		*/
		public double getDistance(Design4 pointB)
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
		public Design4 rotatePoint(double rotation)
		{
		 double radRotation = Math.toRadians(rotation);
		 double X = getX();
		 double Y = getY();
		 double Theta= getTheta();
		 double Rho= getRho();
		 return new Design4(
		   (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
		   
		   (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y),
				 (Math.cos(radRotation) * Rho) - (Math.sin(radRotation) * Theta),
				   
				   (Math.sin(radRotation) * Rho) + (Math.cos(radRotation) * Theta));
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

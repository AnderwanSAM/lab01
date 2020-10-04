

import java.util.*;
import java.lang.*;

public class Analyse {

	
	
	
	public static void main(String[] args) {
		System.out.println("debut");
        int right_value = 50000000;
		//System.out.println(System.nanoTime());
		
        //System.out.println( !arraylistFillRuntime(right_value));
		while ( !arraylistFillRuntime(right_value) ) // tant que la fonction retourne false , recommencer 
		{
			System.out.println("False, on contine , value  =" + right_value);
			right_value++;
		}
		System.out.println(right_value);
		System.out.println("fin");
	}

	
	
	public static boolean arraylistFillRuntime(int sizeArray ) // recuperer avec sizeArray la taille a tester  
	{
		// create an array list  
	   List <Character> tableau = new ArrayList<Character>();
		 // what time is it ? 
	   double heure =  nanoToSeconds(System.nanoTime()); // 
		// remplir le tableau 
	   for (int i=0; i< sizeArray; i++) 
	   {
		   tableau.add('a');
	   }
		//prendre l'heure  a la fin //determiner le temps que ca a pris 
	   double heure_fin =  nanoToSeconds(System.nanoTime());
	   heure = heure_fin -  heure ;
	   System.out.println("==================================================   elspsed time  =" + heure);
		// si le temps est superieur a dix => return true 
	   if (heure < 10)
		   return false ;
	   else 
		   return true ;
		// sinon return false 
		
	}
	
	
	//un 
	
	
       public static double nanoToSeconds( long time ) {
		return (double) time / 1000000000.0;
	} /* nanoToSeconds */
	
	
	/*private static int [] genArray( int n ) {
		int []    ret = new int [ n ];

		for( int i = 0; i < ret.length; i++ ) {
			ret [ i ] = i;
		}
		return ret;
	} /* genArray */
}

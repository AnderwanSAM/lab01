import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnalyseTableau {


	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("debut");
        int right_value = 20000000;
        
        
        //System.out.println( !arraylistFillRuntime(right_value));
		while ( !arrayFillRuntime(right_value) ) // tant que la fonction retourne false , recommencer 
		{
			System.out.println("False, on contine , value  =" + right_value);
			right_value+=1000000;
		}
		System.out.println(right_value);
		System.out.println("fin");
	}

	
	
	public static boolean arrayFillRuntime(int sizeArray ) // recuperer avec sizeArray la taille a tester  
	{
		// create an array 
	    char [] tableau = new char[1000000000];
		// what time is it ? 
	   double heure = (double) (System.currentTimeMillis()/1000); // 
		// remplir le tableau 
	   for (int i=0; i< sizeArray; i++) 
	   {
		   tableau[i] = random_char();
	   }
		//prendre l'heure  a la fin //determiner le temps que ca a pris 
	   double heure_fin = (double) (System.currentTimeMillis()/1000);
	   heure = heure_fin -  heure ;
	   System.out.println("==================================================   elspsed time  =" + heure);
		// comparer le temps ecoule avec 10s ; 
	   if (heure < 10)
		   return false ;
	   else 
		   return true ;
	}
	
	
	
	public static char  random_char() {
		Random rnd = new Random();
		char c = (char) ('a' + rnd.nextInt(26));
		return c;
	}
	
	

}

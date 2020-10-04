package devoir1;
import java.util.*;
public class exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 50550000;
		
		
		double total=0.0;  ArrayList<Character> tab = new ArrayList<Character> ();double t=0;
			
			
		t=	calcul(total,x,tab);
		System.out.println("le temp est de " + t);
		
		while(vrai(t) ==false )
		{
			x=+10000;
			t=	calcul(total,x,tab);
			
		}
		
		System.out.println("le temp est de " + t);
			
	}
	
	
	public static boolean vrai(double q)
	{
		if (q<=10)
			return false;
		else
			return true;
	}
	
	public static double calcul(double p,int v,ArrayList<Character> tab)
	{
		long debut = System.currentTimeMillis();
		
		essai(v,tab);
		long fin = System.currentTimeMillis();
		
		double total1 = (double)(fin-debut)/1000;
		double total= p=total1;
		return total;
		
		
		
	}
	
	public static void essai(int h,ArrayList<Character> tab)
	{
		for(int i=0; i<=h ; i++)
		{
			tab.add(aleatoir());
		}
	}
	
	
	public static char aleatoir()
	{
		Random r = new Random();
		char c = (char) ('a'+r.nextInt());
		return c;
	}

}

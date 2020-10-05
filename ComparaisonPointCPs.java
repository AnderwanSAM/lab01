
import java.util.*;


public class ComparaisonPointCPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("temps de generation design 1 "+temps_de_generation1(100000000)+ " milliseconds");
		System.out.println("temps de generation design 2 "+ temps_de_generation2(100000000)+ " milliseconds");
		System.out.println("temps de generation design 3 "+temps_de_generation3(100000000) + " milliseconds");
		
		double [] essai = new double [8];
		essai = temps_PC(250000000);
		for(int i =0 ; i< 7;i++) {System.out.println(essai[i]);}
		
		
		
	}
	Random r = new Random() ;
     

	public static void genererUnPCP1() {
		//Pour la generation aleatoire, le type n'a pas d'importance car ca reste des double 
		PointCP  PointCP_current  = new PointCP('C',(Math.random() * 10000000),(Math.random()*10000000)) ;
		//return PointCP_current ; 
	}
	
	public static void genererUnPCp2() {
		//Pour la generation aleatoire, le type n'a pas d'importance car ca reste des double 
		PointCp2  PointCP_current  = new PointCp2('P',(Math.random() * 10000000),(Math.random()*10000000)) ;
		//return PointCP_current ; 
	}
	
	public static void genererUnPCp3() {
		//Pour la generation aleatoire, le type n'a pas d'importance car ca reste des double 
		PointCp3  PointCP_current  = new PointCp3('C',(Math.random() * 10000000),(Math.random()*10000000)) ;
		//return PointCP_current ; 
	}
	
	public static double temps_de_generation1(int number) {
		double temps_pour_genererPointCP = System.currentTimeMillis();
		for (int i =0 ; i< number; i++) {
		  genererUnPCP1();
		}
		temps_pour_genererPointCP = System.currentTimeMillis() -temps_pour_genererPointCP;
		
		return temps_pour_genererPointCP ; 
	}
	
	public static double temps_de_generation2(int number) {
		double temps_pour_genererPointCP = System.currentTimeMillis();
		for (int i =0 ; i< number; i++) {
		  genererUnPCp2();
		}
		temps_pour_genererPointCP = System.currentTimeMillis() -temps_pour_genererPointCP;
		
		return temps_pour_genererPointCP ; 
	}
	
	public static double temps_de_generation3(int number) {
		double temps_pour_genererPointCP = System.currentTimeMillis();
		for (int i =0 ; i< number; i++) {
		  genererUnPCp3();
		}
		temps_pour_genererPointCP = System.currentTimeMillis() -temps_pour_genererPointCP;
		
		return temps_pour_genererPointCP ; 
	}
	
	public static double [] temps_PC(int number) {
		double [] temps = new double[8];
		
		double time_elapsed =0;
		double coquille_de_reception =0;
		//  fonction get x
		time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	   coquille_de_reception = a.getX();
	    }
	   temps[0]= System.currentTimeMillis() - time_elapsed;
	   //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
		//fonction get Y
	    time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	   coquille_de_reception = a.getY();
	    }
	   temps[1]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
	   
		//fonction get Rho
	   time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	   coquille_de_reception = a.getRho();
	    }
	   temps[2]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
		//fonction theta 
	   time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	   coquille_de_reception = a.getTheta();
	    }
	   temps[3]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
		//fonction getDistance
	   time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	    PointCP b = new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	   coquille_de_reception = a.getDistance(b);
	    }
	   temps[4]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
		//fonction rotate point 
	   time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	    PointCP b =  a.rotatePoint((double)Math.random());
	    }
	   temps[5]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
		//fonction  convertir dans un autre  type 
		
	   time_elapsed = System.currentTimeMillis();
	    for (int i =0 ; i < number ; i++)
	    {
	    PointCP a =  new PointCP('C',(Math.random()*100000),(Math.random()*100000));
	    PointCP b =  a.rotatePoint((double)Math.random());
	    }
	   temps[6]= System.currentTimeMillis() - time_elapsed;
	    //* remettre les variables a 0 pour les prochains tests 
	   coquille_de_reception =0;
	   time_elapsed =0;
	   
		return temps;
		
	}
	
}

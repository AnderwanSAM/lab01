import java.util.*;
public class TestDePerformances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===========================================================");
		System.out.println("Debut des tests");
		System.out.println("===========================================================");
		long nb_de_classes = 100000000 + (long) Math.random()* 200000000; // generer aleartoirement entre 100 000 000 et 300 000 000 de classes 
		double elapsed_time =0 ; 
		System.out.println("Nombre de classes aleatoirement generees  = " + nb_de_classes );
		System.out.println("===========================================================");
		System.out.println("Design 1"); int i =0 ;
		elapsed_time = System.currentTimeMillis();  
		while (i < nb_de_classes) {
			tester_PointCP(); i++;
		}
		elapsed_time = System.currentTimeMillis() - elapsed_time;
		System.out.println("La boucle s'est terminee apres "+ elapsed_time + "  milliseconds"); i =0 ; 
		System.out.println("===========================================================");
		System.out.println("Design 2"); 
		elapsed_time = System.currentTimeMillis();  
		while (i < nb_de_classes) {
			tester_PointCPD2(); i++;
		}
		elapsed_time = System.currentTimeMillis() - elapsed_time;
		System.out.println("La boucle s'est terminee apres "+ elapsed_time + "  milliseconds"); i =0 ; 
		System.out.println("===========================================================");
		System.out.println("Design 3"); 
		elapsed_time = System.currentTimeMillis();  
		while (i < nb_de_classes) {
			tester_PointCPD3(); i++;
		}
		elapsed_time = System.currentTimeMillis() - elapsed_time;
		System.out.println("La boucle s'est terminee apres "+ elapsed_time + "  milliseconds"); i =0 ; 
		System.out.println("===========================================================");
		System.out.println("Design 4"); 
		elapsed_time = System.currentTimeMillis();  
		while (i < nb_de_classes) {
			tester_PointCPD4(); i++;
		}
		elapsed_time = System.currentTimeMillis() - elapsed_time;
		System.out.println("La boucle s'est terminee apres "+ elapsed_time + "  milliseconds"); i =0 ; 
		System.out.println("===========================================================");
		System.out.println("Fin ");
		System.out.println("===========================================================");
	}
	public static void tester_PointCP() {
		// generer aleatoirement un point de ce design 
		char type; 
		int choix = (int)(1 + Math.random());
		if (choix < 1 ) { type = 'C';}
		else { type = 'P';}
		PointCP temporaire =  new PointCP(type, (Math.random()*100000),(Math.random()*100000));
		//appeler toutes ses fonctions 
		temporaire.getRho();
		temporaire.getTheta();
		temporaire.getX();
		temporaire.getY();
		PointCP temp2 = temporaire.rotatePoint(Math.random() * 100000);
		temporaire.getDistance(temp2);
		if(type == 'C') {temporaire.convertStorageToPolar();}
		else {temporaire.convertStorageToCartesian();}

	}
	public static void tester_PointCPD2() {
		// generer aleatoirement un point de ce design 
		char type; 
		int choix = (int)(1 + Math.random());
		if (choix < 1 ) { type = 'C';}
		else { type = 'P';}
		PointCPD2 temporaire =  new PointCPD2(type, (Math.random()*100000),(Math.random()*100000));
		//appeler toutes ses fonctions 
		temporaire.getRho();
		temporaire.getTheta();
		temporaire.getX();
		temporaire.getY();
		PointCPD2 temp2 = temporaire.rotatePoint(Math.random() * 100000);
		temporaire.getDistance(temp2);
		if(type == 'C') {temporaire.convertStorageToPolar();}
		else {temporaire.convertStorageToCartesian();}
	}
	public static void tester_PointCPD3() {
		// generer aleatoirement un point de ce design 
		char type; 
		int choix = (int)(1 + Math.random());
		if (choix < 1 ) { type = 'C';}
		else { type = 'P';}
		PointCPD3 temporaire =  new PointCPD3(type, (Math.random()*100000),(Math.random()*100000));
		//appeler toutes ses fonctions 
		temporaire.getRho();
		temporaire.getTheta();
		temporaire.getX();
		temporaire.getY();
		PointCPD3 temp2 = temporaire.rotatePoint(Math.random() * 100000);
		temporaire.getDistance(temp2);
		if(type == 'C') {temporaire.convertStorageToPolar();}
		else {temporaire.convertStorageToCartesian();}
	}
	public static void tester_PointCPD4() {
		// generer aleatoirement un point de ce design 
		//appeler toutes ses fonctions
		char type; 
		int choix = (int)(1 + Math.random());
		if (choix < 1 ) { type = 'C';}
		else { type = 'P';}
		PointCPD4 temporaire =  new PointCPD4(type, (Math.random()*100000),(Math.random()*100000));
		//appeler toutes ses fonctions 
		temporaire.getRho();
		temporaire.getTheta();
		temporaire.getX();
		temporaire.getY();
		PointCPD4 temp2 = temporaire.rotatePoint(Math.random() * 100000);
		temporaire.getDistance(temp2);
		if(type == 'C') {temporaire.convertStorageToPolar();}
		else {temporaire.convertStorageToCartesian();}
	}
	

}


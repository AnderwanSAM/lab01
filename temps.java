package tempsArray;

import java.util.ArrayList;
import java.util.Random;

public class temps {


    public static void main (String[] args) throws InterruptedException {

        ArrayList <Character> tab = new ArrayList <Character>();
        long nombreX = 0;
        // Start 
    long debut = System.nanoTime();
    

        //Calcul de temps
        while ( ((System.nanoTime() - debut)/1000000) < 10000) {

            tab.add(random_char());
            nombreX++;

            if (((System.nanoTime() - debut)/1000000) == 5000){
                System.out.println("Nombre de caractère à 5seconde = " + nombreX );
            }

        }
    

        // Fin

    long fin = System.nanoTime(); 

        //Temps ecoulée

    long tempsEcoulé = fin - debut;

    System.out.println("L e temps ecoulé est de milliseconds : " + tempsEcoulé/1000000);
    System.out.println("Le nombre de caractere est de : " + nombreX);

    
}

public static char random_char(){

    Random rnd = new Random();
    char c = (char) ('a' + rnd.nextInt(26));
    return c;
}

/*public static long verification ( long debut, long fin){

    long resultat = fin - debut;

    return resultat;

}
*/
    
}

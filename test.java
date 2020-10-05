import java.util.*;


public class test {

    public static void main(String[] args){
        //PointCP2 test;
    PointCP2 tableau = new PointCP2(getK(), getAleatoire(),getAleatoire());
    long debut = System.nanoTime();
    
    System.out.println(tableau.typeCoord);
        //Calcul de temps
        // Fin
    long fin = System.nanoTime(); 

        //Temps ecoulée

    long tempsEcoulé = fin - debut;

    System.out.println("Le temps ecoulé est de milliseconds : " + tempsEcoulé/1000000);
}
    //System.out.println("Le nombre de caractere est de : " + nombreX);


    //generateur de caractere aleatoire
    public static char getK(){
    char choix = ' ';
    while (choix != 'c' && choix != 'p'){
        Random rand = new Random();
        choix = (char)(rand.nextInt(26) + 97);
    }
    if (choix == 'c')
        return Character.toUpperCase(choix);
    else
        return  Character.toUpperCase(choix);
   
    }

    public static double getAleatoire(){
       return (int)(Math.random() * 90);
    }



}

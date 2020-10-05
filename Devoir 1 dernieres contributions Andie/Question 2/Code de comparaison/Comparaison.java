
import java.util.*;
public class Comparaison {

	public static void main(String[] args) {
		int taille  = 1;
		Scanner scanner = new Scanner(System.in);
		while(taille != 0) {
		System.out.println("entrez la taille a tester : ");
		taille = scanner.nextInt();
		System.out.println("=================================================================");
		System.out.println("=== Comparaisons ; Taille = " + taille +  " ; unites  = milliseconds =");
		System.out.println("=================================================================");
		System.out.println("=================================================================");
		System.out.println("ArrayList : " +    fillArrayList(taille) + " milliseconds" );
		System.out.println("=================================================================");
		System.out.println("Array : " +    fillArrayTime(taille) + " milliseconds" );
		System.out.println("=================================================================");
	//	System.out.println("LinkedList : " +    fillLinkedList(taille) + " milliseconds" );
		System.out.println("=================================================================");
		}
		}

	public static long fillArrayTime(int size ) {
		int [] tableau = new int [500000000];
		long elapsed_time = System.currentTimeMillis();
		for(int i = 0; i < size;i++) 
		{
			tableau[i] = Analyse2.random_char();
		}
		elapsed_time = (elapsed_time -System.currentTimeMillis() ) * (-1);
		return elapsed_time;
	}
	
	public static long fillArrayList(int size ) {
		List <Character> tableau = new ArrayList<Character>(); 
		long elapsed_time = System.currentTimeMillis();
		for(int i = 0; i < size ;i++) 
		{
			tableau.add(Analyse2.random_char());
		}
		elapsed_time = (elapsed_time -System.currentTimeMillis() ) * (-1);
		return elapsed_time; 
	}
	public static long fillLinkedList(int size ) {
		LinkedList <Character> tableau = new LinkedList<Character>(); 
		long elapsed_time = System.currentTimeMillis();
		for(int i = 0; i < size;i++) 
		{
			tableau.add(Analyse2.random_char());
		}
		elapsed_time = (elapsed_time -System.currentTimeMillis() ) * (-1);
		return elapsed_time;
	}
}

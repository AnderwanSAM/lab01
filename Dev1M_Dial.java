import java.util.Random;
import java.util.ArrayList;
public class Dev1M_Dial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int X=20000000;
		while (!Array(X))
		{ 
		X+=1000000;	
		}
		
	}
	public static Boolean Array(int sizeArray)
	{
		
		ArrayList<Character> list =new ArrayList<Character>();
		
		double start= System.currentTimeMillis();
		for (int i=0; i<sizeArray;i++)
		{
		list.add(rand());
	
		}
		double end=System.currentTimeMillis();
		double t;
		t=(end-start)/1000;
		System.out.println(sizeArray+" ");
		System.out.println(t);
		if(t<10) {return false;}
		else
			return true;
	}
	public static char rand()
	{
		//int s=0;
		Random rd = new Random();
	//s=97+rd.nextInt(26);
	char c = (char)('a'+rd.nextInt(26));
	return c;
	}
}

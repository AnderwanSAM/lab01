package designe;
/*
		return total;*/
public class TestStat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long debut = System.currentTimeMillis();
		
		long fin;
		double total = 0;
		int nombre = 0;
		while(total < 10){
			PointCP2 p = new PointCP2('P', Math.random(), Math.random());
			p.getDistance(new PointCP2('P', Math.random(), Math.random()));
			//p.rotatePoint(Math.random());
			fin = System.currentTimeMillis();
			total = (double)(fin-debut)/1000;
			nombre++;
		}
		System.out.println("Temps total est en secondes "+total);
		System.out.println("Le nombre de points créé est "+nombre);
	}

}

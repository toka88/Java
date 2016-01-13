package nizovi;

import java.util.Arrays;
import java.util.Random;

public class Sladoled {
	/**
	 * Vraca niz elemenata tipa string
	 * @param args
	 */
	
	private static Random slucajan = new Random(45);
	static String[] UKUSI = {"cokolada", "jagoda","vanila","mentol","moka","rum","praline", "vosn pita"};
	
	public static String[] skupukusa(int n){
		if(n>UKUSI.length)
			throw new IllegalArgumentException("Zadatak prevelik");
		String[] rezultati = new String[n];
		boolean[] izabrrati = new boolean[UKUSI.length];
		for (int i = 0; i < n; i++) {
			int t;
			do{
				t = slucajan.nextInt(UKUSI.length);
			}while(izabrrati[t]);
			rezultati[i]=UKUSI[t];
			izabrrati[t] = true;
		}
		return rezultati;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<7 ; i++){
			System.out.println(Arrays.toString(skupukusa(3)));
		}
	}

}

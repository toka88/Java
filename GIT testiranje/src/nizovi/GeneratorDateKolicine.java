package nizovi;

import java.util.*;
import java.util.Arrays;
/**
 * 
 * @author Tokovic Goran
 * @version 14.01.2016.
 * @category Vezbanje rada sa nizovima
 *
 */

public class GeneratorDateKolicine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista;
		Integer [] i = {5,45,6,8,78};
		String recenica = "Tokovic Goran LunovoSelo 31203";
		String[] nizStringova;
		List<String> nizReci;
		int[][] matrica = new int[2][3];
		
		System.out.println(Arrays.toString(i));
		
		Arrays.sort(i);//Sortira uneti niz
		System.out.println(Arrays.toString(i));
		lista = Arrays.asList(i);
		
		System.out.println(lista);
		System.out.println("Cetvrti clan je: "+lista.get(2));
		
		System.out.println("\nNiz reci pre sortiranje");
		nizStringova = recenica.split(" ");
		System.out.println(Arrays.toString(nizStringova));
		System.out.println("\nNakon sortiranja");
		Arrays.sort(nizStringova);
		System.out.println(Arrays.toString(nizStringova));
		
		nizReci = Arrays.asList(nizStringova);
		System.out.println(nizReci);
		
		int adresa = Integer.parseInt(nizStringova[0]);
		System.out.println("Adresa je: "+ (adresa+20));
		
		System.out.println("\n\nRad sa matricom");
		System.out.println(Arrays.deepToString(matrica));
		for (int j = 0; j < matrica.length; j++) {
			Arrays.fill(matrica[j], 25);
		}
		
		System.out.println("Ispisivanje popunjene matrice: ");
		System.out.println(Arrays.deepToString(matrica));
		int[] a = new int[7];
		int[] b = new int[10];
		
		Arrays.fill(a, 47);
		Arrays.fill(b, 99);
		
		System.out.println("\n\na: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
		
		/**
		 * Brzi nacin kopiranja reda
		 * prvi paramaetar je niz koji kompiramo,
		 * drugi parametar od koje pozicije se kopira
		 * treci parametar - niz u koji kopiramo sadrzaj
		 * cetvrti parametar, od koje pozicije pocinjemo da upisujemo
		 * peti parametara - koliko elemenata hocemo da kopiramo
		 */
		System.arraycopy(a, 0, b, 0, 3);
		System.out.println("b: "+Arrays.toString(b));
		
		String[] rec1 = {"Goran","Tokovic","Lunovo","Selo"};
		String[] rec2 = {"Moja","mala","nema","mane","Neko","te","ima","Nocas"};
		
		System.out.println("\n\n\n"+Arrays.toString(rec1));
		System.out.println(Arrays.toString(rec2));
		
		System.arraycopy(rec1, 2, rec2, 0, 1);
		System.out.println("nakon kopiranja: " +Arrays.toString(rec2));
		SferaOdBarilijuma[] sb1 = {new SferaOdBarilijuma(), new SferaOdBarilijuma(), new SferaOdBarilijuma()};
		SferaOdBarilijuma[] sb2 = new SferaOdBarilijuma[10];
		for (int j = 0; j < sb2.length; j++) {
			sb2[j] = new SferaOdBarilijuma();
		}
		System.out.println("\n\nStampanje sfera");
		System.out.println("Sfera1 "+Arrays.toString(sb1));
		System.out.println("Sfera2"+Arrays.toString(sb2));
		System.arraycopy(sb1, 0, sb2, 0, sb1.length);
		System.out.println("Sfera2 nakon kopiranja"+Arrays.toString(sb2));
	
	}

}

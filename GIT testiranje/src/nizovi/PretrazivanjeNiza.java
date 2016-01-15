package nizovi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class PretrazivanjeNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random(47);
		int[] a = new int[25];
		for (int i = 0; i < a.length; i++) {
			a[i] = ran.nextInt(100);
		}
		
		System.out.println("Slucajni niz je: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Niz nakon sortiranja: "+Arrays.toString(a));
		
		int r = 89;
		System.out.println("Broj koji trazimo je: "+r);
			int pozicija = Arrays.binarySearch(a, r);
			if(pozicija >= 0){
				System.out.println("Pozicija od "+r+" jeste "+pozicija+", a["+pozicija+"] = "+a[pozicija]);
			}
		
		
	}

}

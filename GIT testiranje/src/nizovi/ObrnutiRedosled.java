package nizovi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ObrnutiRedosled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uporedivtip[] niz  = {new Uporedivtip(12, 46), new Uporedivtip(45, 6), new Uporedivtip(78, 98)};
		System.out.println("Niz pre sortiranja: "+Arrays.toString(niz));
		Arrays.sort(niz, Collections.reverseOrder());
		System.out.println("Sortirani niz u obrnutom poredku: "+Arrays.toString(niz));
		Arrays.sort(niz);
		System.out.println("sortirani niz u rastucem poredku: "+Arrays.toString(niz));
	}

}

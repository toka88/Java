package nizovi;

import java.util.Arrays;
import java.util.Scanner;

import genericki.UlancaniStek;

public class Vezba2 {
	
	public static SferaOdBarilijuma[] prarvljenjeNiza(int n){
		SferaOdBarilijuma[] rezultat = new SferaOdBarilijuma[n];
		for (int i = 0; i < n; i++) {
			rezultat[i] = new SferaOdBarilijuma();
		}
		return rezultat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner upis = new Scanner(System.in);
		System.out.println("Koliko objekata zelite da napravite?");
		SferaOdBarilijuma[] niz = prarvljenjeNiza(upis.nextInt());
		System.out.println(Arrays.toString(niz));
	}

}

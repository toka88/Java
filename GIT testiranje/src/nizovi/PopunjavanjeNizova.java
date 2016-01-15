package nizovi;

import java.util.Arrays;

public class PopunjavanjeNizova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velicina = 6;
		boolean[] a1 = new boolean[velicina];
		byte[] a2 = new byte[velicina];
		char[] a3 = new char[velicina];
		short[] a4 = new short[velicina];
		String[] a9 = new String[velicina];
		
		Arrays.fill(a1, true);	//Popunjava ceo niz sa odgovarajucom vrednosti
		System.out.println(Arrays.toString(a1));
		
		Arrays.fill(a2, (byte)11);
		System.out.println(Arrays.toString(a2));
		
		Arrays.fill(a3, 'G');
		System.out.println(Arrays.toString(a3));
		
		Arrays.fill(a9, "Goran");
		System.out.println(Arrays.toString(a9));
		
		//Manipulisanje opsezima
		Arrays.fill(a9, 3, 5, "Tokovic");
		System.out.println(Arrays.toString(a9));
		
	}

}

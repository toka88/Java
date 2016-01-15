package nizovi;

import java.util.Arrays;

public class PoredjenjeNizova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		Arrays.fill(a1, 47);
		Arrays.fill(a2, 47);
		System.out.println("Da li su nizovi jednaki: " + Arrays.equals(a1, a2));
		
		int[] a3 = new int[11];
		Arrays.fill(a3, 47);
		System.out.println("Da li su nizovi jednaki: "+Arrays.equals(a1, a3));
		
		String[] s1 = new String[4];
		Arrays.fill(s1, "Cao");
		String[] s2 = {"Cao", "Cao", "Cao", "Cao"};
		System.out.println("Da li su stringovi jednaki "+Arrays.equals(s1, s2));
	}

}

package nizovi;

import java.util.Arrays;

/**
 * 
 * @author Goran Tokovic
 * 
 * Pravljenje visedimenzionalniv nizova
 *
 */
public class VisedimenzionalniNizoviProstih {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{1,2,3},
				{4,5,6},
		};
		
		System.out.println(Arrays.deepToString(a));	//Konvertuje matricu u string
		System.out.println(a[0][2]);
	}

}

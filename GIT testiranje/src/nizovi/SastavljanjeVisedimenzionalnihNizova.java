package nizovi;

import java.util.Arrays;

public class SastavljanjeVisedimenzionalnihNizova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] a;
		a = new Integer[3][];
		for(int i = 0; i < a.length ; i++){
			a[i] = new Integer[3];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i*j;
			}
		}
		System.out.println(Arrays.deepToString(a));
	}

}

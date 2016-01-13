package nizovi;

import java.util.Arrays;

public class VisedimNizOmotaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[][] a1 = {{1,2,3},{4,5,6}};
		Double[][][] a2 = {{{1.1,2.2},{3.3,4.4}},{{5.5,6.6},{7.7,8.8}},{{9.9,1.2},{1.3,1.4}}};
		String[][] a3 = {
				{"The","Quick","Sly","Fox"},
				{"Jumper","Over"},
				{"The", "Lazzy","Brown","Goran","Tokovic"}};
		
		System.out.println(Arrays.deepToString(a1));
		System.out.println(Arrays.deepToString(a2));
		System.out.println(Arrays.deepToString(a3));
		}
	}



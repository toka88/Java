package nizovi;

import java.util.*;

class SferaOdBarilijuma{
	private static long brojac;
	private final long id = brojac++;
	@Override
	public String toString(){
		return "Sfera "+id;
	}
}

public class PoredjenjeSKontejnerima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SferaOdBarilijuma[] sfera = new SferaOdBarilijuma[10];	//napravljeno 10 referenci na ovaj tip objekta
		for (int i = 0; i < 5; i++) {
			sfera[i] = new SferaOdBarilijuma();
		}
		System.out.println(Arrays.toString(sfera));
		System.out.println(sfera[4]);
		
		List<SferaOdBarilijuma> listaSfera = new ArrayList<SferaOdBarilijuma>();
		for (int i = 0; i < 5; i++) {
			listaSfera.add(new SferaOdBarilijuma());
		}
		System.out.println(listaSfera);
		System.out.println(listaSfera.get(4));
		
		int[] celiBrojevi = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(celiBrojevi));
		System.out.println(celiBrojevi[4]);
		
		List<Integer> listaCelihBrojeva = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		listaCelihBrojeva.add(97);
		System.out.println(listaCelihBrojeva);
		System.out.println(listaCelihBrojeva.get(4));
	}

}

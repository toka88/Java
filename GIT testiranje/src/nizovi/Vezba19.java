package nizovi;

import java.util.Arrays;

class Goran implements Comparable<Goran>{
	int broj;
	
	/**
	 * Konstruktor sa je dnim parametrom
	 * @param broj - setuje vrednost polja broj
	 */
	public Goran(int broj) {
		// TODO Auto-generated constructor stub
		this.broj = broj;
	}
	
	@Override
	public String toString(){
		return "Goran "+broj;
	}
	
	
	/**
	 * implementirana metoda compareTo interfejsa Comparable
	 */
	public int compareTo(Goran o){
		if( this.broj == o.broj){
			return 0;
		}else if(this.broj<o.broj){
			return -1;
		}else{
			return 1;
		}
			
	}
}

public class Vezba19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goran[] g1 = new Goran[5];
		for (int i = 0; i < g1.length; i++) {
			g1[i] = new Goran(12);
		}
		
		Goran[] g2 = new Goran[5];
		for (int i = 0; i < g2.length; i++) {
			g2[i] = new Goran(12);
		}
		Goran[] niz = {new Goran(12), new Goran(4), new Goran(66), new Goran(2), new Goran(32)};
		System.out.println("Niz pre sortiranja: "+Arrays.toString(niz));
		Arrays.sort(niz);
		System.out.println("Niz nakon sortiranja: "+Arrays.toString(niz));
		
		System.out.println("Da li su nizovi jednaki: "+Arrays.equals(g1, g2));

	}

}

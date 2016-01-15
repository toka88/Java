package kontejneri;

import java.util.*;

class AdresaStringa{
	private String s;
	public AdresaStringa(String s){
		this.s =s;
	}
	
	@Override
	public String toString(){
		return super.toString() + " "+ s; 
	}
}


public class Popunjavanjelista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Collections.nCopies()-kopira objekaat na odgovarajuci broj mesta, moze da pravi niz
		 */
		List<AdresaStringa> list = new ArrayList<>(Collections.nCopies(4, new AdresaStringa("Zdravo")));
		System.out.println(list);
		
		/**
		 * za razliku od prethodne moze samo da popuni mesta u listi koja su ranije definisana
		 */
		Collections.fill(list, new AdresaStringa("svima!"));//Popunjavanje liste referencama koje pokazuju na isti objekat
		System.out.println(list);
	}

}

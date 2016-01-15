package kontejneri;

import java.util.*;


import net.mindview.util.Generator;
import net.mindview.util.PodaciKontejnera;

class Vlada implements Generator<String>{
	String[] foundation = ("Moja mala nema mane niko nema tako lepe dragane").split(" ");
	private int index;
	/**
	 * Realizacija metode iz interfejsa Generato
	 */
	public String sledeci(){
		return foundation[index];
	}
}

public class PodaciZaTestKontejnera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new LinkedHashSet<String>(new PodaciKontejnera<String>(new Vlada(), 8));
		//Koriscenje pomocne metode	
		set.addAll(PodaciKontejnera.list(new Vlada(), 8));
		System.out.println(set);
	}

}

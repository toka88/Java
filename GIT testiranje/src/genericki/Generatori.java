package genericki;

import genericki.kafa.*;
import java.util.*;
import net.mindview.util.*;

//Generator je genericki inteerfejs koji vraca jedan objekat naasumicno

public class Generatori {
	public static <T> Collection<T> popuni(Collection<T> kntnr, Generator<T> gen, int n){
		for(int i = 0; i<n; i++){
			kntnr.add(gen.sledeci());
		}	
		return kntnr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Kafa> kafa = popuni(new ArrayList<Kafa>(), new GeneratorKafe(), 4);
		for (Kafa c : kafa) {
			System.out.println(c);
		}
		
	}

}

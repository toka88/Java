package nizovi;

import java.util.Arrays;
import java.util.Comparator;

//Kada hocemo na vise nacina da izvrsimo sortiranje onda implementiramo na ovaj nacin
//napravimo novu klasu koja implementria inter
class ComparatorZaUporediviTip implements Comparator<Uporedivtip>{
	public int compare(Uporedivtip o1, Uporedivtip o2){
		return (o1.i < o2.i ? -1 : (o1.i == o2.i ? 0: 1));
	}
}

public class PrimerZaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uporedivtip[] a = {new Uporedivtip(12, 45), new Uporedivtip(56, 54), new Uporedivtip(8, 87), new Uporedivtip(65, 77)};
		System.out.println("Pre poredjenja: "+Arrays.toString(a));
		Arrays.sort(a, new ComparatorZaUporediviTip());
		System.out.println("Nakon sortiranja: "+Arrays.toString(a));
	}

}

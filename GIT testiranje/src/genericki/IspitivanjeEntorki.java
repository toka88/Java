package genericki;
import net.mindview.util.*;

class Amfibija{}
class Vozilo{}

public class IspitivanjeEntorki {
	
	static Dvojka<String, Integer> f(){
		//Automatsko pakovanje pretvara u String i integer
		return new Dvojka<String, Integer>("zdravo", 47);
	}
	
	static Trojka<Amfibija, String , Integer> g(){
		return new Trojka<Amfibija, String, Integer>(new Amfibija(), "zdravo", 47);
	}
	
	static Cetvorka<Vozilo, Amfibija, String, Integer> h(){
		return new Cetvorka<Vozilo, Amfibija, String, Integer>(new Vozilo(), new Amfibija(), "zdravo", 47);
	}
	
	static Petorka<Vozilo, Amfibija, String, Integer, Double> k(){
		return new Petorka<Vozilo, Amfibija, String, Integer, Double>(new Vozilo(), new Amfibija(), "zdravo", 47, 11.1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dvojka<String, Integer> iesi = f();
		System.out.println(iesi);
		// iesi.prvi = "tamo"; -- greska u prevodjenju;: final
		System.out.println(g());
		System.out.println(h());
		System.out.println(k());
	}

}

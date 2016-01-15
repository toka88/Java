package genericki;

import java.util.ArrayList;
import java.util.List;

public class GenerickiArgumentiPromenjivuhDuzina {
	//Ova metoda mora vratiti rezultati tipa liste
	public static <T> List<T> napraviListu(T... args){
		List<T> rezultat = new ArrayList<T>();
		for (T stavka : args) {
			rezultat.add(stavka);
		}
		return rezultat;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = napraviListu("A");
		System.out.println(ls);
		ls = napraviListu("A", "B", "C");
		System.out.println(ls);
		ls = napraviListu("TokovicGoranLunovoSelo31203".split(""));
		System.out.println(ls);
	}

}

package genericki;

import java.util.ArrayList;
import java.util.Random;

public class NasumicnaLista<T> {
	
	private ArrayList<T> skladiste = new ArrayList<T>();
	private Random slucajan = new Random(47);
	public void  add(T stavka) {skladiste.add(stavka);}
	public T select(){
		return skladiste.select(slucajan.nextInt(skladiste.size()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

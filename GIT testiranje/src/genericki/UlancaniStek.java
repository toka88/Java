//Stek realizovan pomocu unutrasnje ulancane strukture



package genericki;

public class UlancaniStek<T> {
	private static class Cvor<U>{
		U stavka;
		Cvor<U> sledeca;
		
		//Konstruktor bez parametara
		Cvor() {
			// TODO Auto-generated constructor stub
			stavka = null;
			sledeca = null;
		}
		
		//Konstruktor sa parametrima
		Cvor(U stavka, Cvor<U> sledeca){
			this.stavka = stavka;
			this.sledeca = sledeca;
		}
		boolean kraj(){
			return stavka == null && sledeca == null;
		}
	}
	
	private Cvor<T> vrh = new Cvor<T>();	//Oznaka kraja
	
	public void staviNa(T stavka){
		vrh = new Cvor<T>(stavka, vrh);
	}
	
	public T skiniSa(){
		T rezultat = vrh.stavka;
		if(!vrh.kraj())
			vrh = vrh.sledeca;
		return rezultat;
	}
	
	public static void main(String[] args){
		UlancaniStek<String> uss = new UlancaniStek<String>();
		for(String s : "Nekoliko reci u recenici".split(" "))
			uss.staviNa(s);
		String s;
		while((s = uss.skiniSa()) != null)
			System.out.println(s);
	}
}

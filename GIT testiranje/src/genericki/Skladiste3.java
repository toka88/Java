package genericki;

public class Skladiste3<T> {
	private T a;
	public Skladiste3(T a){this.a = a;}
	public void set(T a){this.a = a;}
	public T get(){return a;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Skladiste3<Automobil> bmw = new Skladiste3<Automobil>(new Automobil());
		Automobil mercedes = bmw.get();		// Konverzija tipa nije potrebna
		// Pokusaj da se stavi na GIT
	}

}

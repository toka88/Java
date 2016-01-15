//Generise razlicite tipove kafe
package genericki.kafa;

import java.util.*;

import net.mindview.util.*;

//Implementacijom Iterable se omogucava prolazk foreach perljom
public class GeneratorKafe implements Generator<Kafa>, Iterable<Kafa>{

	private Class[] tipovi = { SMlekom.class, Moka.class, Cappuccino.class, Americano.class, Kratka.class,};
	private static Random slucajan  = new Random(47);
	public GeneratorKafe(){
		
	}
	//Za iteraciju
	private int velicina = 0;
	public GeneratorKafe(int vel){
		velicina = vel;
	}
	public Kafa sledeci(){
		try{
			return (Kafa) tipovi[slucajan.nextInt(tipovi.length)].newInstance();
			//U vreme izvrsavanja prijavi greske programera
		}catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	class IteratorKafa implements Iterator<Kafa>{
		int broj = velicina;
		public boolean hasNext() { return broj > 0;}
		public Kafa next(){
			broj--;
			return GeneratorKafe.this.sledeci();
		}
		public void ukloni(){
			throw new UnsupportedOperationException();
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

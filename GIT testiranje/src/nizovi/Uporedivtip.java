package nizovi;

import java.util.*;

import net.mindview.util.Generator;

//Mora se navesti u uglastim zagradama o kom tipu se radi
public class Uporedivtip implements Comparable<Uporedivtip>{
	int i;
	int j;
	private static int broj = 1;
	
	public Uporedivtip(int i , int j){
		this.i = i;
		this.j = j;		
	}

	@Override
	public String toString(){
		String rezultat = "[i = "+i+", j = "+j+"]";
		if(broj++ % 3 == 0){
			rezultat += "\n";
		}
		return rezultat;
	}
	
	
	public int compareTo(Uporedivtip rv){
		return (this.i <rv.i ? -1 : (i == rv.i ? 0:1));
	}
	
	private static Random r = new Random(47);
	public static Generator<Uporedivtip> generator(){
		return new Generator<Uporedivtip>() {
			public Uporedivtip sledeci(){
				return new Uporedivtip(r.nextInt(100), r.nextInt(100));
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uporedivtip[] a = G
	}

}

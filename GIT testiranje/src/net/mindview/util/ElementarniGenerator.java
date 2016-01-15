package net.mindview.util;
/**
 * 
 * @author Tokovic Goran
 * Automatski pravi novi objekat klase koju prosledjujemo kao argunent, npr. Goran.class
 *
 */

public class ElementarniGenerator<T> implements Generator<T> {
	private Class<T> tip;
	public ElementarniGenerator(Class<T> tip){this.tip = tip;}
	public T sledeci(){
		try{
			//Predpostavlja da je tip glavne klase
			return tip.newInstance();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	//Pravi podrazumevani generator kada joj se da leksema tipa:
	public static <T> Generator<T> napravi(Class<T> tip){
		return new ElementarniGenerator<T>(tip);
	}
}

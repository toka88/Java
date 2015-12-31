package genericki;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

//Izuzetak koji sam ja definisao
class NeMozeSedELITIsAnULOMeXCEPTION extends Exception{
	static{
		System.out.println("NeZovuSeIsto exception");
	}
}

class MojIzuzetak extends Exception{
	static{
		System.out.println("Desilo se izbacivanje izuzetka");
	}
}

public class GenerickaMetoda {
	
	public static <T> boolean  poredjenje(T a, T b){
	 
		if(a.equals(b)){
			
			return true;
		}else{
			
			return false;
		}
					
	}
	
	public static int sabiranje(int a, int b) throws MojIzuzetak{
		if(a ==3){
			System.out.println("Ispisivanje u metodi");
			throw new MojIzuzetak();
		}else
			return a+b;
	}
	
	//Izbacuje izuzetak ako se deli sa nulom
	public static double deljenje(int a, int b)throws NeMozeSedELITIsAnULOMeXCEPTION{
		
		if(b==0){
			System.out.println("Ne moze se deliti sa nulom!!!");
			throw new NeMozeSedELITIsAnULOMeXCEPTION();
		}else{
			return (double) a/b;
		}
	}
	 
	public static int inkrementovanje(int a){
		return ++a;
	}

	public static void main(String[] args) {
		
		int a = 15;
		int b = 0;
		
		System.out.println("Vrednos varijable A pre inkrementovanja: "+a);
		a = inkrementovanje(a);	//Mora se vratiti pa dodeliti vrednost
		System.out.println("Vrednost A nakon inkrementovanja: "+a);
		
		if(poredjenje(a, b)){
			System.out.println("Jednaki su");
		}else{
			System.out.println("Nisu jednaki");
		}

		try {
			deljenje(a, b);
		} catch (NeMozeSedELITIsAnULOMeXCEPTION e) {
			// TODO: handle exception
			System.out.println("Uhvatio sam izuzetak da si delio sa nulom");
		}
		
		
		try {
			int rezultat = sabiranje(a, b);
			System.out.println("Rezultat sabiranja je: "+rezultat);
		} catch (MojIzuzetak e) {
			// TODO: handle exception
			System.out.println("Uvhatio sas MojIzuzetak: ");
		}	

	}

}

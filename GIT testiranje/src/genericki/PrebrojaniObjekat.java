package genericki;

public class PrebrojaniObjekat {
	private static long brojac = 0;	// Za svaku klasu je zajednicka vrednost	
	private final long id = brojac++; //Za svaku objekaat ce biti razlicito, prvi ce imati vrednost 0 a svaki sledeci vrednost uvecanu za jedan
	public long id(){return id;}	//Vraca vrednost ID-a
	@Override
	public String toString(){
		return "PrebrojaniObjekat" + id;
	}
}

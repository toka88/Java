package genericki.kafa;

public class Kafa {
	private static long brojac = 0;
	private final long id = brojac++;
	@Override
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

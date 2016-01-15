package genericki;

public class Vezba10 {

	public <T> void f(T x, Integer i){
		System.out.println("Rb: " + i + " " +x.getClass().getSimpleName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vezba10 v = new Vezba10();
		v.f("Nemanja", 20);
		v.f('c', 20);
		v.f(12.d, 23);
		v.f(12f, 56);
		v.f(v, 56);
	}

}

package genericki;

public class Vezba9 {
	
	public <T1,T2,T3> void f(T1 x, T2 y, T3 z){
		System.out.println(x.getClass().getSimpleName()+" "+y.getClass().getSimpleName()+" "+z.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vezba9 v = new Vezba9();
		v.f(1, 1.2f, "Goran");
		v.f("nemanja", v, 2.12d);
		v.f('s', new GenerickeMetode(), "Nikola");
	}

}

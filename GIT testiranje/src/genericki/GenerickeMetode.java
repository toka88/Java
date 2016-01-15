package genericki;

public class GenerickeMetode {
	
	public <T> void f(T x){
		System.out.println(x.getClass().getSimpleName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerickeMetode gm = new GenerickeMetode();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}

}

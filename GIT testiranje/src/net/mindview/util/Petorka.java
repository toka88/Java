package net.mindview.util;

public class Petorka<A,B,C,D,E> extends Cetvorka<A, B, C, D> {

	private final E peti;
	public Petorka(A a, B b, C c, D d, E e) {
		// TODO Auto-generated constructor stub
		super(a, b, c, d);
		this.peti = e;
	}
	
	@Override
	public String toString(){
		return "(" + prvi + ", " + drugi + ", " + treci + ", " + cetvrti + ", " + peti + ")";
	}

}

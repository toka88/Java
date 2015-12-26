package net.mindview.util;

public class Trojka<A,B,C> extends Dvojka<A, B> {
	public final C treci;
	public Trojka(A a,B b,C c) {
		// TODO Auto-generated constructor stub
		super(a,b);
		this.treci = c;
	}
	@Override
	public String toString(){
		return "(" + prvi + ", " + drugi + ", " + treci  + ")";
	}
}

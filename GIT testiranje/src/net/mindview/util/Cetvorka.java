package net.mindview.util;

public class Cetvorka<A,B,C,D> extends Trojka<A, B, C> {
	public final D cetvrti;
	public Cetvorka(A a,B b,C c,D d) {
		// TODO Auto-generated constructor stub
		super(a,b,c);
		this.cetvrti = d;
	}
	@Override
	public String toString(){
		return "(" + prvi + ", " + drugi + ", " + treci  + ", " + cetvrti + ")";
	} 
}

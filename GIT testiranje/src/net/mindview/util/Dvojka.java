package net.mindview.util;

public class Dvojka<A,B> {
	public final A prvi;
	public final B drugi;
	public Dvojka(A a, B b){this.prvi = a; this.drugi = b;}
	@Override
	public String toString(){
		return "(" + prvi+ ","+drugi+")";
	}
}

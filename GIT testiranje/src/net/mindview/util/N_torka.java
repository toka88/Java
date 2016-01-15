package net.mindview.util;

public class N_torka {
	
	public static <A,B> Dvojka<A,B> n_torka(A a, B b){
		return new Dvojka<A, B>(a, b);
	}
	
	public static <A,B,C> Trojka<A, B, C> n_torka(A a, B b, C c){
		return new Trojka<A, B, C>(a, b, c);
	}
	
	public static <A,B,C,D> Cetvorka<A, B, C, D> n_torka(A a, B b, C c, D d){
		return new Cetvorka<A, B, C, D>(a, b, c, d);
	}
	
	public static <A,B,C,D,E> Petorka<A, B, C, D, E> n_torka(A a, B b, C c, D d, E e){
		return new Petorka<A, B, C, D, E>(a, b, c, d, e);
	}
}

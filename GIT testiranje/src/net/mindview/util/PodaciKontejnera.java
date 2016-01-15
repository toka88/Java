package net.mindview.util;

import java.util.ArrayList;

public class PodaciKontejnera<T> extends ArrayList<T> {
	public PodaciKontejnera(Generator<T> gen, int kolicina){
		for (int i = 0; i < kolicina; i++) {
			add(gen.sledeci());
		}
	}
	//Genericka pomocna metoda
	public static <T> PodaciKontejnera<T> list(Generator<T> gen, int kolicina){
		return new PodaciKontejnera<>(gen, kolicina);
	}
}

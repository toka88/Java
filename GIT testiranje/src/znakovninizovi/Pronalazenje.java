package znakovninizovi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pronalazenje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		slovo se pojavljuje jednom ili vise puta
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of linnet's wings");
		while(m.find())	//skace sa reci na rec redosledom kojim su napisane
			System.out.println(m.group()+" ");
		System.out.println();
		int i = 0;
		while(m.find(i)){	//Krece u pretragu tacno od pozicije i
			System.out.println(m.group()+" "+i);
			i++;
		}
	}

}

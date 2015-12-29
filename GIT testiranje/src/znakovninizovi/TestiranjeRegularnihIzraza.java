package znakovninizovi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestiranjeRegularnihIzraza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length <2){
			System.out.println("Upotreba:\njava TestiranjeRegularnihIzraza "+"nizznakova regularniIzraz+");
			System.exit(0);
		}
		
		System.out.println("Ulaz \""+args[0]+"\"");
		for (String string : args) {
			System.out.println("Regularan izraz: \""+string+"\"");
			Pattern p = Pattern.compile(string);
			Matcher m = p.matcher(args[0]);
			while(m.find()){
				System.out.println("Podudara se \""+m.group()+ "\" na mestima "+m.start()+"-"+(m.end()-1));
			}
		}
	}

}

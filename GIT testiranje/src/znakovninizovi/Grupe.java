package znakovninizovi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grupe {
	static public final String PESMA = 
		"Thas brilling, and the slithy toves\n"+
		"Did gyre and gimble in the wabe.\n"+
		"All mimsy were the borogoves,\n"+
		"and mome raths outgrabe.\n"+
		"Beware and Jabberwock, my son,\n"+
		"The jaws that bite, the claws that catch.\n"+
		"Beware the Jubjub bird, and  shun\n"+
		"The frumoios Bandersnatch.";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(PESMA);
		while(m.find()){
			for(int j = 0; j<=m.groupCount();j++)
				System.out.print("["+m.group(j)+"]");
			System.out.println();
			
		}
	}

}

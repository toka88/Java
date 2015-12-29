package znakovninizovi;

import java.awt.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.mindview.util.*;

public class JGrep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length < 2){
			System.out.println("Upotreba: java JGrep regiz datoteke");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1]);
		//Iteracija kroz redove ulazne datoteke
		int index = 0;
		Matcher m = p.matcher("");
		for(String red: new  TextFile(args[0])){
			m.reset(red);
			while(m.find())
				System.out.println(index++ + ": "+m.group()+": "+m.start());
		}
	}

}

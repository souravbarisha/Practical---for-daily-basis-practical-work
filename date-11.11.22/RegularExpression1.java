package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
	public static void main(String[] args) {
		// three way to represent pattern & matcher
		
		// 1st wat
		Pattern p = Pattern.compile(".a"); // single dot represent single character
		// compile regular expression into pattern
		Matcher m = p.matcher("ma"); //.a dot represent single char m
		boolean b = m.matches(); // output for b // true
		
		// 2nd way
		boolean bb = Pattern.compile("..m").matcher("amm").matches(); // false/true output for bb
		
		// 3rd way
		boolean b1 = Pattern.matches(".a","ta"); // true
		System.out.println(b+" "+bb+" "+b1);
	}
}

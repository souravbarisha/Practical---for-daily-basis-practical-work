package exceptionHandling;

import java.util.ArrayList;
import java.util.Arrays;

class languageCheckException extends Exception {
	public languageCheckException(String str) {
		super(str);
	}
}
public class CustomException2 {
	ArrayList<String>language = new ArrayList<String>
	(Arrays.asList("english","hindi","bengali","tamil"));
	public void check(String a) throws languageCheckException{
		if(language.contains(a)) {
			throw new languageCheckException(a+"language already exist");
		}
		else
			language.add(a);
		System.out.println("language added in list + language");
	}
public static void main(String[] args) throws languageCheckException {
	CustomException2 c = new CustomException2();
	c.check("telegu");
    c.check("tamil");
}
}

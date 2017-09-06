package week6Day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String pattern="[a-zA-Z0-9]+@[a-zA-Z]{3,10}.[a-zA-z]{3}";
		String pattern="[\\d]{4}\\s[\\d]{4}\\s[\\d]{4}\\s[\\d]{4}";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("1234 4567 7890 0123");
		System.out.println(match.matches());

	}

}

package week6Day2;

import org.testng.annotations.Test;

public class Reverse {
	
	
	@Test
	public void reversestring(){
	
		int i;
		String a ="Reverse";
		int max = a.length();
		char[] stringarray = a.toCharArray();
		String temp = "";
		
		for (i = max-1; i>=0; i--)
		{
			temp = temp + stringarray[i];
		}
		
		System.out.println(temp);
	}
	

}

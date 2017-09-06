package week6Day2;

import org.testng.annotations.Test;

public class NextString {

@Test
	public void bharathcase(){
		int i,j=0,k;

		String bharath = "Test";
		int max = bharath.length();
		char[] geja = bharath.toCharArray();
		char[] babu = new char[max];
		for (i=0;i<max;i++)
		{
			j=(int)geja[i];   
			j++;
           babu[i]= (char)j;
           System.out.println(babu[i]);
        		   }

	}
	}

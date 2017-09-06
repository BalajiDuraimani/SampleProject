package homeWork;

import java.util.Scanner;

public class Uniquestring {

	public static void main(String[] args) {

		
		
		
		Scanner i = new Scanner(System.in);
		String input=i.next();
	
		String uniquestring = "";

		int loopbreaker;		
		
	int m= input.length();
		int j,k;
		
		for (j = 0; j < m ; j++) {
		loopbreaker = 0;
			for (k = 0; k < uniquestring.length(); k++) {
				if(input.charAt(j) == uniquestring.charAt(k))
				{
					
					loopbreaker++;
					
				}
			}
			
				if (loopbreaker == 0){
					uniquestring = uniquestring + input.charAt(j);
						
				}
							
								
			}
		System.out.println(uniquestring);

	}

}

package week2day2;

import java.util.Scanner;



public class HomeWorkMonday {

	public static void main(String[] args) {



		Scanner newval = new Scanner(System.in);
		int a = newval.nextInt();
		/*Scanner newval1 = new Scanner(System.in);
		int b = newval1.nextInt();
*/
		

if (a % 100 == 0)
	{
	if(a % 400 == 0)
	{
		System.out.println(a +"is an Leap year");
	}
	else
	{
		System.out.println(a +"is not an Leap year");
	}
	}
else if (a%4 ==0)
{
	System.out.println(a +"is an Leap year");
}

else 
	{
	System.out.println(a +"is not an Leap year");
	}
newval.close();
}
}



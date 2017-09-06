package pascalsstriangle;

import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;


public class Pasal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		
		 int rows, i, k, number=1, j;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Number of Rows : ");
			rows = input.nextInt();
			
			for(i=0;i<rows;i++)
			{
				for(k=rows; k>i; k--)
				{
					System.out.print(" ");
				}
	            number = 1;
				for(j=0;j<=i;j++)
				{
					 System.out.print(number+ " ");
	                 number = number * (i - j) / (j + 1);
				}
				System.out.println();
		
		
		
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	Scanner efg = new Scanner(System.in);
		int h = efg.nextInt();
		int j,i,k;
		
		


		//rows, rowcount, columncount

		for(i=1;i<h;i++)
		{
			for(j= h-i;j>=1;j--)
			{
				System.out.println(" ");
			}
			for (k=1;k<=i;k++)
			{
				System.out.println("*"+" ");
			}
			
			//System.out.println('\n');

		}		




		

	}

}

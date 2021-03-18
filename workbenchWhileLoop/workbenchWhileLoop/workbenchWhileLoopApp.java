/* Description: Algorithm Workbench Chapter 4: while loops 7-10
 * 
 * Created by: Sam Ross
 * Date:03/18/2021
 * 
 * I really wanted to do all 4 problems in the same file so I'm going to use methods to split them up.
 * 
 * 7.  Convert the while loop to a do-while loop.     -Located in method loop7();
 * 8.  Convert the do-while loop to a while loop.     -Located in method loop8();  * Having errors with this one...
 * 9.  Convert the while loop to a for loop.          -Located in method loop9();
 * 10. Convert the for loop to a while loop.          -Located in method loop10();
 * 
 */

package workbenchWhileLoop;



// Imports
import java.util.Scanner;
//import javax.swing.JOptionPane;


public class workbenchWhileLoopApp 
{

	// Workbench problem #7
	public static void loop7()
	{
		
		// Define variables
		
		Scanner keyboard = new Scanner(System.in);
		int x=1;
		
		// Loop
		
		do
		{
			System.out.print("Enter a number: ");
			x = keyboard.nextInt();
		}while(x > 0);
		
		keyboard.close();
		
		// End of method		
	}
	
	// Workbench problem #8
	public static void loop8()
	{
		
		// Define variables
		
		Scanner keyboard = new Scanner(System.in);
		String input;
		char sure = 'N';
		
		// Loop
		
		while(sure != 'Y' && sure == 'N')
		{
			System.out.print("Are you suyre you want to quit? ");
			input = keyboard.next();
			sure = input.charAt(0);
		}
		
		keyboard.close();
		
		// End of method			
	}
		
	// Workbench problem #9
	public static void loop9()
	{
		
		// Loop
		
		for(int count=0;count<50;count++)
		{
			System.out.println("count is "+ count);
		}
		
		// End of method		
	}
	
	// Workbench problem #10
	public static void loop10()
	{
		
		// Define variables
		
		int x=50;
		
		// Loop
		
		while(x>0)
		{
			System.out.println(x + " seconds to go.");
			x--;
		}
		
		// End of method		
	}
	
	// Main method
	public static void main(String[] args) 
	{
		
		// Run workbench problems 7 through 10
		
		System.out.println("Problem #7:");
		loop7();
		//System.out.println("Problem #8:");
		//loop8();
		System.out.println("Problem #9:");
		loop9();
		System.out.println("Problem #10:");
		loop10();

	}

}

/* Description: Write a program that asks the user for a positive nonzero integer value.
 * The program should use a loop to get the sum of all the integers from 1 up to the number entered.
 * For example, if the user enters 50, the loop will find the sum of 1,2,3,4,...50.
 * 
 * Created by: Sam Ross
 * Date: 3/23/21
 */



// Imports
import javax.swing.JOptionPane;


public class SumOfNumbersApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		int sum = 0, loop = 0;
		
		
		// User input
		
		do 
		{		
			loop = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a positive nonzero integer:", "Sum of Numbers", JOptionPane.QUESTION_MESSAGE));
			if(loop<=0)
				JOptionPane.showMessageDialog(null,"Please enter only a positive nonzero integer.", "Sum of Numbers - ERROR", JOptionPane.ERROR_MESSAGE);
		}while(loop<=0);
		
		
		// Main code
		
		for(int i = 1; i<=loop; i++)
		{
			sum = sum + i;
			System.out.println(sum);  // For debugging
		}
		
		
		// Output
		
		JOptionPane.showMessageDialog(null, "The sum of numbers is: " + sum, "Sum of Numbers", JOptionPane.INFORMATION_MESSAGE);

	}

}

/* Description: Retail Price Calculator
 * Write a program that asks the user to enter an item's wholesale cost and its markup percentage.
 * It should then display the item's retail price. For example:
 * 	- If an item's wholesale cost is 5.00 and its markup percentage is 100 percent, the the item's retail price is 10.00.
 * 	- If an item's wholesale cost is 5.00 and its markup percentage is 50 percent, then the item's retail price is 7.50.
 * 
 * The program should have a method named "calculatedRetail" that receives the wholesale cost and the markup percentage as arguments, and returns the retail price of the item.
 * 
 * Created by: Sam Ross
 * Date: 4/7/21
 * 
 */

// Imports

import javax.swing.JOptionPane;


public class RetailPriceCalculatorApp 
{

	public static double calculateRetail(double price, double markup)
	{
		double retailPrice;
		
		retailPrice = price*(1+markup);
		
		return retailPrice;
	}
	
	public static void main(String[] args) 
	{

		// Define variables
		
		double wholesale,output,percentage;
		String outputMsg;
		
		// User input
		
		wholesale = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the wholesale value:", "Retail Price Calculator", JOptionPane.QUESTION_MESSAGE));
		percentage = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter item percentage markup (0.6 for 60%):", "Retail Price Calculator", JOptionPane.QUESTION_MESSAGE));
		
		
		// Call method
		
		output = calculateRetail(wholesale,percentage);
		
		
		// Output answer
		
		outputMsg = String.format("The marked up retail price is $%.2f", output);
		JOptionPane.showMessageDialog(null, outputMsg, "Retail Price Calculator", JOptionPane.INFORMATION_MESSAGE);
		

	}

}

/* Description: Programming challenge chapter 3 #8: Software Sales
 * A software company sells a package that retails for $99. Quantity discounts are given according to the following table:
 * +========================+
 * |  Quantity   | Discount |
 * |    10-19    |   20%    |
 * |    20-49    |   30%    |
 * |    50-99    |   40%    |
 * | 100 or more |   50%    |
 * +========================+
 * Write a program that asks the user to enter the number of packages purchased.
 * The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.
 * 
 * Created by: Sam Ross
 */

//imports
import javax.swing.JOptionPane;



public class softwareSalesApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		String strAmount, message;
		int amount, discount;
		double total, saved;
		final double PRICE = 99;
		
		
		// User input
		
		strAmount = JOptionPane.showInputDialog(null, "Enter number of packages purchased:", "Software Sales", JOptionPane.QUESTION_MESSAGE);
		amount = Integer.parseInt(strAmount);
		
		// Main code
		
		if ((amount >= 10) && (amount <= 19))
			discount = 20;
		else if ((amount >= 20) && (amount <= 49))
			discount = 30;
		else if ((amount >= 50) && (amount <= 99))
			discount = 40;
		else if (amount >= 100)
			discount = 50;
		else
			discount = 0;
		
		total = amount * (PRICE - (PRICE * discount / 100));
		saved = (amount * PRICE) - total;
		
		
		// Output
		
		message = String.format("Purchased:  %2d%nDiscount:  %6d%%%nYou saved:   $%,.2f%n%nTotal:              $%,.2f", amount, discount, saved, total);
		JOptionPane.showMessageDialog(null, message, "Software Sales", JOptionPane.INFORMATION_MESSAGE);
		

	}

}

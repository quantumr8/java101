/* Description: Programming challenge chapter 8 #9: Shipping Charges
 * The Fast Freight Shipping Company charges the following rates:
 * +=======================================+
 * |  Weight of Package  | Rate per 500 mi |
 * |  2 pounds or less   |      $1.10      |
 * |  >= 2 lb < 6 lb     |      $2.20      |
 * |  >= 6 lb < 10 lb    |      $3.70      |
 * |       >= 10         |      $3.80      |
 * +=======================================+
 * The shipping charges per 500 miles are not prorated. For example, if a 2-pound package is shipped 550 miles, the charges would be $2.20.
 * Write a program that asks the user to enter the weight of the package and then displays the shipping charges.
 * 
 * Created by: Sam Ross
 */

package shippingCharges;


// Imports

import javax.swing.JOptionPane;

public class shippingChargesApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		String strWeight, message;
		double weight, rate;
		final double RATE_1 = 1.10;
		final double RATE_2 = 2.20;
		final double RATE_3 = 3.70;
		final double RATE_4 = 3.80;
		
		
		// User input
		
		strWeight = JOptionPane.showInputDialog(null, "Enter weight of package in pounds:", "Shipping Charges", JOptionPane.QUESTION_MESSAGE);
		weight = Double.parseDouble(strWeight);
		
		
		// Main code
		
		if (weight < 2)
			rate = RATE_1;
		else if ((weight > 2) && (weight <= 6))
			rate = RATE_2;
		else if ((weight > 6) && (weight <= 10))
			rate = RATE_3;
		else
			rate = RATE_4;
		
		
		// Output
		
		message = String.format("Weight entered:  %.2f pound(s)%nYour rate is:         $%.2f", weight, rate);
		JOptionPane.showMessageDialog(null, message, "Shipping Charges", JOptionPane.INFORMATION_MESSAGE);

	}

}

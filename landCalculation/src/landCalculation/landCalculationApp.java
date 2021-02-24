package landCalculation;
/**
 * Description: This program calculates the number of acres in a tract of land with 389,767 square feet.
 * 1 acre = 43,560 sq. ft.
 *
 * Creator: Sam Ross
 */

import javax.swing.JOptionPane;

public class landCalculationApp 
{

	public static void main(String[] args) 
	{


		//Define variables
		String message;
		final float acre = 43560; //one acre in square feet
		final float tract = 389767; //given tract of land in square feet
		float calculation;


		//Main code
		calculation = tract / acre;
		message = String.format("The tract of land(%d sq. ft.) is: %.2f acres", tract, calculation);

		
		//Output
		JOptionPane.showMessageDialog(null, message);


	}

}

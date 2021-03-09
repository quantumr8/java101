package landCalculation;
/**
 * Description: This program calculates the number of acres in a tract of land with 389,767 square feet.
 * 1 acre = 43,560 sq. ft.
 *
 * Creator: Sam Ross
 */


//Import for dialog box
import javax.swing.JOptionPane;


public class landCalculationApp 
{

	public static void main(String[] args) 
	{


		//Define variables
		
		String message;
		final float acre = 43560; //one acre in square feet
		final int tract = 389767; //given tract of land in square feet
		float calculation;

		

		//Main code
		
		calculation = tract / acre;
		message = String.format("The tract of land(%d sq. ft.) is: %n%20.2f acres", tract, calculation);

		
		
		//Output
		
		JOptionPane.showMessageDialog(null, message, "Land Calculation", JOptionPane.INFORMATION_MESSAGE, null);


	}

}

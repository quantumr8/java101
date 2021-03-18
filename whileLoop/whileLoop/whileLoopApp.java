/* Description: Write a while loop that lets the user enter a number.
 * The number should be multiplied by 10, and the result stored in the variable "product."
 * The loop should iterate as long as product contains a value less than 100.
 * 
 * Created By: Sam Ross
 */

package whileLoop;

// Imports
import javax.swing.JOptionPane;


public class whileLoopApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		String userStr;
		int userNum;
		int product = 0;
		
		
		// Main code
		
		userStr = JOptionPane.showInputDialog(null, "Enter a number:", "While loop", JOptionPane.QUESTION_MESSAGE);
		userNum = Integer.parseInt(userStr);
		product = userNum * 10;
		
		while (product < 100)
			product = product * 10;
		JOptionPane.showMessageDialog(null, "Product: " +product,"While loop", JOptionPane.INFORMATION_MESSAGE);

	}

}

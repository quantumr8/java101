/* Description: This program will demonstrate how to use a true only if statement and a fi..else statement
 * Created by: Sam Ross
 * Date: 02/26/2021
 */

import javax.swing.JOptionPane;

public class BasicSelectionApp 
{

	public static void main(String[] args) 
	{
		int answer;
		String color;
		
		//Ask the user what their favorite color is and if it is purple I will have a message saying it's mine too
		
		color=JOptionPane.showInputDialog("What is your favorite color?");
		
		if (color.equalsIgnoreCase("purple"))
			JOptionPane.showMessageDialog(null, "That's my favorite color, too!", "Colors", JOptionPane.INFORMATION_MESSAGE, null);
		
		answer = JOptionPane.showConfirmDialog(null, "Are you going anywhere for Spring Break?", "Spring Break", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		//0=yes, 1=no
		
		if  (answer == 0)
			JOptionPane.showMessageDialog(null, "Have a great time!", "Spring Break", JOptionPane.INFORMATION_MESSAGE, null);
		else
			JOptionPane.showMessageDialog(null, "Sorry to hear that, have a good time anyway!", "Spring Break", JOptionPane.INFORMATION_MESSAGE, null);

	}

}

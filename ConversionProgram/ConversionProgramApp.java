/* Description: Ch 5 programming challenge #8: Conversion Program
 * Write a program that asks the user to enter a distance in meters. The program will then pre-sent the following menu of selections:
 * 1. Convert to kilometers
 * 2. Convert to inches
 * 3. Convert to feet
 * 4. Quit the program
 * 
 * The program will convert the distances to kilometers, inches, or feet, depending on the user's selection. The specific requirements are in the textbook.
 * 
 * Created by: Sam Ross
 * Date: 4/8/21
 * 
 */

// Imports

import javax.swing.JOptionPane;


public class ConversionProgramApp 
{

	public static void showKilometers(double meters)
	{
		// Variables
		
		double kilometers;
		String ansMsg;
		
		// Convert
		
		kilometers = meters * 0.001;
		
		// Output
		
		ansMsg = String.format("%.2f meters is %.2f kilometers", meters,kilometers);
		JOptionPane.showMessageDialog(null, ansMsg, "Converstion Program", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void showInches(double meters)
	{
		// Variables
		
		double inches;
		String ansMsg;
		
		// Convert
		
		inches = meters * 39.37;
		
		// Output
		
		ansMsg = String.format("%.2f meters is %.2f inches", meters,inches);
		JOptionPane.showMessageDialog(null, ansMsg, "Converstion Program", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void showFeet(double meters)
	{
		// Variables
		
		double feet;
		String ansMsg;
		
		// Convert
		
		feet = meters * 3.281;
		
		// Output
		
		ansMsg = String.format("%.2f meters is %.2f feet", meters,feet);
		JOptionPane.showMessageDialog(null, ansMsg, "Converstion Program", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public static void menu()
	{
		// Variables
		
		int selection;
		String menuMsg;
		double meters;
		
		// User input
		
		
		// Menu
		
		menuMsg = "1. Convert to kilometers\r\n"
				+ "2. Convert to inches\r\n"
				+ "3. Convert to feet\r\n"
				+ "4. Quit the program";
		selection = Integer.parseInt(JOptionPane.showInputDialog(null, menuMsg, "Conversion Program", JOptionPane.QUESTION_MESSAGE));
		
		switch(selection)
		{
		case 1:
			meters = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a distance in meters:", "Conversion Program", JOptionPane.QUESTION_MESSAGE));
			showKilometers(meters);
			break;
		case 2:
			meters = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a distance in meters:", "Conversion Program", JOptionPane.QUESTION_MESSAGE));
			showInches(meters);
			break;
		case 3:
			meters = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a distance in meters:", "Conversion Program", JOptionPane.QUESTION_MESSAGE));
			showFeet(meters);
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Bye!", "Conversion Program", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		default:
			JOptionPane.showMessageDialog(null, "Please choose an option between 1 and 4 only. Try again.", "Conversion Program", JOptionPane.ERROR_MESSAGE);
			break;
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		// Call method
		
		while(true)
		{
			menu();			
		}

	}

}

package stringManipulator;
/**
 * Description: This program asks the user to enter the name of his or her favorite city and displayes the following:
 * The Number of characters in the city name
 * The City name in all uppercase letters
 * The City name in all lowercase letters
 * The fist character of the city name
 *
 * Creator: Sam Ross
 */


import javax.swing.JOptionPane;

public class stringManipulatorApp
{

	public static void main(String[] args)
	{
		
		//Define Variables
		
		String message, inCity, upCity, lowCity;
		char firstCity;
		int cityLength;
		
		
		
		//User input
		
		inCity = JOptionPane.showInputDialog(null, "Please enter your favorite city:", "String Manipulator", 0);
		
		
		
		//Main code
		
		firstCity = inCity.charAt(0);
		upCity = inCity.toUpperCase();
		lowCity = inCity.toLowerCase();
		cityLength = inCity.length();
		message = String.format("The city you entered: %5s%nUppercase: %27s%nLowercase %27s%nFirst character: %16s%nTotal characters: %13d", inCity,upCity,lowCity,firstCity,cityLength);
		
		
		
		//Output
		
		JOptionPane.showMessageDialog(null, message, "String Manipulator", JOptionPane.INFORMATION_MESSAGE, null);

	}

}

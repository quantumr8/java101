/* Description: Ch 4 programming challenges #17: Random Number Guessing Game
 * 
 * Write a program that generates a random number and asks the user to guess what the number is.
 * If the user’s guess is higher than the random number, the program should display “Too high, try again.”
 * If the user’s guess is lower than the random number, the program should display “Too low, try again.”
 * The program should use a loop that repeats until the user correctly guesses the random number.
 * 
 * Created by: Sam Ross
 * Date: 4/7/21
 * 
 */

// Imports

import javax.swing.JOptionPane;
import java.util.Random;


public class RandomNumGameApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		int randNum,usrNum;
		String msg="";
		
		// Random class
		
		Random rand = new Random();
		
		
		
		// Set random number between 1 and 100
		
		randNum = rand.nextInt(100)+1;
		
		// User input
		
		do 
		{
			
		usrNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1 and 100:", JOptionPane.QUESTION_MESSAGE));
		
		// Response
		
		if(usrNum==randNum)
			msg = "You guessed correctly!!";
		else if(usrNum>randNum)
			msg = "Too high, try again.";
		else if(usrNum<randNum)
			msg = "Too low, try again.";
		
		JOptionPane.showMessageDialog(null, msg, "Random Number Guessing Game", JOptionPane.QUESTION_MESSAGE);

		}while(usrNum!=randNum);
	}

}

/* Description: Project 2 program
 * 
 * Created By: Sam Ross
 * Date: 3/26/21
 */



// Imports

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;


public class ProjectTwoApp 

{

	public static void main(String[] args) throws IOException
	{
		
		// Define variables
		
		int correct = 0;
		int incorrect = 0;
		String menuMsg, ansMsg, incorrectMsg, triesMsg, scoreMsg, functionName="", functionSign="";
		boolean notValid = true;
		int exit = 0;
		
		menuMsg = "Enter number of menu item:\n1) add\n2) subtract\n3) multiply\n4) divide";
		
		while(exit == 0)
		{
			// Reset & define variables
			
			int menu=0,num1=0,num2=0,calc=0,tries=3;
			double calcDbl=0,ans=0;
			
			
			// User input
			
			do
			{
				menu = Integer.parseInt(JOptionPane.showInputDialog(null, menuMsg, "Menu", JOptionPane.QUESTION_MESSAGE));
				
				// Switch to set proper name and symbol for text based on task. And error message for numbers not 1-4
				switch(menu)
				{
				case 1:
					functionName = "add";
					functionSign = "+";
					break;
				case 2:
					functionName = "subtract";
					functionSign = "-";
					break;
				case 3:
					functionName = "multiply";
					functionSign = "*";
					break;
				case 4:
					functionName = "divide";
					functionSign = "/";
					break;
				default:
					JOptionPane.showMessageDialog(null, "Please only enter a number 1-4", "Menu - Error", JOptionPane.ERROR_MESSAGE); // Error message
					break;
				}
			}while(menu>4 || menu<1); // Validation loop
			
			
			
			// Input numbers
			// Number 1
			do 
			{
			num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number to "+functionName+":", functionName, JOptionPane.QUESTION_MESSAGE));
			if (num1<0)
				JOptionPane.showConfirmDialog(null, "Please enter a number greater than 1.", "Error", JOptionPane.ERROR_MESSAGE);
			}while(num1<0); // Validation loop
			
			// Number 2
			do
			{
			num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number to "+functionName+":", functionName, JOptionPane.QUESTION_MESSAGE));
			if(menu == 4) // If division
			{
				if(num2<=0) // Can't be 0
				{
					JOptionPane.showMessageDialog(null, "Can't divide by 0. Please enter a number greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
					notValid=true;
				}
				else
					notValid=false; // Valid
			}
			else // If not division
			{
				if(num2<0) // Must be positive number
				{
					JOptionPane.showMessageDialog(null, "Please enter a positive number.", "Error", JOptionPane.ERROR_MESSAGE);
					notValid=true;
				}
				else
					notValid=false; // Valid
					
			}
			}while(notValid); // Validation loop
			
			
			// Calculations
			
			switch(menu)
			{
				case 1:
					calc = num1 + num2;
					break;
				case 2:
					calc = num1 - num2;
					break;
				case 3:
					calc = num1 * num2;
					break;
				case 4:
					calcDbl = num1 / num2;
					break;
			}
			
			
			// User answer
			
			ansMsg = num1+" "+functionSign+" "+num2+" = __";
			triesMsg = String.format("You answered incorrectly. Try again. %d tries left.", tries);
			if(menu==4) // Different format for division answer in double
				incorrectMsg = String.format("You answered incorrectly 3 times.%nThe correct answer is: %.2f", calcDbl);
			else
				incorrectMsg = String.format("You answered incorrectly 3 times.%nThe correct answer is: %d", calc);
			
			
			// Compare
			
			while(tries>0)
			{
				ans = Double.parseDouble(JOptionPane.showInputDialog(null, ansMsg, functionName, JOptionPane.QUESTION_MESSAGE));
				
				if (ans == calc || ans == calcDbl)
					{
					JOptionPane.showMessageDialog(null, "You answered correctly!", functionName, JOptionPane.INFORMATION_MESSAGE);
					correct++;
					tries=0;
					}
				else
				{
					tries--;
					incorrect++;
					if (tries == 0)
						JOptionPane.showMessageDialog(null, incorrectMsg, functionName, JOptionPane.ERROR_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, triesMsg, functionName, JOptionPane.ERROR_MESSAGE);
				}
			}
			
			// Shows your score
			
			scoreMsg = String.format("Answers correct: %d%nAnswers incorrect: %d", correct,incorrect);
			JOptionPane.showMessageDialog(null, scoreMsg, "Scores", JOptionPane.INFORMATION_MESSAGE);
			
			
			// Run program again?
			
			exit = JOptionPane.showConfirmDialog(null, "Run program again?", "Run again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		
		// Write scores to scores.txt
		
		FileWriter fwriter1 = new FileWriter("scores.txt",true);
		PrintWriter f=new PrintWriter(fwriter1);
		
		f.println(correct+" - "+incorrect);
		
		f.close();
		
		System.exit(0);
		

	}

}

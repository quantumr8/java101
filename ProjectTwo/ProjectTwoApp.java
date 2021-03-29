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
		String menuMsg, ansMsg, scoreMsg, functionName="", functionSign="";
		int exit = 0;
		
		menuMsg = "Enter number of menu item:\n1) add\n2) subtract\n3) multiply\n4) divide";
		
		while(exit == 0)
		{
			// Reset & define variables
			
			int menu=0,num1=0,num2=0,ans=0,calc=0,tries=3;
			
			
			// User input
			
			do
			{
				menu = Integer.parseInt(JOptionPane.showInputDialog(null, menuMsg, "Menu", JOptionPane.QUESTION_MESSAGE));
			}while(menu>5 && menu<0); // Validation loop
			
			
			// Switch to set proper name and symbol for text based on task.
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
			}
			
			// Input numbers
			do 
			{
			num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number to "+functionName+":", functionName, JOptionPane.QUESTION_MESSAGE));
			if (num1<1)
				JOptionPane.showConfirmDialog(null, "Please enter a number greater than 1.", "Error", JOptionPane.ERROR_MESSAGE);
			}while(num1<1); // Validation loop
			do
			{
			num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number to"+functionName+":", functionName, JOptionPane.QUESTION_MESSAGE));
			if (num2<1)
				JOptionPane.showConfirmDialog(null, "Please enter a number greater than 1.", "Error", JOptionPane.ERROR_MESSAGE);
			}while(num2<1); // Validation loop
			
			
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
					calc = num1 / num2;
					break;
			}
			
			
			// User answer
			
			ansMsg = num1+" "+functionSign+" "+num2+" = __";
			
			
			// Compare
			
			while(tries>0)
			{
				ans = Integer.parseInt(JOptionPane.showInputDialog(null, ansMsg, functionName, JOptionPane.QUESTION_MESSAGE));
				
				if (ans == calc)
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
						JOptionPane.showMessageDialog(null, "You answered incorrectly 3 times. The correct answer is: "+calc, functionName, JOptionPane.ERROR_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,"You answered incorrectly. Try again. "+tries+" tries left.", functionName, JOptionPane.ERROR_MESSAGE);
				}
			}
			
			// Shows your score
			
			scoreMsg = String.format("Answers correct: %d%nAnswers incorrect: %d", correct,incorrect);
			JOptionPane.showMessageDialog(null, scoreMsg, "Scores", JOptionPane.INFORMATION_MESSAGE);
			
			
			// Run program again?
			
			exit = JOptionPane.showConfirmDialog(null, "Run program again?", "Run again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		
		// Write scores to .txt
		
		FileWriter fwriter1 = new FileWriter("scores.txt",true);//opening the file to append
		PrintWriter f=new PrintWriter(fwriter1);
		
		f.println(correct+" - "+incorrect);
		f.println("");
		
		f.close();
		
		System.exit(0);
		

	}

}

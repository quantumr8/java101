/* Description: Final Project
 * 
 * 
 * Created by: Sam Ross
 * Date 4/22/21
 */

// Imports

import javax.swing.JOptionPane;


public class FinalProjectApp 
{

	
	public static void main(String[] args) 
	{
		
		// Variables
		double maxScore;
		
		// Constructor student class
		Student stu=new Student();
		
		// Ask for maximum points
		maxScore = ValidateMax("Please Enter the maximum possible score for the exam:");
		
		stu.Student(nameF,nameL,score,maxScore);
		
		
		

	}
	
	// Validation method - positive number
	public static double Validate(String message)
	{
		double valid;
		
		valid=Double.parseDouble(JOptionPane.showInputDialog(null, message, "Exam Scores", JOptionPane.QUESTION_MESSAGE));
		
		while(valid<0)
			valid=Double.parseDouble(JOptionPane.showInputDialog(null, "The student score can't be negative. Please try again:", "Exam Scores", JOptionPane.ERROR_MESSAGE));
		
		return valid;
	}
	
	// Validation method - greater than 0
	public static double ValidateMax(String message)
	{
		double valid;
		
		valid=Double.parseDouble(JOptionPane.showInputDialog(null, message, "Exam Scores", JOptionPane.QUESTION_MESSAGE));
		
		while(valid<=0)
			valid=Double.parseDouble(JOptionPane.showInputDialog(null, "You must have have a possible score greater than 0. Please try again:", JOptionPane.ERROR_MESSAGE));
		
		return valid;
	}

}

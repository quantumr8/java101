/* Description: Final Project
 * 
 * 
 * Created by: Sam Ross
 * Date 4/22/21
 */

// Imports

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;


public class FinalProjectApp 
{

	
	public static void main(String[] args) throws IOException
	{
		
		// Variables
		double score,maxScore,percent,totalScore=0,avg;
		int exit=0, numStu=0;
		String nameF,nameL,dataMsg;
		char grade;
		
		// Open file for exam data [data]
		FileWriter fwriter1 = new FileWriter("ExamScoreData.txt",true);
		PrintWriter data=new PrintWriter(fwriter1);
		
		// Open file for scores [dataScores]
		FileWriter fwriter2 = new FileWriter("scores.txt",true);
		PrintWriter dataScores=new PrintWriter(fwriter2);
		
		// New student
		Student stu=new Student();
		
		// Ask for maximum points
		maxScore = ValidateMax("Please Enter the maximum possible score for the exam:");
		stu.SetMax(maxScore);
		
		// User input loop
		do
		{
			// Input data
			nameF = JOptionPane.showInputDialog(null, "Please enter the students first name:", "Exam Scores", JOptionPane.QUESTION_MESSAGE);
			nameL = JOptionPane.showInputDialog(null, "Please enter the students last name:", "Exam Scores", JOptionPane.QUESTION_MESSAGE);
			score = Validate("Please enter the students score:");
			
			// Send data to Student class
			stu.SetData(nameF,nameL,score);	
			
			// Get data from Student class
			percent = stu.GetPercent();
			grade = stu.GetGrade();
			
			// Output all data to ExamScoreData.txt
			dataMsg = String.format("Name: %s %s, Score: %.2f, Percentage: %.0f%%, Letter grade: %c", nameF, nameL, score, percent, grade);
			data.println(dataMsg);
			
			// Output scores to scores.txt
			dataScores.println(score);
			
			// Counters for average
			numStu++;
			totalScore+=score;
			
			// Ask to enter another
			exit = JOptionPane.showConfirmDialog(null, "Enter another score?", "Exam Scores", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);			
			
		}while(exit==0);
		
		// Calculate average score
		avg = totalScore/numStu;
		
		// Display average
		dataMsg = String.format("Average score: %.2f", avg);
		JOptionPane.showMessageDialog(null, dataMsg, "Exam Scores", JOptionPane.INFORMATION_MESSAGE);
		
		// Close Files
		data.close();
		dataScores.close();
		
		// End of program
		System.exit(0);

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
	public static int ValidateMax(String message)
	{
		int valid;
		
		valid=Integer.parseInt(JOptionPane.showInputDialog(null, message, "Exam Scores", JOptionPane.QUESTION_MESSAGE));
		
		while(valid<=0)
			valid=Integer.parseInt(JOptionPane.showInputDialog(null, "You must enter a value greater than 0. Please try again:", JOptionPane.ERROR_MESSAGE));
		
		return valid;
	}

}

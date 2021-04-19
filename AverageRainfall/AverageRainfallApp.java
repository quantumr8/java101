import javax.swing.JOptionPane;

/* Description: Average Rainfall
 * Write a program that uses nested loops to collect data and calculate the average rainfall over a period of years.
 * First the program should ask for the number of years. The outer loop will iterate once for each year.
 * The inner loop will iterate 12 times, once for each month. Each iteration of the inner loop will ask the user for the inches of rainfall for that month.
 * After all iterations, the program should display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.
 * 
 * Input Validation: Do not accept a number less than 1 for the number of years. Do not accept negative numbers for the monthly rainfall.
 * 
 * Created By: Sam Ross
 * Date: 4/7/21
 * 
 */

public class AverageRainfallApp 
{

	public static void main(String[] args) 
	{
		
		// Define variables
		
		int years,year=0,month=0,months=0;
		double total=0,average;
		String inputMsg,ansMsg;
		
		
		// User input
		
		do
		{
			years = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of years to log:", "Average Rainfall", JOptionPane.QUESTION_MESSAGE));
			if(years<1)
				JOptionPane.showMessageDialog(null, "You must enter at least 1 year. Try again.", "Average Rainfall", JOptionPane.ERROR_MESSAGE);
		}while(years<1); // Validation - must me greater than 1
		
		
		do
		{
			year++;
			do
			{
				month++;
				months++;
				inputMsg = String.format("Enter inches of rainfall for year %d month %d:", year,month);
				total = total + Double.parseDouble(JOptionPane.showInputDialog(null, inputMsg, "Average Rainfall", JOptionPane.QUESTION_MESSAGE));
			}while(month<12); // 12 months
			month=0;
		}while(year<years); // Years
		
		
		// Calculation
		
		average = total/months;
		
		
		// Output
		
		ansMsg = String.format("%d total months%nTotal rainfall: %.2f inches%nAverage rainfall per month: %.2f inches", months,total,average);
		JOptionPane.showMessageDialog(null, ansMsg, "Average Rainfall", JOptionPane.INFORMATION_MESSAGE);

	}

}

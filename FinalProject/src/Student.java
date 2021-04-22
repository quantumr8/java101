// Student class
public class Student 
{

	private String nameF, nameL;
	private double score, maxScore, percent;
	
	// Initialize
	Student()
	{
		nameF="init";
		nameL="init";
		score=0;
		maxScore=100;
	}
		
	// Input form main class
	Student(String first, String last, double s, double m)
	{
		nameF = first;
		nameL = last;
		score = s;
		maxScore= m;
	}
	
	// Methods
	
	public double GetPercent()
	{
		// Calculate student percentage
		percent = (score/maxScore)*100;
		
		return percent;
		
		// Output student percentage to user [DISABLED]
		// JOptionPane.showMessageDialog(null, percent, "Exam Scores", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public String GetGrade()
	{
		String grade;
		if(percent==100)
			grade="A+";
		else if(percent<100 && percent>=90)
			grade="B";
		else if(percent<90 && percent>=80)
			grade="C";
		else if(percent<80 && percent>=70)
			grade="D";
		else
			grade="F";
		
		return grade;
		
	}
	
	public String GetFirstName()
	{
		return nameF;
	}
	
	
	//end
}

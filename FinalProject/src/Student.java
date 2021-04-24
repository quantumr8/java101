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
	public void SetData(String first, String last, double s) // Void function
	{
		nameF = first;
		nameL = last;
		score = s;
	}
	
	// Methods
	
	public void SetMax(double m) // Takes a parameter
	{
		maxScore = m;
	}
	
	public double GetPercent() // Value returning
	{
		// Calculate student percentage
		percent = (score/maxScore)*100;
		
		return percent;
	}
	
	public char GetGrade()
	{
		char grade;
		if(percent>=90)
			grade='A';
		else if(percent>=80)
			grade='B';
		else if(percent>=70)
			grade='C';
		else if(percent>=60)
			grade='D';
		else
			grade='F';
		
		return grade;
		
	}
	
	public String GetFirstName()
	{
		return nameF;
	}
	
	public String GetLastName()
	{
		return nameL;
	}

	// End of Student class
}

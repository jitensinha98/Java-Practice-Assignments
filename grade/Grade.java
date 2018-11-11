class Number
	{
	void getGrades(int marks)
		{
		String grade;
		if (marks < 0 || marks > 100)
			grade="undefined";	 
		else if (marks < 40)
			grade="F";
		else if (marks >= 40 && marks <=59)
			grade="E";
		else if (marks >=60 && marks <=69)
			grade="D";
		else if (marks >=70 && marks <=79)
			grade="C";
		else if (marks >=80 && marks <=89)
			grade="B";
		else
			grade="A";
		System.out.println("Grade = "+grade);
		}
	}
class Grade
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.getGrades(283);
		}
	}
	

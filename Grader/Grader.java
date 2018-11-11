import java.util.*;
class Grade
	{
	int score;
	Grade(int marks)
		{
		score=marks;
		}
	char letterGrade()
		{
		char grade;
		if (score>=95)
			grade='O';
		else if (score >=80 && score <=94)
			grade='A';
		else if (score >=70 && score <=79)		
			grade='B';
		else if (score >=60 && score <= 69)		
			grade='C';
		else if (score >=50 && score <= 59)
			grade='D';
		else if (score >=40 && score <=49)
			grade='E';
		else
			grade='F';
		return grade;	
		}
	}
class Grader
	{
	public static void main(String args[])
		{
		int a;
		char g;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter marks : ");
		a=in.nextInt();
		if (a>=0 && a<=100)
			{
			Grade ob=new Grade(a);
			g=ob.letterGrade();
			System.out.println("Grade = "+g);
			}
		else
			{
			System.out.println("Wrong Entry");
			}
		}
	}

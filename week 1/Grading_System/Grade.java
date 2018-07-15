class Number
	{
	int marks=87;
	void check()
		{
		if (marks >=90 && marks <=100)
			System.out.println(marks+" is GRADE A");
		else if (marks >=80 && marks <=89)
			System.out.println(marks+" is GRADE B");
		else if (marks >=70 && marks <=79)
			System.out.println(marks+" is GRADE C");
		else if (marks >=60 && marks <=69)
			System.out.println(marks+" is GRADE D");
		else if (marks >=40 && marks <=59)
			System.out.println(marks+" is GRADE E");
		else 
			System.out.println(marks+" is GRADE F");
		}
	}
class Grade
	{
	public static void main(String args[])
		{
		Number obj=new Number();
		obj.check();
		}
	}


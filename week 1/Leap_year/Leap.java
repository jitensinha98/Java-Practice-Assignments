class Year
	{
	int num=2004;
	void check()
		{
		if (num%400==0)
			System.out.println(num+" is a Leap Year.");
		else if (num % 100==0)
			System.out.println(num+" is a Leap Year.");
		else if (num % 4==0)
			System.out.println(num+" is a Leap Year.");
		else
			System.out.println(num+" is not a Leap Year.");
		
		}
	}
class Leap
	{
	public static void main(String args[])
		{
		Year obj=new Year();
		obj.check();
		}
	}


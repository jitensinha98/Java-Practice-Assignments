class Number
	{
	int num=20;
	void check()
		{
		if (num % 5==0)
			System.out.println(num+" is divisible by 5");
		else
			System.out.println(num+" is not divisible by 5");
		}
	}
class Divisible
	{
	public static void main(String args[])
		{
		Number obj=new Number();
		obj.check();
		}
	}


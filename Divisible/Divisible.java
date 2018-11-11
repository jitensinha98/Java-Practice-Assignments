class Check
	{
	void check(int num)
		{
		if (num % 5==0)
			System.out.println("Number is divisible by 5.");
		else
			System.out.println("Number not divisible by 5.");
		}
	}
class Divisible
	{
	public static void main(String args[])
		{
		Check ob=new Check();
		ob.check(2);
		}
	}

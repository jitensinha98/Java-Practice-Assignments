class Number
	{
	void check(int num)
		{
		if (num % 2==0)
			{
			System.out.println("Even Number");
			}
		else
			{
			System.out.println("Odd Number");
			}
		}
	}
class Check
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.check(21);
		}
	}

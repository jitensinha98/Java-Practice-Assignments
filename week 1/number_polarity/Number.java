class Polarity
	{
	int num=4;
	void check()
		{
		if (num > 0)
			{
			System.out.println("Number "+num+" is positive");
			}
		else
			{
			System.out.println("Number "+num+" is negative");
			}
		}
	}
class Number
	{
	public static void main(String args[])
		{
		Polarity obj=new Polarity();
		obj.check();
		}
	}

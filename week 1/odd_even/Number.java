class OddEven
	{
	int num=3;
	void check()
		{
		if(num%2==0)
			{
			System.out.println(num+" is an even number");
			}
		else
			{
			System.out.println(num+" is an Odd number");
			}
		}
	}
class Number
	{
	public static void main(String args[])
		{
		OddEven obj=new OddEven();
		obj.check();
		}
	}

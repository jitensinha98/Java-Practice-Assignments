class Constructor
	{
	int x;
	Constructor()
		{
		x=5;
		}
	void Print()
		{
		System.out.println("The value of x is "+x);
		}
	}
class Const
	{
	public static void main(String args[])
		{
		Constructor ob=new Constructor();
		ob.Print();
		}
	}

		

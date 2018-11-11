class Number
	{
	void swap(int a,int b)
		{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped numbers are "+a+" and "+b);
		}
	}
class Swap
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.swap(5,6);
		}
	}


class Number
	{
	int a=1,b=2,c;
	void swap()
		{
		System.out.println("Numbers before swapping are "+a+","+b);
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swapping are "+a+","+b);
		}
	}
class Swap
	{
	public static void main(String args[])
		{
		Number obj=new Number();
		obj.swap();
		}
	}


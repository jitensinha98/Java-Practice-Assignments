class Number
	{
	int a=1,b=2,c=3;
	void check()
		{
		if(a>b && a>c)
			{
			System.out.println(a+" is maximum.");
			}
		if(b>a && b>c)
			{
			System.out.println(b+" is maximum.");
			}
		if(c>b && c>a)
			{
			System.out.println(c+" is maximum.");
			}
		}
	}
class Maximum
	{
	public static void main(String args[])
		{
		Number obj=new Number();
		obj.check();
		}
	}

class Addition
	{
	int a=3,b=4,c;
	void add()
		{
		c=a+b;
		System.out.println("Sum of "+a+" and "+b+" is "+c);
		}
	}
class Add
	{
	public static void main(String args[])
		{
		Addition obj=new Addition();
		obj.add();
		}
	}

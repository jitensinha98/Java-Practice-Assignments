import java.util.*;
class Number
	{
	void range(int a,int b)
		{
		System.out.println("Multiple of 10 are : ");
		for (int i=a;i<=b;i++)
			{
			if (i % 10 == 0)
				System.out.println(i);
			}
		}
	}
class Multiple
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("Enter Range : ");
		a=in.nextInt();
		b=in.nextInt();
		Number ob=new Number();
		ob.range(a,b);
		}
	}


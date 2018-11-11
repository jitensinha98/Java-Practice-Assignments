import java.util.*;
class Number
	{
	void check(int num)
		{
		int flag=0;
		for (int i=2;i<=(num/2);i++)
			{
			if (num%i==0)
				flag=1;
			}
		if (flag==0)
			System.out.println("Prime number");
		else
			System.out.println("Not Prime number");
		}
	}
class Prime
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n=in.nextInt();
		Number ob=new Number();
		ob.check(n);
		}
	}

			

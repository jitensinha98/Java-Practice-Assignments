import java.util.*;
class Compute
	{
	void factorial(int n)
		{
		int a=0,b=1,c;
		System.out.print(a+" ");
		System.out.print(" "+b+" ");
		for (int i=0;i<(n-2);i++)
			{
			c=a+b;
			a=b;
			b=c;
			if(i==(n-3))
				System.out.println(" "+c+" ");
			else
				System.out.print(" "+c+" ");
			}
		}
	}
class Fibo
	{
	public static void main(String args[])
		{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit : ");
		n=in.nextInt();
		Compute ob=new Compute();
		ob.factorial(n);
		}
	}

		

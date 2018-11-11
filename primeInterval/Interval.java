import java.util.*;
class Prime
	{
	void check(int a,int b)
		{
		int flag=0;
		System.out.println("Prime numbers within "+a+" and "+b+" is :");
		for (int j=a;j<=b;j++)
			{
			for (int i=2;i<=j/2;i++)
				{
				if(j%i==0)
					{	
					flag=1;
					break;
					}
				else
					{
					flag=0;
					}
				}
				if (flag==0)
					System.out.println(j);
			
			}
		}
	}
class Interval
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("Enter range:");
		a=in.nextInt();
		b=in.nextInt();
		Prime ob=new Prime();
		ob.check(a,b);
		}
	}
			
				

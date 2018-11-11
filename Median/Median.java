import java.util.*;
class Number
	{
	Scanner in=new Scanner(System.in);
	int a[]=new int[50];
	void Compute()
		{
		int n=0,median=0;
		int x,y;
		System.out.println("How many number do you want to enter : ");
		n=in.nextInt();
		x=n/2;
		y=x+1;
		for (int i=0;i<n;i++)
			{
			System.out.println("Enter number : ");
			a[i]=in.nextInt();
			}
		if (n%2==0)
			median=(a[x]+a[y])/2;
		else
			median=a[y];
		System.out.println("Median = "+median);
		}
	}
class Median
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.Compute();
		}
	}

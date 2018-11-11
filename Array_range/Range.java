import java.util.*;
class Number
	{
	int a[]=new int[100];
	int i,n;
	void input()
		{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit : ");
		n=in.nextInt();
		System.out.println("Enter array : ");
		for(i=0;i<n;i++)
			{
			a[i]=in.nextInt();
			}		
		}

	int findmin()
		{
		int min=a[0];
		for(i=0;i<n;i++)
			{
			if(min > a[i])
				min=a[i];
			}
		return min;
		}
	int findmax()
		{
		int max=a[0];
		for(i=0;i<n;i++)
			{
			if(max < a[i])
				max=a[i];
			}
		return max;
		}
	void range()
		{
		int max=0,min=0;
		int range=0;
		min=findmin();
		max=findmax();
		range=max-min;
		System.out.println("The Range is "+range);
		}
	}
class Range
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.input();
		ob.range();
		}
	}

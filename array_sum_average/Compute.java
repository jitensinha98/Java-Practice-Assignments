import java.util.*;
class Number
	{
	int a[]=new int[100];
	void calculate()
		{
		Scanner in=new Scanner(System.in);
		int sum=0,i;
		double average=0;
		int n;
		System.out.println("Enter limit : ");
		n=in.nextInt();
		System.out.println("Enter array : ");
		for(i=0;i<n;i++)
			{
			a[i]=in.nextInt();
			}
		for(i=0;i<n;i++)
			{
			sum=sum+a[i];
			}
		average=sum/n;
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
		}
	}
class Compute
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.calculate();
		}
	}
		
		

import java.util.*;
class Number
	{
	int a[]=new int[100];
	void calculate()
		{
		Scanner in=new Scanner(System.in);
		int sum=0,i,j,temp;
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
			for(j=i+1;j<n;j++)
				{
				if(a[i]>a[j])
					{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			}
		System.out.println("The second Highest number is : "+a[n-2]);			
		
		}
	}
class SecondHighest
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.calculate();
		}
	}
		
		

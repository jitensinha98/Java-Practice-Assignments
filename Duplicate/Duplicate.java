import java.util.*;
class Array
	{
	void duplicate()
		{
		Scanner in=new Scanner(System.in);
		int a[],i,j,n,count=0;
		System.out.println("Enter number of elements :");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter array :");
		for(i=0;i<n;i++)
			{
			a[i]=in.nextInt();
			}
		for (i=0;i<n;i++)
			{
			for(j=i+1;j<n;j++)
				{
				if(a[i]==a[j])
					{
					count++;
					}
				}
			}
		if(count>0)
			{
			System.out.println("Duplicate Found.");
			System.out.println("Frequency = "+count);
			}
		else
			System.out.println("No Duplicate Found.");
		}
	}
class Duplicate
	{
	public static void main(String args[])
		{
		Array ob=new Array();
		ob.duplicate();
		}
	}
			
				

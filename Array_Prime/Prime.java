import java.util.*;
class Matrix
	{
	int CheckPrime(int n)
		{
		int i,flag=0;
		for(i=2;i<=n/2;i++)
			{
			if(n%i == 0)
				{
				flag=1;
				break;
				}
			}
		if(flag == 0)
			return 1;
		else
			return 0;
		}
	void inputArrayandCheck()
		{
		Scanner in=new Scanner(System.in);
		int a[],n,i,count=0;
		System.out.println("Enter the number of elements in the array : ");
		n=in.nextInt();
		a=new int[n];
		System.out.println("Enter Array :");
		for (i=0;i<n;i++)
			{
			a[i]=in.nextInt();
			count=count+CheckPrime(a[i]);
			}
		System.out.println("Number of Prime numbers are "+count);
		}
	}
class Prime
	{
	public static void main(String args[])
		{
		Matrix ob=new Matrix();
		ob.inputArrayandCheck();
		}
	}
		
			

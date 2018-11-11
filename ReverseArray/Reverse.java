import java.util.*;
class Number
	{
	int a[];
	void reverse()
		{
		Scanner in=new Scanner(System.in);
		int i,temp,j;
		int n;
		int k;
		System.out.println("Enter limit : ");
		n=in.nextInt();	
		j=n-1;
		a=new int[n];
		System.out.println("Enter array : ");
		for(i=0;i<n;i++)
			{
			a[i]=in.nextInt();
			}
		for (i=0;i<(a.length/2);i++,j--)
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		for(i=0;i<n;i++)
			{
			System.out.println(a[i]+" ");
			}	
		}	
	}
class Reverse
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.reverse();
		}
	}
		
		

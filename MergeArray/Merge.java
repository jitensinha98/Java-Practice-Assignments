import java.util.*;
class Array
	{
	void merge()
		{
		Scanner in=new Scanner(System.in);
		float a[],b[],c[];
		int m,n,tot=0,i,count=0;
		System.out.println("Enter number of elements in 1st Array : ");
		m=in.nextInt();
		System.out.println("Enter number of elements in 2nd Array : ");
		n=in.nextInt();
		a=new float[m];
		b=new float[n];
		tot=m+n;
		c=new float[tot];
		System.out.println("Enter 1st Array : ");
		for(i=0;i<m;i++)
			{
			a[i]=in.nextFloat();
			}
		System.out.println("Enter 2nd Array : ");
		for(i=0;i<n;i++)
			{
			b[i]=in.nextFloat();
			}
		for(i=0;i<m;i++)
			{
			c[i]=a[i];
			count++;
			}
		for(i=0;i<n;i++)
			{
			c[count++]=b[i];
			}
		System.out.println("Merged Array is :");
		for(i=0;i<tot;i++)
			{
			System.out.println(c[i]+" ");
			}
		}
	}
class Merge
	{
	public static void main(String args[])
		{
		Array ob=new Array();
		ob.merge();
		}
	}

		
		
		
		
		
		

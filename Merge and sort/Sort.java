import java.util.*;
class Number
	{
	void Merge_and_Sort()
		{
		int a[],b[],c[],m,n,tot,i,j,count=0,temp=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements in 1st Array :");
		m=in.nextInt();
		System.out.println("Enter number of elements in 2nd Array :");
		n=in.nextInt();
		a=new int[m];
		b=new int[n];
		tot=m+n;
		c=new int[tot];
		System.out.println("Enter 1st Array :");
		for(i=0;i<m;i++)
			{
			a[i]=in.nextInt();
			c[i]=a[i];
			count++;
			}
		System.out.println("Enter 2nd Array :");
		for(i=0;i<n;i++)
			{
			b[i]=in.nextInt();
			c[count++]=b[i];
			}
		for (i=0;i<tot;i++)
			{
			for(j=i+1;j<tot;j++)
				{
				if(c[i]>c[j])
					{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					}
				}
			}
		System.out.println("Displaying Merged and Sorted Array...");
		for (i=0;i<tot;i++)
			{
			System.out.print(c[i]+" ");
			}
		}
	}
class Sort
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.Merge_and_Sort();
		}
	}	

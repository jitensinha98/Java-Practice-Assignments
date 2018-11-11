import java.util.*;
class Number
	{
	void calculate()
		{
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int m,n,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter row and column size for both the arrays : ");
		m=in.nextInt();
		n=in.nextInt();
		System.out.println("Enter First Array : ");
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				a[i][j]=in.nextInt();
				}
			}
		System.out.println("Enter Second Array : ");
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				b[i][j]=in.nextInt();
				}
			}
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				a[i][j]=a[i][j]+b[i][j];
				}
			}
		System.out.println("SUM is ");
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				System.out.print(a[i][j]);
				}
			System.out.println();
			}
		}
	}
class Sum
	{
	public static void main(String args[])
		{
		Number ob=new Number();
		ob.calculate();
		}
	}
		

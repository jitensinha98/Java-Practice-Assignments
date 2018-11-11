import java.util.*;
class Array
	{
	void compute()
		{
		Scanner in=new Scanner(System.in);
		int a[][],m,n,i,j,sum=0;
		System.out.println("Enter the row and column limit :");
		m=in.nextInt();
		n=in.nextInt();
		a=new int[m][n];
		System.out.println("Enter array : ");
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				a[i][j]=in.nextInt();
				}
			}
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				if(a[i][j]==a[j][i])
					sum=sum+a[i][j];
				}
			}
		System.out.println("Sum of Diagonal elements are "+sum);
		}
	}
class Diagonal
	{
	public static void main(String args[])
		{
		Array ob=new Array();
		ob.compute();
		}
	}		
		
		

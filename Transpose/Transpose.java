import java.util.*;
class Array
	{
	void transpose()
		{
		Scanner in=new Scanner(System.in);
		int a[][],m,n,i,j,temp=0;
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
		System.out.println("ORIGINAL ARRAY : ");
		for(i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		for(i=0;i<(a.length/2 + 1);i++)
			{
			for(j=i;j<(a[0].length);j++)
				{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
				}
			}
		System.out.println("TRANSPOSED ARRAY : ");
		for(i=0;i<a.length;i++)
			{
			for(j=0;j<a[0].length;j++)
				{
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			}
		}
	}
class Transpose
	{
	public static void main(String args[])
		{
		Array ob=new Array();
		ob.transpose();
		}
	}		
		
		

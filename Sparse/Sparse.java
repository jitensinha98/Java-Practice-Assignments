import java.util.*;
class Matrix
	{
	void inputArrayandCheck()
		{
		Scanner in=new Scanner(System.in);
		int a[][],m,n,i,j,count=0;
		System.out.println("Enter the number of rows and columns in the array : ");
		m=in.nextInt();
		n=in.nextInt();
		a=new int[m][n];
		System.out.println("Enter Array :");
		for (i=0;i<m;i++)
			{
			for(j=0;j<n;j++)
				{
				a[i][j]=in.nextInt();
				if(a[i][j]==0)
					count++;
				}
			}
		if(count > ((m*n)/2))
			System.out.println("Sparse Matrix");
		else
			System.out.println("Not Sparse Matrix");
			
		}
	}
class Sparse
	{
	public static void main(String args[])
		{
		Matrix ob=new Matrix();
		ob.inputArrayandCheck();
		}
	}
		
			

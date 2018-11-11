import java.util.*;
class Series
	{
	void compute(int n)
		{
		double e=0;
		double prod=1;
		for (int i=1;i<=n;i++)
			{
			prod=prod*i;
			e=e+(1/prod);
			}
		System.out.println("The series result is "+(e+1));
		}
	}
class Euler
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter limit :");	
		n=in.nextInt();
		Series ob=new Series();
		ob.compute(n);
		}
	}


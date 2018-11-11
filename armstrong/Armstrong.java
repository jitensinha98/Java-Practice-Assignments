import java.util.*;
class Number
	{
	void check(int n)
		{
		int d=1,temp;
		double sum=0;
		temp=n;
		while(n>0)
			{
			d=n%10;
			sum=sum+Math.pow(d,3);
			n=n/10;
			}
		if(temp == sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong Number.");
		}
	}
class Armstrong
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter number : ");
		n=in.nextInt();
		Number ob=new Number();
		ob.check(n);
		}
	}

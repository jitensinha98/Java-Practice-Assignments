import java.util.*;
class Number
	{
	void check(int n)
		{
		int r=0,d=0,temp=0;
		temp=n;
		while(n>0)
			{
			d=n%10;
			r=r*10+d;
			n=n/10;
			}
		if(temp==r)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome");
		}
	}
class Palin
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number:");
		n=in.nextInt();
		Number ob=new Number();
		ob.check(n);
		}
	}

import java.util.*;
class Number
	{
	void Reverse(int n)
		{
		int r=0,d=0;
		while(n>0)
			{
			d=n%10;
			r=r*10+d;
			n=n/10;
			}
		System.out.println("The reversed number is "+r);
		}
	}
class Reverse
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a number : ");
		n=in.nextInt();
		Number ob=new Number();
		ob.Reverse(n);
		}
	}

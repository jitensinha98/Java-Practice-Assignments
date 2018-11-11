import java.util.*;
class Number
	{
	void check(int num)
		{
		if (num % 7==0 || num % 10 ==7)
			System.out.println("Buzz NUmber");
		else
			System.out.println("Not a Buzz Number");
		}
	}
class Buzz
	{
	public static void main(String args[])
		{
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number :");
		n=in.nextInt();
		Number ob=new Number();
		ob.check(n);
		}
	}
		

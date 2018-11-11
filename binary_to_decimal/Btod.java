import java.util.*;
class Number
	{
	void convert(int n)
		{
		int p=0,decimal=0;
		while(n!=0)
			{
			decimal+=((n%10)*Math.pow(2,p));
			n=n/10;
			p++;
			}
		System.out.println("The decimal Number is "+decimal);
		}
	}
class Btod
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);	
		int n;
		System.out.println("Enter Binary Number : ");
		n=in.nextInt();
		Number ob=new Number();
		ob.convert(n);
		}
	}


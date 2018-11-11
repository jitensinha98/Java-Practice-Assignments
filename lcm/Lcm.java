import java.util.*;
class Number
	{
	void lcm(int a,int b)
		{
		int gcd=1,lcm;
		for (int i=1;i<=a && i<=b;i++)
			{
			if(a%i==0 && b%i==0)
				gcd=i;
			}
		
		lcm=(a*b)/gcd;
		System.out.println("LCM is "+lcm);
		}
	}
class Lcm
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers:");
		a=in.nextInt();
		b=in.nextInt();
		Number ob=new Number();
		ob.lcm(a,b);
		}
	}	

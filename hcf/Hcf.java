import java.util.*;
class Number
	{
	void hcf(int a,int b)
		{
		int hcf=1;
		for(int i=1;i<=a;i++)
			{
			if(a%i==0 && b%i==0)
				hcf=i;
			}
		System.out.println("HCF is "+hcf);
		}
	}
class Hcf
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("Enter numbers:");
		a=in.nextInt();
		b=in.nextInt();
		Number ob=new Number();
		ob.hcf(a,b);
		}
	}
		

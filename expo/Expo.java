import java.util.*;
class Number
	{
	void expo(int a,int n)
		{
		double num;
		num=Math.pow(a,n);
		System.out.println("The exponential of "+a+" to the power "+n+" is "+num);
		}
	}
class Expo
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a,n;
		System.out.println("Enter a number and power : ");
		a=in.nextInt();
		n=in.nextInt();
		Number ob=new Number();
		ob.expo(a,n);
		}
	}


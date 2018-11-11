import java.util.*;
class Number
	{
	void convert(int n)
		{
		int binary[]=new int[40];
		int index=0;
		while(n>0)
			{
			binary[index++]=n % 2;
			n=n/2;
			}
		for (int i=index-1;i>=0;i--)
			System.out.print(binary[i]);
		}
	}
class Dtob
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter a Decimal number : ");
		n=in.nextInt();
		Number ob=new Number();
		ob.convert(n);
		}
	}


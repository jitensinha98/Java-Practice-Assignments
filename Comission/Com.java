import java.util.*;
class Commission
	{
	double sales;
	Commission(double sle)
		{
		sales=sle;
		}
	void compute()
		{
		sales=sales*0.5;
		System.out.println("Commission="+sales);
		}
	}
class Com
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		double n;
		System.out.println("Enter Sales :");
		n=in.nextDouble();
		Commission ob=new Commission(n);
		ob.compute();
		}
	}


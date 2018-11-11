import java.util.*;
class Calculation
	{
	int a[]=new int[10];
	int sum=0;
	double avg=0;
	Calculation(int a[])
		{
		this.a=a;
		}
	double calculate()
		{
		int i;
		for(i=0;i<10;i++)
			{
			sum=sum+a[i];
			avg=sum/10;
			}
		return avg;
		}
	void display()
		{
		double getResult;
		getResult=calculate();
		System.out.println("Average="+avg);
		}
	}
class Calc
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a[]=new int[10];
		int i;
		Calculation ob[]=new Calculation[10];
		System.out.println("Enter 10 numbers : ");
		for (i=0;i<10;i++)
			{
			a[i]=in.nextInt();
			}
		ob[]=new Calculation(a);
		ob[20].display();
		}
	}

	

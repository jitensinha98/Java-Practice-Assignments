import java.util.*;
class Interest
	{
	int amount,interest_rate,time;
	double interest;
	Interest(int amount,int interest_rate,int time)
		{
		this.amount=amount;
		this.interest_rate=interest_rate;
		this.time=time;
		}
	double calculate_interest()
		{
		double interest;
		interest=(amount*interest_rate*time)/100;
		return interest;
		}
	void display()
		{
		double getResult;
		getResult=calculate_interest();
		System.out.println("Interest = "+getResult);
		}
	}
class Sales
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int amount,interest_rate,time,i;
		System.out.println("Enter Amount :");
		amount=in.nextInt();
		System.out.println("Enter Interest rate :");
		interest_rate=in.nextInt();
		Interest ob[]=new Interest[30];
		for(i=1;i<=30;i++)
			{
			ob[i-1]=new Interest(amount,interest_rate,i);
			ob[i-1].display();
			}
		}
	}
		 
		

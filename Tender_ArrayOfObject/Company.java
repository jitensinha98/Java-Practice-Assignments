import java.util.*;
class Tender
	{
	int cost;
	String company_name;
	Tender(int x,String y)
		{
		cost=x;
		company_name=y;
		}
	void display()
		{
		System.out.println("Cost="+cost+" Company Name="+company_name);
		}
	}
class Company
	{
	public static void main(String args[])
		{
		int i,cost;
		int min_cost;
		String cm_name;
		Scanner in=new Scanner(System.in);
		Tender obj[]=new Tender[5];
		for(i=0;i<5;i++)
			{
			System.out.println("Enter Company Name : ");
			cm_name=in.nextLine();
			cm_name=in.nextLine();
			System.out.println("Enter Cost : ");
			cost=in.nextInt();
			obj[i]=new Tender(cost,cm_name);
			}
		min_cost=obj[0].cost;
		for (i=0;i<5;i++)
			{
			obj[i].display();
			}
		for (i=0;i<5;i++)
			{
			if(min_cost>obj[i].cost)
				min_cost=obj[i].cost;
			}
		System.out.println("Minimum cost is "+min_cost);
		}
	}


			
		
		

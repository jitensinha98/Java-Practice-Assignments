import java.util.*;
class Information
	{
	int roll;
	char sec;
	Information(int r,char s)
		{
		roll=r;
		sec=s;
		}
	void display()
		{
		System.out.println("Roll="+roll+" Section="+sec);
		}
	}
class Student
	{
	public static void main(String args[])
		{
		int n,i,r;
		char s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of entries : ");
		n=in.nextInt();
		Information obj[]=new Information[n];
		for(i=0;i<n;i++)
			{
			System.out.println("Enter Roll and Section :");
			r=in.nextInt();
			s=in.next().charAt(0);
			obj[i]=new Information(r,s);
			}
		for (i=0;i<n;i++)
			{
			obj[i].display();
			}
		}
	}
		
			

import java.util.*;
class Constructor
	{
	int x;
	Constructor(int a)
		{
		x=a;
		}
	void display()
		{
		System.out.println("The value of x is "+x);
		}
	}
class Const
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of x : ");
		a=in.nextInt();
		Constructor ob=new Constructor(a);
		ob.display();
		}
	}
		

		

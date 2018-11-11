import java.util.*;
class Testing
	{
	int x,y,z;
	Testing(int a)
		{
		x=a;
		}
	Testing(int b,int c)
		{
		y=b;
		z=c;
		}
	void display()
		{
		System.out.println("x="+x+" y="+y+" z="+z);
		}
	}
class Const
	{
	public static void main(String args[])
		{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of x,y and z :");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		Testing obj=new Testing(a);
		Testing ob=new Testing(b,c);
		obj.display();
		ob.display();
		}
	}


import java.util.*;
class Test
	{
	int x,y,z;
	void input(int x,int y)
		{
		this.x=x;
		this.y=y;
		}
	}
class Basic extends Test
	{
	void input(int x,int y)
		{
		this.x=x;
		this.y=y;
                System.out.println("Function overidding");
		}
	void display()
		{
		System.out.println("X="+x);
		System.out.println("Y="+y);
		System.out.println("Z="+z);
		}
	}
class Inheritence
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int x,y;
		System.out.println("Enter x:");
		x=in.nextInt();
		System.out.println("Enter y:");
		y=in.nextInt();
		Basic ob=new Basic();
		ob.input(x,y);
		ob.display();
		}
	}

		

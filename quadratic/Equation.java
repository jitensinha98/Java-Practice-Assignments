import java.util.*;
class Quad
	{
	void quadratic(int a,int b,int c)
		{
		double x,y;
		x=((-b)+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		y=((-b)-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
		System.out.println("The roots of the equation are "+x+" and "+y);
		}
	}
class Equation
	{
	public static void main(String args[])
		{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter values in : (_x^2) + (_x) + (_) ");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		Quad ob=new Quad();
		ob.quadratic(a,b,c);
		}
	}

		

import java.util.*;
abstract class Shape
	{
	abstract void peri();
	abstract void area();
	}
class Rectangle extends Shape
	{
	int l,b;
	Rectangle(int l,int b)
		{
		this.l=l;
		this.b=b;
		}
	void area()
		{
		int area;
		area=l*b;
		System.out.println("The area is "+area);
		}
	void peri()
		{
		int peri;
		peri=2*(l+b);
		System.out.println("The perimeter is "+peri);
		}
	}
class Triangle extends Shape
	{
	int a,b,c;
	Triangle(int a,int b,int c)
		{
		this.a=a;
		this.b=b;
		this.c=c;
		}
	void peri()
		{
		int peri;
		peri=a+b+c;
		System.out.println("The perimeter is "+peri);
		}
	void area()
		{
		double area;
		area=0.5*b*c;
		System.out.println("The area is "+area);
		}
	}
class Geometry
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int l,b,a,b1,c;
		System.out.println("Rectangle");
		System.out.println("Enter length :");
		l=in.nextInt();
		System.out.println("Enter breadth :");
		b=in.nextInt();
		Rectangle ob=new Rectangle(l,b);
		ob.area();
		ob.peri();
		System.out.println("Traingle");
		System.out.println("Enter a :");
		a=in.nextInt();
		System.out.println("Enter b :");
		b1=in.nextInt();
		System.out.println("Enter c :");
		c=in.nextInt();
		Triangle ob1=new Triangle(a,b1,c);
		ob1.area();
		ob1.peri();
		}
	}
		



	

import java.util.*;
class Circle
	{
	private double radius;
	private String color;
	Circle()
		{
		radius=1.0;
		color="red";
		System.out.println("Color = "+color);
		}
	Circle(double rad)
		{
		radius=rad;
		}
	double getRadius()
		{
		 return radius;
		}
	double getArea()
		{
		double area;
		area=3.14*radius*radius;
		return area;
		}
	}
class Shape
	{
	public static void main(String args[])
		{
		int i;
		double rad;
		double area1,area2;
		Scanner in=new Scanner(System.in);
		Circle obj;
		System.out.println("Enter Circle Radius :");
		rad=in.nextDouble();
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		obj=new Circle(rad);
		area1=obj.getArea();
		System.out.println("Area = "+area1);
		System.out.println("Default Constructor");
		Circle ob=new Circle();
		area2=ob.getArea();
		System.out.println("Area = "+area2);
		}
	}
		
		
		
		
		

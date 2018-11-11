class Circle
	{
	void perimeter(double r)
		{
		double peri=0;
		peri=2*3.14*r;
		System.out.println("Perimeter of Circle is "+peri);
		}
	void area(double r)
		{
		double area=0;
		area=3.14*r*r;
		System.out.println("Area of a Circle is "+area);
		}
	}
class Calculate
	{
	public static void main(String args[])
		{
		Circle ob=new Circle();
		ob.perimeter(2.3);
		ob.area(2.3);
		}
	}


class Calc
	{
	double rad=5,area,perimeter;
	void area()
		{
		area=3.14*rad*rad;
		System.out.println("Area of Circle having radius "+rad+" is "+area);
		}
	void perimeter()
		{
		perimeter=2*(3.14)*rad;
		System.out.println("Perimeter of Circle having radius "+rad+" is "+perimeter);
		}
		
	}
class Circle
	{
	public static void main(String args[])
		{
		Calc obj=new Calc();
		obj.area();
		obj.perimeter();
		}
	}


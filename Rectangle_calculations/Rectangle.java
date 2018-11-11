class Calculation
	{
	int l=30,b=20,area,perimeter;
	void area()
		{
		area=l*b;
		System.out.println("Area of Rectangle having length "+l+" and breadth "+b+" is "+area);
		}
	void perimeter()
		{
		perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle having length "+l+" and breadth "+b+" is "+perimeter);
		}
		
	}
class Rectangle
	{
	public static void main(String args[])
		{
		Calculation obj=new Calculation();
		obj.area();
		obj.perimeter();
		}
	}

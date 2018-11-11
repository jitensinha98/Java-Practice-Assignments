import java.util.*;
class Vehicle
	{
	protected int regnNumber,speed;
	protected String color,owner_name;
	Vehicle(int regnNumber,int speed,String color,String owner_name)
		{
		this.regnNumber=regnNumber;
		this.speed=speed;
		this.color=color;
		this.owner_name=owner_name;
		}
	void showData()
		{
		System.out.println("Reg Number = "+regnNumber);
		System.out.println("Speed = "+speed);
		System.out.println("Color = "+color);		
		System.out.println("Owner Name = "+owner_name);
		}
	}
class Bus extends Vehicle
	{	
	private int route_number;
	Bus(int regnNumber,int speed,String color,String owner_name,int route_number)
		{
		super(regnNumber,speed,color,owner_name);
		this.route_number=route_number;
		}
	void showData()
		{
		System.out.println("Route Number ="+route_number);
		System.out.println("Reg Number = "+regnNumber);
		System.out.println("Speed = "+speed);
		System.out.println("Color = "+color);		
		System.out.println("Owner Name = "+owner_name);
		}
	}
class Car extends Vehicle
	{
	Scanner in=new Scanner(System.in);
	private String Manufacture_name;
	Car(int regnNumber,int speed,String color,String owner_name,String Manufacture_name)
		{
		super(regnNumber,speed,color,owner_name);
		this.Manufacture_name=Manufacture_name;
		}
	void showData()
		{
		System.out.println("Manufacturer's name ="+Manufacture_name);
		System.out.println("Reg Number = "+regnNumber);
		System.out.println("Speed = "+speed);
		System.out.println("Color = "+color);		
		System.out.println("Owner Name = "+owner_name);
		}
	}
class Automobile
	{
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	int ch;
	int regnNumber,speed,route_number;
	String color,owner_name,manf;
	System.out.println("Enter choice : 1.Bus 2.Car");
	ch=in.nextInt();
	System.out.println("Reg Number:");
	regnNumber=in.nextInt();
	System.out.println("Speed:");
	speed=in.nextInt();
	System.out.println("Color:");	
	color=in.nextLine();	
	System.out.println("Owner Name:");
	owner_name=in.nextLine();
	if (ch==1)
		{
		System.out.println("Enter Route Number :");
		route_number=in.nextInt();
		Bus ob1=new Bus(regnNumber,speed,color,owner_name,route_number);
		ob1.showData();
		}
	else
		{
		System.out.println("Enter Manufacturer name:");
		manf=in.nextLine();
		Car ob2=new Car(regnNumber,speed,color,owner_name,manf);
		ob2.showData();
		}
	}
}
		
	
	
	

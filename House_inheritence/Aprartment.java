import java.util.*;
class Building
	{
	int floors,rooms,total_footage;
	Building(int floors,int rooms,int total_footage)
		{
		this.floors=floors;
		this.rooms=rooms;
		this.total_footage=total_footage;
		}
	}
class House extends Building
	{
	int bdrms,btrms;
	House(int floors,int rooms,int total_footage,int bdrms,int btrms)
		{
		super(floors,rooms,total_footage);
		this.bdrms=bdrms;
		this.btrms=btrms;
		}
	void show()
		{
		System.out.println("Floors = "+floors);
		System.out.println("Rooms = "+rooms);
		System.out.println("Total footage = "+total_footage);
		System.out.println("Bedrooms = "+bdrms);
		System.out.println("Bathrooms = "+btrms);
		}
	}
class Aprarment
	{
	public static void main(String args[])
		{
		int floors,rooms,total_footage,bdrms,btrms;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter floors:");
		floors=in.nextInt();
		System.out.println("Enter rooms:");
		rooms=in.nextInt();
		System.out.println("Total footage:");
		total_footage=in.nextInt();
		System.out.println("Enter Bedrooms:");
		bdrms=in.nextInt();
		System.out.println("Enter Bathrooms:");
		btrms=in.nextInt();
		House ob=new House(floors,rooms,total_footage,bdrms,btrms);
		ob.show();
		}
	}



		


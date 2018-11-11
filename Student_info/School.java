import java.util.*;
class Student
	{
	String name;
	int roll_no,sub1,sub2;
	int tot,per;
	Student(String name,int roll_no,int sub1,int sub2)
		{
		this.name=name;
		this.roll_no=roll_no;
		this.sub1=sub1;
		this.sub2=sub2;
		}
	void calculate()
		{
		tot=sub1+sub2;
		per=(tot*100)/200;
		}
	void display()
		{
		System.out.println("Name : "+name);
		System.out.println("Roll no : "+roll_no);
		System.out.println("SUB 1 : "+sub1);
		System.out.println("SUB 2 : "+sub2);
		System.out.println("Total : "+tot);
		System.out.println("Percentage : "+per);
		}
	}
class School
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		String name;
		int roll_no,sub1,sub2;		
		System.out.println("Enter Name : ");
		name=in.nextLine();
		name=in.nextLine();
		System.out.println("Enter Roll no : ");
		roll_no=in.nextInt();
		System.out.println("Enter SUB 1 : ");
		sub1=in.nextInt();
		System.out.println("Enter SUB 2 : ");
		sub2=in.nextInt();
		Student ob=new Student(name,roll_no,sub1,sub2);
		ob.calculate();
		ob.display();
		}
	}
	

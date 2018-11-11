import java.util.*;
class Employee
	{
	int empid,salary;
	String name;
	Employee(int id,String n,int sal)
		{
		empid=id;
		name=n;
		salary=sal;
		}
	void display()
		{
		System.out.println("id="+empid+" name="+name+" salary="+salary);
		}
	}
class Office
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int id,sal,i;
		String name;
		Employee obj[]=new Employee[5];
		for(i=0;i<5;i++)
			{
			System.out.println("Enter ID : ");
			id=in.nextInt();
			System.out.println("Enter Name : ");
			name=in.nextLine();
			name=in.nextLine();
			System.out.println("Enter Salary : ");
			sal=in.nextInt();
			obj[i]=new Employee(id,name,sal);
			}
		for(i=0;i<5;i++)
			{
			obj[i].display();
			}
		}
	}


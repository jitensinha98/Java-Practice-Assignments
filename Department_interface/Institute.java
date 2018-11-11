import java.util.*;
interface Department
	{
	void print_dept_attributes(String p,String q);
	}
class Hostel
	{
	String hostelName,hostelLocation;
	int numberofRooms;
	void get_value(String x,String y,int z)
		{
		hostelName=x;
		hostelLocation=y;
		numberofRooms=z;
		}
	void print_value()
		{
		System.out.println("Hostel Name = "+hostelName);
		System.out.println("Hostel Location = "+hostelLocation);
		System.out.println("Number of Rooms = "+numberofRooms);
		}
	}
class Student extends Hostel implements Department
	{
	String deptName,deptHead;
	String hostelName,hostelLocation,studentName,electiveSubject;
	int regdNo,avgMarks;
	void getData(String a,String b,int c,int d)
		{
		studentName=a;
		electiveSubject=b;
		regdNo=c;
		avgMarks=d;
		}
	void printData()
		{
		System.out.println("Student Name = "+studentName);
		System.out.println("Elective Subject = "+electiveSubject);
		System.out.println("Registration ID = "+regdNo);	
		System.out.println("Average Marks = "+avgMarks);	
		}
	public void print_dept_attributes(String p,String q)
		{
		deptName=p;
		deptHead=q;
		System.out.println("Department Name = "+deptName);
		System.out.println("Department Head = "+deptHead);		
		}	
	}
class Institute
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int ID,i;
		boolean Stop= false;
		String hostel_name[]=new String[100];
		String hostel_location[]=new String[100];
		int no_of_rooms[]=new int[100];
		String student_name[]=new String[100];
		String elective_subject[]=new String[100];	
		int regd_No[]=new int[100];
		int avg_Marks[]=new int[100];
		String dept_name[]=new String[100];
		String dept_head[]=new String[100];
		String deptName,deptHead,hostelName,hostelLocation,studentName,electiveSubject;
		int numberofRooms,regdNo,avgMarks;
		int ch,counter=0;
		while(Stop != true)
		{
		System.out.println("Enter Choice : 1.Add a student 2.Migrate a Student 3.Display Details 4.Stop");
		ch=in.nextInt();
		counter=0;
		switch(ch)
			{
			case 1:
				System.out.println("Enter Student Name :");
				studentName=in.nextLine();
				studentName=in.nextLine();
				System.out.println("Enter elective Subject:");
				electiveSubject=in.nextLine();
				electiveSubject=in.nextLine();
				System.out.println("Enter Registration ID :");
				regdNo=in.nextInt();
				System.out.println("Enter Average Marks:");
				avgMarks=in.nextInt();
				student_name[counter]=studentName;				
				elective_subject[counter]=electiveSubject;
				regd_No[counter]=regdNo;
				avg_Marks[counter]=avgMarks;
				System.out.println();
				break;
				
			case 2:
				
				System.out.println("Enter number of rooms :");
				numberofRooms=in.nextInt();
				System.out.println("Enter Hostel Name :");
				hostelName=in.nextLine();
				hostelName=in.nextLine();
				System.out.println("Enter Hostel Location:");
				hostelLocation=in.nextLine();
				System.out.println("Enter Department Name :");
				deptName=in.nextLine();
				hostelName=in.nextLine();
				System.out.println("Enter Department Head :");
				deptHead=in.nextLine();
				no_of_rooms[counter]=numberofRooms;
				hostel_name[counter]=hostelName;
				hostel_location[counter]=hostelLocation;
				dept_name[counter]=deptName;
				dept_head[counter]=deptHead;
				counter++;
				System.out.println();
				break;
		
			case 3:
				System.out.println("Enter regID :");
				ID=in.nextInt();
				System.out.println();
				for(i=0;i<=counter;i++)
					{
					if(regd_No[i]==ID)
						{
						Student ob=new Student();
						ob.getData(student_name[i],elective_subject[i],regd_No[i],avg_Marks[i]);
						ob.printData();
						ob.print_dept_attributes(dept_name[i],dept_head[i]);
						ob.get_value(hostel_name[i],hostel_location[i],no_of_rooms[i]);
						ob.print_value();
						}
					}	
				System.out.println();
				break;			
						
			case 4:
				Stop=true;
				break;
			}
			}
		}
	}




				
			

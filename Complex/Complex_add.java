import java.util.*;
class Complex
	{
	int real;
	int imaginary;
	Complex(int real,int imaginary)
		{
		this.real=real;
		this.imaginary=imaginary;
		}
	void add(Complex obj)
		{
		this.real=this.real+obj.real;
		this.imaginary=this.imaginary+obj.imaginary;
		}
	void display()
		{
		System.out.println("Real="+real+" Imaginary="+imaginary);
		}
	}
class Complex_add
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int r1,r2,i1,i2;
		System.out.println("Enter two real number : ");
		r1=in.nextInt();
		r2=in.nextInt();
		System.out.println("enter two imaginary numbers : ");
		i1=in.nextInt();
		i2=in.nextInt();
		Complex ob1=new Complex(r1,i1);
		Complex ob2=new Complex(r2,i2);
		System.out.println("Before Add : ");
		ob1.display();
		ob2.display();
		System.out.println("After Add : ");
		ob1.add(ob2);
		ob1.display();
		}
	}
		
	

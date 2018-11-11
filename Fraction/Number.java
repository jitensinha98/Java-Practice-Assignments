import java.util.*;
class Fraction
	{
	int numerator,denominator;
	double fraction;
	Fraction(int numerator,int denominator)
		{
		this.numerator=numerator;
		this.denominator=denominator;
		}
	double calculate()
		{
		fraction=numerator/denominator;
		return fraction;
		}
	void display()
		{
		double getResult;
		getResult=calculate();
		System.out.println("Fraction is :"+getResult);
		}
	}
class Number
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int numerator,denominator;
		System.out.println("Enter numerator : ");
		numerator=in.nextInt();
		System.out.println("Enter denominator : ");
		denominator=in.nextInt();
		Fraction ob=new Fraction(numerator,denominator);
		ob.display();
		}
	}

		

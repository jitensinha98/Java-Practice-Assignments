class Conversion
	{
	int c=32,f;
	void convert()
		{
		f=(((9*c)+32)/5);
		System.out.println("The Temperature "+c+" Celsius in Fahrenheit is "+f);
		}
	}
class Temperature
	{
	public static void main(String args[])
		{
		Conversion obj=new Conversion();
		obj.convert();
		}
	}

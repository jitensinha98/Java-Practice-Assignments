class Transform
	{
	int f=100,c;	
	void convert_to()
		{
		c=(((f-32)*9)/5);
		System.out.println(f+" Fahrenheit is "+c+" Celsius");
		}
	}
class FahrenheittoCelsius
	{
	public static void main(String args[])
		{
		Transform obj=new Transform();
		obj.convert_to();
		}
	}

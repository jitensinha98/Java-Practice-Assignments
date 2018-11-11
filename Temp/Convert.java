class Calculate
	{
	void convert(float f)
		{
		float c=0.0f;
		c=(((f-32)*9)/5);
		System.out.println("Temperature in Celsius is "+c);
		}
	}
class Convert
	{
	public static void main(String args[])
		{
		Calculate ob=new Calculate();
		ob.convert(123.4f);
		}
	}

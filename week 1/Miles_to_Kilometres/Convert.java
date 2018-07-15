class MTK
	{
	double KM,m=3;
	void convert()
		{
		KM=m/0.62137;
		System.out.println(m+" miles in Kilometres is "+KM);
		}
	}
class Convert
	{
	public static void main(String args[])
		{
		MTK obj=new MTK();
		obj.convert();
		}
	}


import java.util.*;
abstract class Abstractproduct
	{
	int product_id;
	String name,description;
	Abstractproduct(int product_id,String name,String description)
		{
		this.product_id=product_id;
		this.name=name;
		this.description=description;
		}
	}
class Product extends Abstractproduct
	{
	int price;
	Product(int product_id,String name,String description,int price)
		{
		super(product_id,name,description);
		this.price=price;
		}
	}
class Book extends Product
	{
	int ISBN;
	String author,title;
	Book(int product_id,String name,String description,int price,int ISBN,String author,String title)
		{
		super(product_id,name,description,price);
		this.ISBN=ISBN;
		this.author=author;
		this.title=title;
		}
	}
class CompactDisc extends Product
	{
	String artist,title;
	CompactDisc(int product_id,String name,String description,int price,String artist,String title)
		{
		super(product_id,name,description,price);
		this.artist=artist;
		this.title=title;
		}
	void display()
		{
		System.out.println("ID : "+product_id);
		System.out.println("NAME : "+name);
		System.out.println("DESCRIPTION : "+description);
		System.out.println("PRICE : "+price);
		System.out.println("ARTIST : "+artist);
		System.out.println("TITLE : "+title);
		}
	}
class Travelguide extends Book
	{
	String country;
	Travelguide(int product_id,String name,String description,int price,int ISBN,String author,String title,String country)
		{
		super(product_id,name,description,price,ISBN,author,title);
		this.country=country;
		}
	void display()
		{
		System.out.println("ID : "+product_id);
		System.out.println("NAME : "+name);
		System.out.println("DESCRIPTION : "+description);
		System.out.println("PRICE : "+price);
		System.out.println("ISBN : "+ISBN);
		System.out.println("AUTHOR : "+author);
		System.out.println("TITLE : "+title);
		System.out.println("COUNTRY : "+country);
		}
	}
class BookStore
	{
	public static void main(String args[])
		{
		Scanner in=new Scanner(System.in);
		int ch;
		int id,price,ISBN;
		boolean stop=false;
		String name,description,author,title,country,artist;
		Travelguide ob1;
		CompactDisc ob2;
		System.out.println("Enter Choice : 1.Enter Travel Guide  2. Enter Disc  3.Stop");
		ch=in.nextInt();
		while(stop !=true)
		{
		switch(ch)
			{
			case 1:
				System.out.println("Enter : id,name,description,price,ISBN,author,title,country");
				id=in.nextInt();
				name=in.nextLine();
				description=in.nextLine();
				price=in.nextInt();
				ISBN=in.nextInt();
				author=in.nextLine();
				author=in.nextLine();
				title=in.nextLine();
				title=in.nextLine();
				country=in.nextLine();
				ob1=new Travelguide(id,name,description,price,ISBN,author,title,country);
				ob1.display();
				break;
			case 2:
				System.out.println("Enter : id,name,description,price,artist,title");
				id=in.nextInt();
				name=in.nextLine();
				description=in.nextLine();
				price=in.nextInt();
				artist=in.nextLine();
				artist=in.nextLine();
				title=in.nextLine();
				ob2=new CompactDisc(id,name,description,price,artist,title);
				ob2.display();
				break;	
			case 3 :
				stop=true;
				break;

			}			
			}
		}
	}
					



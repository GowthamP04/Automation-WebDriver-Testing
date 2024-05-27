package CoreJavaPrograms;

interface Shape
{
	int lenght=10;  // final & static
	int width=20; // final & static
	
	void circle();  // abstract method- un-implemented
	
	default void sqaure() // default method
	{
		System.out.println("this is sqaure- defualt method");
	}
	
	static void rectangle() // static method
	{
		System.out.println("this is rectangle");
	}
	
}



public class InheritanceDemo implements Shape
{

	public void circle()
	{
		System.out.println("this is circle ");
	}
	
	
	public static void main(String[] args) 
	{
		InheritanceDemo idobj=new InheritanceDemo();
		
		idobj.circle();
		idobj.sqaure();
		
		Shape.rectangle(); // static method can directly access
	
		//Shape sh=new Shape();   // incorrect
		
		Shape sh=new InheritanceDemo();
		sh.circle();
		sh.sqaure();
		
	}
}

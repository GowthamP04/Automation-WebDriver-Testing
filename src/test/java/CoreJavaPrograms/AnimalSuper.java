package CoreJavaPrograms;
//super

public class AnimalSuper {

	String color="white";

	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog extends AnimalSuper
{
	String color="black";


	void displayColor()
	{
		System.out.println(super.color);
	}

	void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
}
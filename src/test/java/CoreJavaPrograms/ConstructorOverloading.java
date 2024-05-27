package CoreJavaPrograms;

public class ConstructorOverloading {

	int x,y;
	double d;

	ConstructorOverloading()  //1
	{
		x=10;
		y=20;
	}


	ConstructorOverloading(int a, int b)  //2
	{
		x=a;
		y=b;
	}


	ConstructorOverloading(int a, double b)   //3
	{
		x=a;
		d=b;
	}

	ConstructorOverloading(double b,int a)   //4
	{
		x=a;
		d=b;
	}

	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);

	}


	public static void main(String[] args)
	{

		ConstructorOverloading  co=new ConstructorOverloading(20.5,100);

		co.display();
	}
}
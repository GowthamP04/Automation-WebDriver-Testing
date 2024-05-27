package CoreJavaPrograms;

//inheritance
class A  //single inheritance
{
	int a;

	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b;

	void show()
	{
		System.out.println(b);
	}

}

class C extends B  //multi level inheritance
{
	int c;

	void print()
	{
		System.out.println(c);
	}

}


public class InheritanceTypes {

	public static void main(String[] args) {

		/*B bobj=new B();

bobj.a=100;
bobj.b=200;

bobj.display();
bobj.show();*/


		C cobj=new C();

		cobj.a=10;
		cobj.b=20;
		cobj.c=30;

		cobj.display();
		cobj.show();
		cobj.print();


	}

}
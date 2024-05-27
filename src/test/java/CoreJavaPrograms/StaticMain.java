package CoreJavaPrograms;

public class StaticMain {

	public static void main(String[] args) {

		//1) static methods can access static stuff directly ( without object).

				System.out.println(StaticExample.a);
				//System.out.println(b); // incorrect, bcoz b is non-static varaible
				
				StaticExample.m1();
				//m2();   // incorrect , bcoz m2() is non-static method
				
				
				
				//2) static methods can access non-static stuff through object
				
				StaticExample se=new StaticExample();
				System.out.println(se.b);
				se.m2();
				
				se.m();

	}

}
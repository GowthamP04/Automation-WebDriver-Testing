package CoreJavaPrograms;

public class ExceptionsDemo {

	public static void main(String[] args) {

		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");

		//Example1
		/*Scanner sc=new Scanner(System.in);

System.out.println("Enter a number:");
int num=sc.nextInt();

System.out.println(100/num);  //ArithmeticException
		 */


		//Example2
		/*int a[]=new int[5]; //0...4

Scanner sc=new Scanner(System.in);

System.out.println("Enter a number:");
int num=sc.nextInt();

System.out.println("Enter position(0-4):");
int pos=sc.nextInt();

a[pos]=num;   //ArrayIndexOutOfBoundsException

System.out.println(a[pos]);*/


		//Example3

		String s="welcome";
		int num=Integer.parseInt(s); //NumberFormatException
		System.out.println(num);

		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");


	}

}
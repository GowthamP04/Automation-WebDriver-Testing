package CoreJavaPrograms;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number:");
		int num=sc.nextInt();

		try
		{
			System.out.println(100/num);  //ArithmeticException
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You have entered invalid input.");

		}

		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");

	}

}
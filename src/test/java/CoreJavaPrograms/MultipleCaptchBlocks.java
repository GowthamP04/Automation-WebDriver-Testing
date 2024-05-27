package CoreJavaPrograms;

import java.util.Scanner;

public class MultipleCaptchBlocks {

	public static void main(String[] args) {
		System.out.println("Program is  started..");
		System.out.println("Program is  in progress..");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		String s=null;

		/*try
		{
		//System.out.println(100/num);  
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception thown");
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception thown");
		}
		catch(NullPointerException e)
		{
			System.out.println("Nullpointer exception thown.");
		}*/
		
		try
		{
		//System.out.println(100/num);  
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("exception thown");
		}
				
		System.out.println("Program is  completed..");
		System.out.println("Program is  exited..");


	}

}
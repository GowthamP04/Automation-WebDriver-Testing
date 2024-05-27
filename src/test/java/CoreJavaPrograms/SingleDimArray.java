package CoreJavaPrograms;

import java.util.Arrays;

/*1) Declare an array
2) insert values into array
3) Find size of an array
4) read single value from an array
5) read multiple values from an array */

public class SingleDimArray {

	public static void main(String[] args) {
		
		//declaration
		
				//appraoch1
				
				/*int a[]=new int[5];  //declare
				
				a[0]=100;
				a[1]=200;
				a[2]=300;
				a[3]=500;
				a[4]=600;*/
				
				//appraoch2
				int a[]= {100,200,300,400,500,600};
				
				
				//size/lenght of an array

				System.out.println(a.length); //6
				
				//get single value from array
				System.out.println(a[3]); //400
				
				//get all the values from array
				System.out.println(Arrays.toString(a)); //[100, 200, 300, 400, 500, 600]
				
				//get all the values by using loop
				
				/*for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}*/
				
				// read data from array using enhanced for loop
				
				for(int x:a)
				{
					System.out.println(x);
				}

	}

}
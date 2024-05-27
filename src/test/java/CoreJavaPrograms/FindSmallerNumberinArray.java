package CoreJavaPrograms;

import java.util.Arrays;

public class FindSmallerNumberinArray {

	public static void main(String[] args) {
		
		//removing dollor sign
		
				String price="$200.98";
				String price1=price.replace("$",""); // remove the dollor sign
				System.out.println(Double.parseDouble(price1)); //converted to number
				
				//find smallest number in array
				
				int a[]= {500,400,100,200,700};
				
				Arrays.sort(a);
				
				System.out.println("smallest number:"+a[0]);
				
				System.out.println("$"+a[0]);
				

	}

}
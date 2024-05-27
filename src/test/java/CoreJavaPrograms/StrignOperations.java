package CoreJavaPrograms;

public class StrignOperations {
	
public static void main(String[] args) {
		
		String s="welcome";
		//String s=new String("welcome");
		
		System.out.println(s);
		
		
		//length()  - returns length of a string   
		System.out.println(s.length()); //7  total number of characters
	
		//concat() - joining strings
		
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1+s2); //welcometo java
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		
		//trim() - remove right and left side spaces
		s="    automation     ";
				
		//String res=s.trim();
		System.out.println(s.length()); //19
		System.out.println(s.trim().length()); //10
		
		//charAt() - returns  a single char based on index we passed
		//index count starts from 0
		
		s="welcome";
		
		System.out.println(s.charAt(0)); //w
		System.out.println(s.charAt(3)); //c
		
		//contains() - returns boolean   true/false
		
		System.out.println(s.contains("wel")); //true

		System.out.println(s.contains("com")); //true
		
		System.out.println(s.contains("Wel")); //false
		
		
		//equals() ,   equalsIgnoreCase() - compare 2 strings
		// retuns boolean value
		
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2));  //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		
		//replace() - replace single/multiple characters in a string
		s="welcome to selenium automation testing selenium training";
		
		System.out.println(s.replace('e','X')); //wXcomX to sXlXnium automation tXsting sXlXnium training
		System.out.println(s.replace("selenium","java")); //welcome to java automation testing java training
		
		//substring() - to extract substring from main string
		s="welcome";
		System.out.println(s.substring(2, 5)); //lco
		System.out.println(s.substring(0,6)); //welcom
		
		//split() - divide the string into multiple parts using delimeter		
		// should not use  *  $   ^ ? .   + -
		
		s="abc@gmail.com";
		
		String a[]=s.split("@");
			
		System.out.println(a[0]); // abc
		//System.out.println(a[1]); // @gmail.com
			
		//toUpperCase(), toLowerCase()
		
		s="welCOME";
			
		System.out.println(s.toLowerCase()); //welcome
		System.out.println(s.toUpperCase()); //WELCOME
		
	}


}
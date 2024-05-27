package CoreJavaPrograms;

import java.util.HashSet;
/*
 * 1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
 */

public class HashSetDemo {

	public static void main(String[] args) {
		//declaration
				HashSet myset=new HashSet();
				//Set myset=new HashSet();
				//HashSet <Integer>myset=new HashSet<Integer>();
				
				myset.add(100);
				myset.add(10.5);
				myset.add("welcome");
				myset.add(100);
				myset.add(null);
				myset.add(null);
				
				System.out.println(myset); //[null, 100, 10.5, welcome]   // insertion order not preserved
				
				System.out.println(myset.size()); //4
				
				//remove value from hashset
				myset.remove(10.5); // we have to pass value but not index - index wont support here
				System.out.println("after removing:"+ myset); //[null, 100, welcome]
				
				// insertion is not possible in hashset
				
				
				//get specific value from hashset - not possible
				
				
				for(Object x:myset)
				{
					System.out.println(x);
				}

	}

}
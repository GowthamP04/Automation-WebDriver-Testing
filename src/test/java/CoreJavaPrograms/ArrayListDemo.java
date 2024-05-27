package CoreJavaPrograms;

import java.util.ArrayList;

/*1) Heterogenious data - allowed
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed */
public class ArrayListDemo {

	public static void main(String[] args) {
		//declaration
				ArrayList mylist=new ArrayList();
				//ArrayList <String>mylist=new ArrayList<String>();  // only strings
				//List mylist=new ArrayList();

				
				//adding data elements into arraylist
				mylist.add(100);
				mylist.add(10.5);
				mylist.add("welcome");
				mylist.add(true);
				mylist.add(100);
				mylist.add(null);
				mylist.add(null);

				//size of arraylist
				System.out.println(mylist.size());//7
				
				System.out.println(mylist); //[100, 10.5, welcome, true, 100, null, null]
				
				//remove value from arraylist
				mylist.remove(3);
				System.out.println("After removing element:"+mylist); //[100, 10.5, welcome, 100, null, null]
				
				//inserting new element in the middle of the list
				mylist.add(2,"java");
				
				System.out.println("after insertion:"+mylist); //[100, 10.5, java, welcome, 100, null, null]
				
				System.out.println(mylist.get(3));
				
				//read all teh data from arraylist
				
				for(Object x:mylist)
				{
					System.out.println(x);
				}
				
				mylist.clear(); //clears the data from arraylist
				System.out.println("After clearing"+ mylist); // []


	}

}
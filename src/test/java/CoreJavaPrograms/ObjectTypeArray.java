package CoreJavaPrograms;

public class ObjectTypeArray {

	public static void main(String[] args) {


		Object a[]=new Object[5];

		a[0]=10;
		a[1]=10.5;
		a[2]="welcome";
		a[3]='A';
		a[4]=true;

		/*for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}*/

		for(Object x:a)
		{
			System.out.println(x);
		}

	}

}
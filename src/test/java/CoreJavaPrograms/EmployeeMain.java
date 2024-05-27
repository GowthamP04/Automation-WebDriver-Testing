package CoreJavaPrograms;

public class EmployeeMain {

	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.ename="John";
		emp1.job="Engineer";
		emp1.esal=50000;

		emp1.display();

		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="Scott";
		emp2.job="Manager";
		emp2.esal=70000;

		emp2.display();


	}
}
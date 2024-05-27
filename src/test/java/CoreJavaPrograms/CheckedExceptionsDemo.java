package CoreJavaPrograms;

public class CheckedExceptionsDemo {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("program is started....");

		System.out.println("program is in progress....");

		/*try
{
Thread.sleep(5000);
}
catch (InterruptedException e)
{
e.printStackTrace();
}*/

		Thread.sleep(5000);

		System.out.println("program is finished....");

		System.out.println("program is terminated....");
	}

}
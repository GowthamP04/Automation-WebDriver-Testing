package CoreJavaPrograms;

final class Test1
{
	final void m()
	{
		System.out.println("this is m from Test1 class...");
	}
}

class Test2 //extends Test1    // incorrect, bcoz Test1 is final class
{
	void m()   // incorrect, bcoz m() is final method
	{
		System.out.println("this is m from Test2 class...");
	}
}


public class FinalKeywordDemo2 {

	public static void main(String[] args)
	{


	}
}
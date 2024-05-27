package CoreJavaPrograms;

public class GreetingsMain {

	public static void main(String[] args)
	{
		Greetings gr=new Greetings();
		//gr.greeting1();    //1

		//String str=gr.greeting2(); //2
		//System.out.println(str);

		//System.out.println(gr.greeting2());  //2

		//gr.greeting3("John");  //3

		String str=gr.greeting4("John");
		System.out.println(str);

	}

}
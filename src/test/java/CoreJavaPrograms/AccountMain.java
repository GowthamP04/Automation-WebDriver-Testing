package CoreJavaPrograms;

public class AccountMain {

	public static void main(String[] args) {

		Account accobj=new Account();

		accobj.setAcc_no(1234); 
		accobj.setName("John");
		accobj.setAmount(50000);

		System.out.println(accobj.getAcc_no());
		System.out.println(accobj.getName());
		System.out.println(accobj.getAmount());

	}

}
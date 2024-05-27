package CoreJavaPrograms;

public class interfacePQR extends interfaceMNO implements interfaceABC,interfaceXYZ
{

	public void m2() {

		System.out.println("this is m2 from XYZ");
		System.out.println(y);
	}

	public void m1() {
		System.out.println("this is m1 from ABC");
		System.out.println(x);

	}

	public static void main(String[] args) {

		interfacePQR obj=new interfacePQR();
		obj.m1();
		obj.m2();
		obj.m3();

	}


}
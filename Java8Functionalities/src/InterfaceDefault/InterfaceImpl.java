package InterfaceDefault;

public class InterfaceImpl implements Interface1,Interface2{

	@Override
	public void method2(String str) {
		System.out.println("Method 2 in impl class");
	}

	@Override
	public void method1() {
		System.out.println("Method 1 in impl class");
	}

	@Override
	public void log(String str) {
		//Interface1.super.log(str);
		Interface2.print("abc");
	}
	
	
	
	
}

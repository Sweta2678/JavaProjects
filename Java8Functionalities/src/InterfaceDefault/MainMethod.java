package InterfaceDefault;

public class MainMethod {
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		impl.method1();
		impl.method2("sweta");
		impl.log("khatsuriya");
		Interface2.print("JK");
	}
}

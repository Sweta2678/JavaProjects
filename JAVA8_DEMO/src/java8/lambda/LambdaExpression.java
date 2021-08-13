package java8.lambda;

public class LambdaExpression {
	public static void main(String[] args) {
		int width = 10;

		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing " + width);
			}
		};
		d.draw();

		Drawable d2 = () -> {
			System.out.println("Drawing 222:  " + width);
		};
		d2.draw();

		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Sonoo"));

		// You can omit function parentheses
		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Sonoo"));
	}

}

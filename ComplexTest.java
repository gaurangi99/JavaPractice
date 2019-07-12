public class ComplexTest {

	public static void main(String[] args) {
		Complex c = new Complex();
		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(-2, 3);
		Complex c3 = new Complex(2, -3);
		Complex c4 = new Complex(-2, -3);
		System.out.printf("After instantiation:");
		System.out.println(c);
		displayComplex("Complex no. c1: \n", c1);
		displayComplex("Complex no. c2: \n", c2);
		displayComplex("Complex no. c3: \n", c3);
		displayComplex("Complex no. c4: \n", c4);
		c.addComplex(c1, c2);
		displayComplex("Complex no. after adding c1 & c2: \n", c);
		displayComplex("Complex no. c1: \n", c1);
		displayComplex("Complex no. c2: \n", c2);
		c.subComplex(c1, c2);
		displayComplex("Complex no. after subtracting c1 & c2: \n", c);
		displayComplex("Complex no. c1: \n", c1);
		displayComplex("Complex no. c2: \n", c2);
		// TODO Auto-generated method stub
	}

	public static void displayComplex(String header, Complex c) {
		System.out.printf("%s %s\n", header, c);
	}
}

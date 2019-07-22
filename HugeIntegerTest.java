public class HugeIntegerTest {

	public static void main(String[] args) {
		HugeInteger h = new HugeInteger();
		HugeInteger h1 = new HugeInteger("2020438836736576577563757376872378192045");
		HugeInteger h2 = new HugeInteger("9073621458237189450690736214582371894506");
		HugeInteger h3 = new HugeInteger("9999999999999999999999999999999999999999");
		HugeInteger h4 = new HugeInteger("6999999999999999999999999999999999999999");
		HugeInteger h5 = new HugeInteger("1000000000000000000000000000000000000011");
		HugeInteger h6 = new HugeInteger("1000000000000000000000000000000000000011");
		HugeInteger h7 = new HugeInteger("0");
		HugeInteger h8 = new HugeInteger("275904");
		HugeInteger h9 = new HugeInteger("73045");
		HugeInteger h10 = new HugeInteger("700000");
		HugeInteger h11 = new HugeInteger("700900");
		HugeInteger h12 = new HugeInteger("625999");
		HugeInteger h13 = new HugeInteger("625989");
		HugeInteger h14 = new HugeInteger("85070");
		HugeInteger h15 = new HugeInteger("17899");
		HugeInteger h16 = new HugeInteger("4");
		displayHugeInteger("h1:", h1);
		displayHugeInteger("h2:", h2);
		displayHugeInteger("h3:", h3);
		displayHugeInteger("h4:", h4);
		displayHugeInteger("h5:", h5);
		displayHugeInteger("h6:", h6);
		displayHugeInteger("h7:", h7);
		displayHugeInteger("h8:", h8);
		displayHugeInteger("h9:", h9);
		displayHugeInteger("h10:", h10);
		displayHugeInteger("h11:", h11);
		displayHugeInteger("h12:", h12);
		displayHugeInteger("h13:", h13);
		displayHugeInteger("h14:", h14);
		displayHugeInteger("h15:", h15);
		displayHugeInteger("h16:", h16);
		System.out.println();
		h.add(h4, h1);
		displayHugeInteger("Addition of h4 & h1:", h);
		// h.sub(h8, h9);
		// displayHugeInteger("Subtraction of h8 & h9:", h);
		// h.sub(h10, h12);
		// displayHugeInteger("Subtraction of h10 & h12:", h);
		// h.sub(h11, h13);
		// displayHugeInteger("Subtraction of h11 & h13:", h);
		// h.sub(h14, h15);
		// displayHugeInteger("Subtraction of h14 & h15:", h);
		h.mul(h1, h16);
		displayHugeInteger("Multilication of h1 & h16:", h);
		// displayComparison(HugeInteger.isEqualTo(h1, h2));
		// displayComparison(HugeInteger.isEqualTo(h5, h6));
		// displayComparison(HugeInteger.isNotEqualTo(h5, h6));
		// displayComparison(HugeInteger.isNotEqualTo(h1, h2));
		// displayComparison(HugeInteger.isGreaterThan(h1, h2));
		// displayComparison(HugeInteger.isGreaterThan(h2, h1));
		// displayComparison(HugeInteger.isGreaterThan(h2, h3));
		// displayComparison(HugeInteger.isGreaterThan(h3, h2));
		// displayComparison(HugeInteger.isGreaterThan(h5, h6));
		// displayComparison(HugeInteger.isGreaterThanOrEqualTo(h1, h2));
		// displayComparison(HugeInteger.isGreaterThanOrEqualTo(h2, h1));
		// displayComparison(HugeInteger.isGreaterThanOrEqualTo(h5, h6));
		// displayComparison(HugeInteger.isGreaterThanOrEqualTo(h2, h3));
		// displayComparison(HugeInteger.isGreaterThanOrEqualTo(h3, h2));
		// displayComparison(HugeInteger.isLessThan(h1, h2));
		// displayComparison(HugeInteger.isLessThan(h2, h1));
		// displayComparison(HugeInteger.isLessThan(h2, h3));
		// displayComparison(HugeInteger.isLessThan(h3, h2));
		// displayComparison(HugeInteger.isLessThan(h5, h6));
		// displayComparison(HugeInteger.isLessThanOrEqualTo(h1, h2));
		// displayComparison(HugeInteger.isLessThanOrEqualTo(h2, h1));
		// displayComparison(HugeInteger.isLessThanOrEqualTo(h2, h3));
		// displayComparison(HugeInteger.isLessThanOrEqualTo(h3, h2));
		// displayComparison(HugeInteger.isLessThanOrEqualTo(h5, h6));
		// displayComparison(HugeInteger.isZero(h6));
		// displayComparison(HugeInteger.isZero(h7));
		// TODO Auto-generated method stub
	}

	public static void displayComparison(boolean b) {
		System.out.printf("Result: %b\n", b);
	}

	public static void displayHugeInteger(String header, HugeInteger h) {
		System.out.printf("%s %s \n", header, h);
	}
}

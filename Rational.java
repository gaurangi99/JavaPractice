import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rational {
	private int numerator;
	private int denominator;

	public Rational(int n, int d) {
		simplify(n, d);
		// int nr = n;
		// int dr = d;
		// int rem = 0;
		// if (dr != 0) {
		// if (dr > nr) {
		// rem = dr % nr;
		// while (dr % nr != 0) {
		// rem = dr % nr;
		// dr = nr;
		// nr = rem;
		// }
		// n /= nr;
		// d /= nr;
		// } else {
		// rem = nr % dr;
		// while (nr % dr != 0) {
		// rem = nr % dr;
		// nr = dr;
		// dr = rem;
		// }
		// n /= dr;
		// d /= dr;
		// }
		// numerator = n;
		// denominator = d;
		// } else
		// throw new IllegalArgumentException("Denominator can't be zero!!");

	}

	public Rational() {
		numerator = 0;
		denominator = 1;
	}

	public void simplify(int n, int d) {
		int nr = n;
		int dr = d;
		int rem = 0;
		if (dr != 0) {
			if (dr > nr) {
				rem = dr % nr;
				while (dr % nr != 0) {
					rem = dr % nr;
					dr = nr;
					nr = rem;
				}
				n /= nr;
				d /= nr;
			} else {
				rem = nr % dr;
				while (nr % dr != 0) {
					rem = nr % dr;
					nr = dr;
					dr = rem;
				}
				n /= dr;
				d /= dr;
			}
			numerator = n;
			denominator = d;
		} else
			throw new IllegalArgumentException("Denominator can't be zero!!");
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int n) {
		numerator = n;
	}

	public void setDenominator(int d) {
		denominator = d;
	}

	public void newAdd(Rational r) {
		int n1, n2, nr, dr;
		dr = r.getDenominator() * this.denominator;
		n1 = this.numerator * r.getDenominator();
		n2 = r.getNumerator() * this.denominator;
		nr = n1 + n2;
		this.numerator = nr;
		this.denominator = dr;
		simplify(this.numerator, this.denominator);
	}

	public void newSub(Rational r) {
		int n1, n2, nr, dr;
		dr = r.getDenominator() * this.denominator;
		n1 = this.numerator * r.getDenominator();
		n2 = r.getNumerator() * this.denominator;
		nr = n1 - n2;
		this.numerator = nr;
		this.denominator = dr;
		simplify(this.numerator, this.denominator);
	}

	public void newMul(Rational r) {
		int n1, n2, nr, dr;
		dr = r.getDenominator() * this.denominator;
		nr = r.getNumerator() * this.numerator;
		this.numerator = nr;
		this.denominator = dr;
		simplify(this.numerator, this.denominator);
	}

	public void newDiv(Rational r) {
		int n1, n2, nr, dr;
		nr = this.numerator * r.getDenominator();
		dr = this.denominator * r.getNumerator();
		this.numerator = nr;
		this.denominator = dr;
		simplify(this.numerator, this.denominator);
	}

	//
	// public static Rational add(Rational r, Rational s) {
	// Rational t = new Rational();
	// int rem;
	// r.j = r.n;
	// r.k = r.d;
	// s.j = s.n;
	// s.k = s.d;
	// t.d = r.k * s.k;
	// r.j *= s.k;
	// s.j *= r.k;
	// t.n = r.j + s.j;
	// t.j = t.n;
	// t.k = t.d;
	// if (t.k != 0) {
	// if (t.k > t.j) {
	// rem = t.k % t.j;
	// while (t.k % t.j != 0) {
	// rem = t.k % t.j;
	// t.k = t.j;
	// t.j = rem;
	// }
	// t.n /= t.j;
	// t.d /= t.j;
	// } else {
	// rem = t.j % t.k;
	// while (t.j % t.k != 0) {
	// rem = t.j % t.k;
	// t.j = t.k;
	// t.k = rem;
	// }
	// t.n /= t.k;
	// t.d /= t.k;
	// }
	// t.numerator = t.n;
	// t.denominator = t.d;
	// }
	// return t;
	// }

	// public static Rational sub(Rational r, Rational s) {
	// Rational t = new Rational();
	// int rem;
	// r.j = r.n;
	// r.k = r.d;
	// s.j = s.n;
	// s.k = s.d;
	// t.d = r.k * s.k;
	// r.j *= s.k;
	// s.j *= r.k;
	// t.n = r.j - s.j;
	// t.j = t.n;
	// t.k = t.d;
	// if (t.k != 0) {
	// if (t.k > t.j) {
	// rem = t.k % t.j;
	// while (t.k % t.j != 0) {
	// rem = t.k % t.j;
	// t.k = t.j;
	// t.j = rem;
	// }
	// t.n /= t.j;
	// t.d /= t.j;
	// } else {
	// rem = t.j % t.k;
	// while (t.j % t.k != 0) {
	// rem = t.j % t.k;
	// t.j = t.k;
	// t.k = rem;
	// }
	// t.n /= t.k;
	// t.d /= t.k;
	// }
	// t.numerator = t.n;
	// t.denominator = t.d;
	// }
	// return t;
	// }
	//
	// public static Rational mul(Rational r, Rational s) {
	// Rational t = new Rational();
	// int rem;
	// r.j = r.n;
	// r.k = r.d;
	// s.j = s.n;
	// s.k = s.d;
	// t.d = r.k * s.k;
	// t.n = r.j * s.j;
	// t.j = t.n;
	// t.k = t.d;
	// if (t.k != 0) {
	// if (t.k > t.j) {
	// rem = t.k % t.j;
	// while (t.k % t.j != 0) {
	// rem = t.k % t.j;
	// t.k = t.j;
	// t.j = rem;
	// }
	// t.n /= t.j;
	// t.d /= t.j;
	// } else {
	// rem = t.j % t.k;
	// while (t.j % t.k != 0) {
	// rem = t.j % t.k;
	// t.j = t.k;
	// t.k = rem;
	// }
	// t.n /= t.k;
	// t.d /= t.k;
	// }
	// t.numerator = t.n;
	// t.denominator = t.d;
	// }
	// return t;
	// }
	//
	// public static Rational div(Rational r, Rational s) {
	// Rational t = new Rational();
	// int rem;
	// r.j = r.n;
	// r.k = r.d;
	// s.j = s.n;
	// s.k = s.d;
	// t.d = r.k * s.j;
	// t.n = r.j * s.k;
	// t.j = t.n;
	// t.k = t.d;
	// if (t.k != 0) {
	// if (t.k > t.j) {
	// rem = t.k % t.j;
	// while (t.k % t.j != 0) {
	// rem = t.k % t.j;
	// t.k = t.j;
	// t.j = rem;
	// }
	// t.n /= t.j;
	// t.d /= t.j;
	// } else {
	// rem = t.j % t.k;
	// while (t.j % t.k != 0) {
	// rem = t.j % t.k;
	// t.j = t.k;
	// t.k = rem;
	// }
	// t.n /= t.k;
	// t.d /= t.k;
	// }
	// t.numerator = t.n;
	// t.denominator = t.d;
	// }
	// return t;
	// }

	public String toString() {
		return String.format("Rational no.: %d/%d", numerator, denominator);
	}

	public String inFloatingFormat(int d) {
		BigDecimal decimal = BigDecimal.valueOf((float) numerator / denominator);
		return String.format("In Floating-point format precision upto " + d + " places: %f",
				decimal.setScale(d, RoundingMode.HALF_EVEN).floatValue());
	}
}

public class RationalTest {

	public static void main(String[] args) {
		Rational d = new Rational();
		Rational p = new Rational(3, 9);
		Rational q = new Rational(63, 147);
		Rational r = new Rational(1, 2);
		Rational s = new Rational(3, 26);
		Rational t = new Rational(46, 115);
		// Rational u = new Rational(3, 0);
		displayFraction("After instantiation:\n", d);
		System.out.println("Fractions:");
		displayFraction("1", p);
		displayFraction("2", q);
		displayFraction("3", r);
		displayFraction("4", s);
		displayFraction("5", t);
		// displayFraction("6", u);
		displayFraction("Addition:\n", add(p, q));
		displayFraction("Subtraction:\n", sub(r, s));
		displayFraction("Multiplication:\n", mul(p, s));
		displayFraction("Division:\n", div(p, s));
		displayFloatingFormat("1a", q, 4);
		displayFloatingFormat("1b", q, 2);
		displayFloatingFormat("1", add(s, t), 3);
		displayFloatingFormat("2", sub(t, s), 1);
		displayFloatingFormat("3", mul(t, q), 5);
		displayFloatingFormat("4", div(q, t), 6);
		p.newAdd(t);
		q.newSub(r);
		t.newMul(s);
		s.newDiv(r);
		displayFraction("Naya Addition:\n", p);
		displayFraction("Naya Subtraction:\n", q);
		displayFraction("Naya Multiplication:\n", t);
		displayFraction("Naya Division:\n", s);
		// TODO Auto-generated method stub
	}

	public static void displayFraction(String header, Rational r) {
		System.out.printf("%s %s\n", header, r.toString());
	}

	public static void displayFloatingFormat(String header, Rational r, int d) {
		System.out.printf("%s %s\n", header, r.inFloatingFormat(d));
	}

	public static Rational add(Rational r, Rational s) {
		Rational t = new Rational();
		int rem;
		int n1, n2, n3, nr, d1, d2, d3, dr;
		n1 = r.getNumerator();
		d1 = r.getDenominator();
		n2 = s.getNumerator();
		d2 = s.getDenominator();
		d3 = d1 * d2;
		n1 *= d2;
		n2 *= d1;
		n3 = n1 + n2;
		nr = n3;
		dr = d3;
		if (dr != 0) {
			if (dr > nr) {
				rem = dr % nr;
				while (dr % nr != 0) {
					rem = dr % nr;
					dr = nr;
					nr = rem;
				}
				n3 /= nr;
				d3 /= nr;
			} else {
				rem = nr % dr;
				while (nr % dr != 0) {
					rem = nr % dr;
					nr = dr;
					dr = rem;
				}
				n3 /= dr;
				d3 /= dr;
			}
			t.setNumerator(n3);
			t.setDenominator(d3);
		}
		return t;
	}

	public static Rational sub(Rational r, Rational s) {
		Rational t = new Rational();
		int rem;
		int n1, n2, n3, nr, d1, d2, d3, dr;
		n1 = r.getNumerator();
		d1 = r.getDenominator();
		n2 = s.getNumerator();
		d2 = s.getDenominator();
		d3 = d1 * d2;
		n1 *= d2;
		n2 *= d1;
		n3 = n1 - n2;
		nr = n3;
		dr = d3;
		if (dr != 0) {
			if (dr > nr) {
				rem = dr % nr;
				while (dr % nr != 0) {
					rem = dr % nr;
					dr = nr;
					nr = rem;
				}
				n3 /= nr;
				d3 /= nr;
			} else {
				rem = nr % dr;
				while (nr % dr != 0) {
					rem = nr % dr;
					nr = dr;
					dr = rem;
				}
				n3 /= dr;
				d3 /= dr;
			}
			t.setNumerator(n3);
			t.setDenominator(d3);
		}
		return t;
	}

	public static Rational mul(Rational r, Rational s) {
		Rational t = new Rational();
		int rem;
		int n1, n2, n3, nr, d1, d2, d3, dr;
		n1 = r.getNumerator();
		d1 = r.getDenominator();
		n2 = s.getNumerator();
		d2 = s.getDenominator();
		d3 = d1 * d2;
		n3 = n1 * n2;
		nr = n3;
		dr = d3;
		if (dr != 0) {
			if (dr > nr) {
				rem = dr % nr;
				while (dr % nr != 0) {
					rem = dr % nr;
					dr = nr;
					nr = rem;
				}
				n3 /= nr;
				d3 /= nr;
			} else {
				rem = nr % dr;
				while (nr % dr != 0) {
					rem = nr % dr;
					nr = dr;
					dr = rem;
				}
				n3 /= dr;
				d3 /= dr;
			}
			t.setNumerator(n3);
			t.setDenominator(d3);
		}
		return t;
	}

	public static Rational div(Rational r, Rational s) {
		Rational t = new Rational();
		int rem;
		int n1, n2, n3, nr, d1, d2, d3, dr;
		n1 = r.getNumerator();
		d1 = r.getDenominator();
		n2 = s.getNumerator();
		d2 = s.getDenominator();
		n3 = n1 * d2;
		d3 = d1 * n2;
		nr = n3;
		dr = d3;
		if (dr != 0) {
			if (dr > nr) {
				rem = dr % nr;
				while (dr % nr != 0) {
					rem = dr % nr;
					dr = nr;
					nr = rem;
				}
				n3 /= nr;
				d3 /= nr;
			} else {
				rem = nr % dr;
				while (nr % dr != 0) {
					rem = nr % dr;
					nr = dr;
					dr = rem;
				}
				n3 /= dr;
				d3 /= dr;
			}
			t.setNumerator(n3);
			t.setDenominator(d3);
		}
		return t;
	}
}

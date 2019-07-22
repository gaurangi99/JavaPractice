import java.util.Arrays;

public class HugeInteger {
	char[] a = new char[40];

	public HugeInteger() {
		for (int i = 0; i < 40; i++)
			a[i] = '0';
	}

	public HugeInteger(String s) {
		if (s.length() > 40) {
			throw new ArrayIndexOutOfBoundsException();
		}
		parse(s);
	}

	public char[] parse(String s) {
		int i, j;
		if (s.length() == 40) {
			for (i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i);
			}
		} else {
			for (i = 0; i < 40 - s.length(); i++) {
				a[i] = '0';
			}
			for (i = 40 - s.length(), j = 0; i < 40 && j < s.length(); i++, j++) {
				a[i] = s.charAt(j);
			}
		}
		// charToInt();
		return a;
	}

	public String ToString() {
		String p = "";
		for (int i = 0; i < a.length; i++) {
			p += a[i];
		}
		return p;
	}

	public char[] add(HugeInteger h1, HugeInteger h2) {
		// int[] b = new int[40];
		if (h1.a.length > 40 || h2.a.length > 40) {
			System.out.println("Max. length after addition should be 40-digits.");
		} else {
			int carry = 0;
			for (int i = h1.a.length - 1; i >= 0; i--) {
				if (((int) h1.a[i] + (int) h2.a[i] + carry) > 105 && ((int) h1.a[i] + (int) h2.a[i] + carry) < 116) {
					if (i > 0) {
						this.a[i] = (char) ((int) h1.a[i] + (int) h2.a[i] + carry - 58);
					} else {
						System.out.println("Sum greater than 40-digits!!");
					}
					carry = 1;
				} else if (((int) h1.a[i] + (int) h2.a[i] + carry) <= 105
						&& ((int) h1.a[i] + (int) h2.a[i] + carry) >= 48) {
					this.a[i] = (char) ((int) h1.a[i] + (int) h2.a[i] + carry - 48);
					carry = 0;
				}
			}
		}
		return this.a;
		// for (int i = 0; i < this.b.length; i++) {
		// System.out.printf("%d", this.b[i]);
		// }
		// System.out.println();
		// this.a = intToChar(b);
	}

	public char[] sub(HugeInteger h1, HugeInteger h2) {
		if (h1.a.length > 40 || h2.a.length > 40) {
			System.out.println("Max. length after subtraction should be 40-digits.");
		}
		if (isGreaterThan(h1, h2)) {
			int borrow = 0;
			for (int i = h1.a.length - 1; i >= 0; i--) {
				if ((int) h1.a[i] != 48) {
					if (((int) h1.a[i] - borrow) > (int) h2.a[i]) {
						this.a[i] = (char) ((int) h1.a[i] - (int) h2.a[i] - borrow + 48);
						borrow = 0;
					} else if (((int) h1.a[i] - borrow) < (int) h2.a[i]) {
						if ((int) h1.a[i - 1] > 48) {
							this.a[i] = (char) (10 + (int) h1.a[i] - (int) h2.a[i] - borrow + 48);
							borrow = 1;
						} else {
							this.a[i] = (char) (10 + (int) h1.a[i] - (int) h2.a[i] - borrow + 48);
							borrow = -9;
						}
					} else if (((int) h1.a[i] - borrow) == (int) h2.a[i]) {
						this.a[i] = '0';
					}
				} else {
					if (((int) h1.a[i] - borrow) > (int) h2.a[i]) {
						this.a[i] = (char) ((int) h1.a[i] - (int) h2.a[i] - borrow + 48);
						if ((int) h1.a[i - 1] > 48) {
							borrow = 1;
						} else {
							borrow = -9;
						}
					} else if (((int) h1.a[i] - borrow) < (int) h2.a[i]) {
						if ((int) h1.a[i - 1] > 48) {
							this.a[i] = (char) (10 + (int) h1.a[i] - (int) h2.a[i] - borrow + 48);
							borrow = 1;
						} else {
							this.a[i] = (char) (10 + (int) h1.a[i] - (int) h2.a[i] - borrow + 48);
							borrow = -9;
						}
					} else if (((int) h1.a[i] - borrow) == (int) h2.a[i]) {
						this.a[i] = '0';
					}
				}
			}
		} else {
			int borrow = 0;
			for (int i = h2.a.length - 1; i >= 0; i--) {
				if (h2.a[i] != 0) {
					if (((int) h2.a[i] - borrow) > (int) h1.a[i]) {
						this.a[i] = (char) ((int) h2.a[i] - (int) h1.a[i] - borrow);
						borrow = 0;
					} else if (((int) h2.a[i] - borrow) < (int) h1.a[i]) {
						if ((int) h2.a[i - 1] > 48) {
							this.a[i] = (char) (10 + (int) h2.a[i] - (int) h1.a[i] - borrow);
							borrow = 1;
						} else {
							this.a[i] = (char) (10 + (int) h2.a[i] - (int) h1.a[i] - borrow);
							borrow = -9;
						}
					} else if (((int) h2.a[i] - borrow) == (int) h1.a[i]) {
						this.a[i] = '0';
					}
				} else {
					if (((int) h2.a[i] - borrow) > (int) h1.a[i]) {
						this.a[i] = (char) ((int) h2.a[i] - (int) h1.a[i] - borrow);
						if ((int) h2.a[i - 1] > 48) {
							borrow = 1;
						} else {
							borrow = -9;
						}
					} else if (((int) h2.a[i] - borrow) < (int) h1.a[i]) {
						if ((int) h2.a[i - 1] > 48) {
							this.a[i] = (char) (10 + (int) h2.a[i] - (int) h1.a[i] - borrow);
							borrow = 1;
						} else {
							this.a[i] = (char) (10 + (int) h2.a[i] - (int) h1.a[i] - borrow);
							borrow = -9;
						}
					} else if (((int) h2.a[i] - borrow) == (int) h1.a[i]) {
						this.a[i] = '0';
					}
				}
			}
		}
		return this.a;
	}

	public HugeInteger mul(HugeInteger h1, HugeInteger h2) {
		HugeInteger g = new HugeInteger();
		int i, j, ctr = 0, carry = 0, tmp = 0, k;
		for (i = 0; i < this.a.length; i++) {
			this.a[i] = '0';
		}
		int[] p = new int[40];
		int[] q = new int[40];
		int[] r = new int[40];
		for (i = 0; i < h1.a.length; i++) {
			p[i] = (int) h1.a[i] - 48;
		}
		for (i = 0; i < h2.a.length; i++) {
			q[i] = (int) h2.a[i] - 48;
		}
		for (i = q.length - 1; i >= 0; i--) {
			for (j = p.length - 1, k = p.length - 1 - ctr; j >= 0 && k >= 0; j--, k--) {
				tmp += (p[j] * q[i]) + carry;
				if (tmp > 9) {
					r[k] = tmp % 10;
					carry = tmp / 10;
				} else {
					r[k] = tmp;
					carry = 0;
				}
				tmp = 0;
			}
			for (int x = 0; x < r.length; x++) {
				g.a[x] = (char) (r[x] + 48);
				r[x] = 0;
			}
			add(this, g);
			carry = 0;
			ctr++;
		}
		return this;
	}

	public static boolean isEqualTo(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length == h2.a.length) {
			while (i < h1.a.length) {
				if ((int) h1.a[i] == (int) h2.a[i]) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
				i++;
			}
		}
		if (flag == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNotEqualTo(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length == h2.a.length) {
			while (i < h1.a.length) {
				if ((int) h1.a[i] == (int) h2.a[i]) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
				i++;
			}
		}
		if (flag == 1) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isGreaterThan(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length > h2.a.length) {
			return true;
		} else if (h1.a.length < h2.a.length) {
			return false;
		} else {
			while (i < h1.a.length) {
				if ((int) h1.a[i] > (int) h2.a[i]) {
					flag = 1;
					break;
				} else if ((int) h1.a[i] < (int) h2.a[i]) {
					flag = 0;
					break;
				} else
					i++;
			}
			if (flag == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isLessThan(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length > h2.a.length) {
			return false;
		} else if (h1.a.length < h2.a.length) {
			return true;
		} else {
			while (i < h1.a.length) {
				if ((int) h1.a[i] > (int) h2.a[i]) {
					flag = 0;
					break;
				} else if ((int) h1.a[i] < (int) h2.a[i]) {
					flag = 1;
					break;
				} else
					i++;
			}
			if (flag == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isGreaterThanOrEqualTo(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length > h2.a.length) {
			return true;
		} else if (h1.a.length < h2.a.length) {
			return false;
		} else {
			while (i < h1.a.length) {
				if ((int) h1.a[i] > (int) h2.a[i]) {
					flag = 1;
					break;
				} else if ((int) h1.a[i] < (int) h2.a[i]) {
					flag = 0;
					break;
				} else if ((int) h1.a[i] == (int) h2.a[i]) {
					flag = 2;
				}
				i++;
			}
			if (flag == 1 || flag == 2) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isLessThanOrEqualTo(HugeInteger h1, HugeInteger h2) {
		int i = 0, flag = 0;
		if (h1.a.length > h2.a.length) {
			return false;
		} else if (h1.a.length < h2.a.length) {
			return true;
		} else {
			while (i < h1.a.length) {
				if ((int) h1.a[i] > (int) h2.a[i]) {
					flag = 0;
					break;
				} else if ((int) h1.a[i] < (int) h2.a[i]) {
					flag = 1;
					break;
				} else if ((int) h1.a[i] == (int) h2.a[i]) {
					flag = 2;
				}
				i++;
			}
			if (flag == 1 || flag == 2) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static boolean isZero(HugeInteger h) {
		int i = 0, flag = 0;
		while (i < h.a.length) {
			if ((int) h.a[i] == 48) {
				flag = 0;
			} else {
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 0)
			return true;
		else
			return false;
	}

	public String toString() {
		return String.format("%s", ToString());
	}
}

// public String ToString() {
// String s[] = new String[a.length];
// for (int i = 0; i < a.length; i++) {
// s[i] = String.valueOf(a[i]);
// }
// return (Arrays.toString(s));
// }

// public static boolean isEqualTo(HugeInteger h1, HugeInteger h2) {
// int i = 0, flag = 0;
// if (h1.a.length == h2.a.length) {
// while (i < h1.a.length) {
// if (h1.a[i] == h2.a[i]) {
// flag = 1;
// } else {
// flag = 0;
// break;
// }
// i++;
// }
// }
// if (flag == 1) {
// return true;
// } else {
// return false;
// }
// }

// public multiply() {
//
//
// }
//
// public int[] div(HugeInteger h1, HugeInteger h2) {
// if(isGreaterThan(h1, h2)) {
// while(isGreaterThan(sub(h1, h2),h2)) {
// }
// }
// }
//

// sub aise banaya tha integer array ke liye
// for (int i = h1.a.length - 1; i >= 0; i--) {
// if ((int) h1.a[i] > (int) h2.a[i]) {
// this.a[i] = (char) ((int) h1.a[i] - (int) h2.a[i]);
// } else if ((int) h1.a[i] < (int) h2.a[i]) {
// if (h1.a[i - 1] > 0) {
// h1.a[i - 1] -= 1;
// h1.a[i] += 10;
// } else {
// h1.a[i - 2] -= 1;
// h1.a[i - 1] = 9;
// h1.a[i] += 10;
// }
// this.a[i] = (char) ((int) h1.a[i] - (int) h2.a[i]);
// } else {
// this.a[0] = '0';
// }
// }

// public void rem(HugeInteger h1, HugeInteger h2) {
// // remainder method
// if (isGreaterThanOrEqualTo(h1, h2)) {
// return sub(h1, h2);
// } else {
// // for (int i = 0; i < h1.b.length; i++) {
// // System.out.printf("%d", h1.b[i]);
// // }
// // System.out.println();
// return h1.b;
// }
// }

// h.rem(h5, h4);
// displayHugeInteger("Remainder of h5 & h4", h);
// h.rem(h4, h5);
// displayHugeInteger("Remainder of h4 & h5", h);

// public int[] charToInt() {
// int[] b = new int[40];
// for (int i = 0; i < a.length; i++) {
// b[i] = (int) a[i] - 48;
// }
// return b;
// }

// public char[] intToChar(int[] b) {
// for (int i = 0; i < b.length; i++) {
// a[i] = (char) (b[i] + 48);
// }
// return a;
// }
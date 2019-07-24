public class projectEuler_1 {

	public static void main(String[] args) {
		int i, r3, r5, r15, l3, l5, l15, n3, n5, n15, s, s3, s5, s15;
		r3 = 1000 % 3;
		l3 = 1000 - r3;
		n3 = l3 / 3;
		s3 = ((3 + l3) * n3) / 2;
		n5 = 1000 / 5-1;
		s5 = ((5 + 995) * n5) / 2;
		r15 = 1000 % 15;
		l15 = 1000 - r15;
		n15 = l15 / 15;
		s15 = ((15 + l15) * n15) / 2;
		s = s3 + s5 - s15;
		System.out.println(s);
		// TODO Auto-generated method stub
	}
}

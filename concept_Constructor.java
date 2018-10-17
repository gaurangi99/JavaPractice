public class concept_Constructor {
	int t = 8;
	char ch = 'g';

	public static void main(String[] args) {
		concept_Constructor co = new concept_Constructor();
		System.out.printf("%d %c", co.t, co.ch);
		co.t++;
		co.ch++;
		System.out.printf("\n%d %c", co.t, co.ch);
	}
}

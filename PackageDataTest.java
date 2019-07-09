public class PackageDataTest {

	public static void main(String[] args) {
		PackageData packageData = new PackageData();
		//PackageData packageData1 = new PackageData(33, "Check!");
		System.out.printf("After instantiation (Constructor1): \n%s\n", packageData);
		//System.out.printf("\nConstructor2:\n%s\n", packageData1);
		packageData.number = 77;
		packageData.string = "Goodbye";
		System.out.printf("\nAfter changing values:\n%s\n", packageData);
		//System.out.printf("\nAfter changing values:\n%s\n", packageData1);
		// TODO Auto-generated method stub
	}
}

class PackageData {
	int number;
	String string;

	public PackageData() {
		number = 0;
		string = "Hello!";
	}

	/*public PackageData(int number, String string) {
		this.number = number;
		this.string = string;
	}*/

	public String toString() {
		return String.format("number: %d; string: %s", number, string);
	}
}

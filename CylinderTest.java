public class CylinderTest {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		System.out.printf("After instantiation: %s", c);
		c.setRadius(6.86);
		c.setHeight(2.34);
		System.out.printf("\nAfter set methods: %s", c);
		c.displayVolume();
		// TODO Auto-generated method stub
	}
}

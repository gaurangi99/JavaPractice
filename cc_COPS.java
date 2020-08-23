import java.util.Scanner;

public class cc_COPS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		int t = in.nextInt();
		while (t-- > 0) {
			int m = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int i, speed, NoOfLeftHouses = 0;
			int[] houseNo = new int[m];
			for (i = 0; i < m; i++) {
				houseNo[i] = in.nextInt();
			}
			boolean[] leftHouses = new boolean[100];
			speed = x * y;
			int fromHouse, toHouse;
			for (i = 0; i < m; i++) {
				fromHouse = houseNo[i] - speed - 1;
				toHouse = houseNo[i] + speed - 1;
				if (fromHouse >= 0 && toHouse < 100) {
					for (int j = houseNo[i] - speed - 1; j < houseNo[i] + speed; j++) {
						if (leftHouses[j] == false) {
							leftHouses[j] = true;
						}
					}
				} else if (fromHouse >= 0 && toHouse >= 100) {
					for (int j = houseNo[i] - speed - 1; j < 100; j++) {
						if (leftHouses[j] == false) {
							leftHouses[j] = true;
						}
					}
				} else if (fromHouse < 0 && toHouse < 100) {
					for (int j = 0; j < houseNo[i] + speed; j++) {
						if (leftHouses[j] == false) {
							leftHouses[j] = true;
						}
					}
				} else if (fromHouse < 0 && toHouse >= 100) {
					for (int j = 0; j < 100; j++) {
						if (leftHouses[j] == false) {
							leftHouses[j] = true;
						}
					}
				}
			}
			for (i = 0; i < 100; i++) {
				if (leftHouses[i] == false) {
					NoOfLeftHouses++;
				}
			}
			System.out.println(NoOfLeftHouses);
		}
		// TODO Auto-generated method stub
	}
}

import java.util.Scanner;

public class PassengerTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		Passenger p = new Passenger();
		String name = new String();
		String issNum = new String();
		String[] pd = new String[3];
		int cAP, cM, cW, cFood, aM, aW, aAP, aFood, mm, dd, yy;
		Date d = new Date();
//		System.out.printf("\nEnter name of passenger:");
//		name = in.next();
//		p.setName(name);
//		System.out.printf("\nEnter passport number:");
//		issNum = in.next();
//		p.setpassNum(issNum);
//		System.out.printf("\nEnter date of issue of passport:");
//		System.out.printf("\n  Enter month:");
//		mm = in.nextInt();
//		d.setMonth(mm);
//		System.out.printf("\n  Enter day:");
//		dd = in.nextInt();
//		d.setDay(dd);
//		System.out.printf("\n  Enter year:");
//		yy = in.nextInt();
//		d.setYear(yy);
//		p.setpassIss(d);
		System.out.printf("\nEnter previous 3 destinations:");
		for (int i = 0; i < 3; i++) {
			pd[i] = in.next();
		}
		p.setprevDstn(pd);
		System.out.printf("\nEnter money:");
		cM = in.nextInt();
		p.setclaimMoney(cM);
		System.out.printf("\nEnter total contained food items:");
		cFood = in.nextInt();
		p.setclaimFood(cFood);
		System.out.printf("\nEnter no. of agricultural pdts:");
		cAP = in.nextInt();
		p.setclaimAgriPdt(cAP);
		System.out.printf("\nEnter no. of weapons:");
		cW = in.nextInt();
		p.setclaimWpn(cW);
		System.out.printf("\nMoney found:");
		aM = in.nextInt();
		p.setactualMoney(aM);
		System.out.printf("\nTotal contained food items found:");
		aFood = in.nextInt();
		p.setactualFood(aFood);
		System.out.printf("\nNo. of agricultural pdts found:");
		aAP = in.nextInt();
		p.setactualAgriPdt(aAP);
		System.out.printf("\nNo. of weapons found:");
		aW = in.nextInt();
		p.setactualWpn(aW);
		p.prevDstnCheck();
		p.checkDiscrepancy();
		displayStatus("Status:", p);
		// TODO Auto-generated method stub
	}

	public static void displayStatus(String header, Passenger p) {
		System.out.printf("%s %s", header, p);
	}
}

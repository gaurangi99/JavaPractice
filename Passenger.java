public class Passenger {
	String name, action;
	String[] prevDestn = new String[3];
	int passNum, actualAgriPdt, claimAgriPdt, actualWpn, claimWpn, actualMoney;
	Date passIss;
	char extraMoneyCheck;

	public Passenger(String name, int passNum, Date passIss, int claimAgriPdt, int claimWpn, String[] prevDestn) {
		if (claimAgriPdt > 5) {

		}
		this.name = name;
		this.passNum = passNum;
		this.passIss = passIss;
		this.claimAgriPdt = claimAgriPdt;
		this.claimWpn = claimWpn;
		this.prevDestn = prevDestn;
	}

	public String getName() {
		return name;
	}
}

public class Passenger {
	String name, action;
	String[] prevDestn = new String[3];
	int passNum, actualAgriPdt, claimAgriPdt, actualWpn, claimWpn, actualMoney, claimMoney;
	Date passIss;
	char extraMoneyCheck;

	public Passenger(String name, int passNum, Date passIss, int claimAgriPdt, int claimWpn, int claimMoney,
			String[] prevDestn) {
		// if (claimAgriPdt > 5) {
		//
		// }
		this.name = name;
		this.passNum = passNum;
		this.passIss = passIss;
		this.claimAgriPdt = claimAgriPdt;
		this.claimWpn = claimWpn;
		this.claimMoney = claimMoney;
		this.prevDestn = prevDestn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getpassNum() {
		return passNum;
	}

	public void setpassNum(int num) {
		this.passNum = num;
	}

	public Date getpassIss() {
		return passIss;
	}

	public void setpassIss(Date date) {
		this.passIss = date;
	}

	public int getclaimAgriPdt() {
		return claimAgriPdt;
	}

	public void setclaimAgriPdt(int pdt) {
		this.claimAgriPdt = pdt;
	}

	public int getclaimWpn() {
		return claimWpn;
	}

	public void setclaimWpn(int wpn) {
		this.claimWpn = wpn;
	}

	public int getclaimMoney() {
		return claimMoney;
	}

	public void setclaimMoney(int money) {
		this.claimMoney = money;
	}
}

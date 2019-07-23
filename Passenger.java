public class Passenger {
	String name, action;
	String[] prevDstn = new String[3];
	char passNum;
	int actualAgriPdt, claimAgriPdt, actualWpn, claimWpn, actualMoney, claimMoney;
	Date passIss;
	char extraMoneyCheck;

	public Passenger(String name, char passNum, Date passIss, int claimAgriPdt, int claimWpn, int claimMoney,
			String[] prevDstn) {
		// if (claimAgriPdt > 5) {
		//
		// }
		this.name = name;
		this.passNum = passNum;
		this.passIss = passIss;
		this.claimAgriPdt = claimAgriPdt;
		this.claimWpn = claimWpn;
		this.claimMoney = claimMoney;
		this.prevDstn = prevDstn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getpassNum() {
		return passNum;
	}

	public void setpassNum(char num) {
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

	public String[] getprevDstn() {
		return prevDstn;
	}

	public void setprevDstn(String[] prevDstn) {
		this.prevDstn = prevDstn;
	}

	public int getactualAgriPdt() {
		return actualAgriPdt;
	}

	public void setactualAgriPdt(int pdt) {
		this.actualAgriPdt = pdt;
	}

	public int getactualWpn() {
		return actualWpn;
	}

	public void setactualWpn(int wpn) {
		this.actualWpn = wpn;
	}

	public int getactualMoney() {
		return actualMoney;
	}

	public void setactualMoney(int money) {
		this.actualMoney = money;
	}
	
	
}

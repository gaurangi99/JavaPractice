public class Passenger {
	String name, action, passNum;
	String[] prevDstn = new String[3];
	String[] food = new String[10];
	int actualAgriPdt, claimAgriPdt, actualWpn, claimWpn, actualMoney, claimMoney;
	Date passIss;
	char extraMoneyCheck;

	public Passenger() {
		this.name = null;
		this.passNum = null;
		this.passIss = null;
		this.claimAgriPdt = 0;
		this.claimWpn = 0;
		this.claimMoney = 0;
		this.prevDstn = null;
		this.food = null;
	}

	public Passenger(String name, String passNum, Date passIss, String[] food, String[] prevDstn, int claimMoney,
			int claimAgriPdt, int claimWpn) {
		this.name = name;
		this.passNum = passNum;
		this.passIss = passIss;
		this.claimAgriPdt = claimAgriPdt;
		this.claimWpn = claimWpn;
		this.claimMoney = claimMoney;
		this.prevDstn = prevDstn;
		this.food = food;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpassNum() {
		return passNum;
	}

	public void setpassNum(String num) {
		this.passNum = num;
	}

	public Date getpassIss() {
		return passIss;
	}

	public void setpassIss(Date date) {
		this.passIss = date;
	}

	public String[] getfood() {
		return food;
	}

	public void setfood(String[] food) {
		this.food = food;
	}

	public String[] getprevDstn() {
		return prevDstn;
	}

	public void setprevDstn(String[] prevDstn) {
		this.prevDstn = prevDstn;
	}

	public int getclaimMoney() {
		return claimMoney;
	}

	public void setclaimMoney(int money) {
		this.claimMoney = money;
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

	public int getactualMoney() {
		return actualMoney;
	}

	public void setactualMoney(int money) {
		this.actualMoney = money;
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

	public void checkDiscrepancy() {
		if (getclaimMoney() - getactualMoney() != 0) {
			furtherCheck();
		} else if (getclaimAgriPdt() - getactualAgriPdt() != 0) {
			furtherCheck();
		} else if (getclaimWpn() - getactualWpn() != 0) {
			furtherCheck();
		} else {
			action(0);
		}
	}

	public void furtherCheck() {
		int count = 0;
		for (int i = 0; i < prevDstn.length; i++) {
			for (preIdentifiedCountries country : preIdentifiedCountries.values()) {
				if (prevDstn[i] == country.getName()) {
					count++;
				}
			}
		}
		action(count);
	}

	public String action(int count) {
		if (count == 0) {
			return String.format("No further action. Clean Record, eligible!!");
		} else if (count == 1) {
			return String.format("Full search of baggage.");
		} else if (count == 2) {
			return String.format("Full search of baggage, x-ray scan and personal search.");
		} else {
			return String.format("Not eligible");
		}
	}
}

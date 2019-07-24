public class Passenger {
	private String name, action, passNum;
	private String[] prevDstn = new String[3];
	private int actualAgriPdt, claimAgriPdt, actualWpn, claimWpn, actualMoney, claimMoney, claimFood, actualFood;
	private Date passIss;
	private char extraMoneyCheck;

	public Passenger() {
		this.name = null;
		this.passNum = null;
		this.passIss = null;
		this.claimAgriPdt = 0;
		this.claimWpn = 0;
		this.claimMoney = 0;
		this.prevDstn = null;
		this.claimFood = 0;
	}

	public Passenger(String name, String passNum, Date passIss, int claimFood, String[] prevDstn, int claimMoney,
			int claimAgriPdt, int claimWpn) {
		this.name = name;
		this.passNum = passNum;
		this.passIss = passIss;
		this.claimAgriPdt = claimAgriPdt;
		this.claimWpn = claimWpn;
		this.claimMoney = claimMoney;
		this.prevDstn = prevDstn;
		this.claimFood = claimFood;
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

	public int getclaimFood() {
		return claimFood;
	}

	public void setclaimFood(int food) {
		this.claimFood = food;
	}

	public int getactualFood() {
		return actualFood;
	}

	public void setactualFood(int food) {
		this.actualFood = food;
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
		int count = 0;
		if ((getclaimMoney() - getactualMoney()) >= 0) {
			extraMoneyCheck = 'N';
		} else if ((getclaimMoney() - getactualMoney()) < 0) {
			extraMoneyCheck = 'Y';
		}
		if (getclaimFood() == 0 && getactualFood() == 0) {
			count = 0;
		}
		if (getclaimFood() > 0 || (getclaimFood() == 0 && getactualFood() != 0)) {
			count++;
		}
		if ((getclaimAgriPdt() - getactualAgriPdt()) < 0) {
			count++;
		}
		if ((getclaimWpn() - getactualWpn()) < 0) {
			count++;
		}
		if (count == 0) {
			actionFurtherCheck(0);
		} else {
			actionFurtherCheck(count);
		}
	}

	public void prevDstnCheck() {
		int count = 0;
		System.out.println(prevDstn);
		for (int i = 0; i < prevDstn.length; i++) {
			for (preIdentifiedCountries country : preIdentifiedCountries.values()) {
				if (prevDstn[i].equalsIgnoreCase(country.getName())) {
					count++;
				}
			}
		}
		System.out.println(count);
		actionFurtherCheck(count);
	}

	public String actionFurtherCheck(int count) {
		if (count == 0) {
			action = "No further action. Clean Record, eligible!!";
		} else if (count == 1) {
			action = "Full search of baggage.";
		} else if (count == 2) {
			action = "Full search of baggage, x-ray scan and personal search.";
		} else {
			action = "Not eligible";
		}
		return action;
	}

	public String toString() {
		return String.format(action);
	}
}

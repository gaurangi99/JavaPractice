public class Employee {
	//Fig.8.12
	private static int count = 0;
	//Fig.8.9
	private String firstname;
	private String lastname;
	private Date birthdate;
	private Date hiredate;
	
	//Fig.8.9
	public Employee(String firstname, String lastname, Date birthdate, Date hiredate) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.hiredate = hiredate;
	}

	//Fig.8.12
	public Employee(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		++count;
		System.out.printf("Employee constructor: %s %s; count=%d\n", firstname, lastname, count);
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public static int getCount() {
		return count;
	}

	//Fig.8.10
	public String toString() {
		System.out.println("Check!!");
		return String.format("%s, %s Hired: %s Birthday: %s", lastname, firstname, hiredate, birthdate);
	}
}

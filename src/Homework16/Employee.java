package Homework16;

public class Employee extends Person {

	private int daySalary;

	public int getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(int daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;
		}
	}

	public Employee(String name, int age, boolean isMale, int daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	double calculateOvertime(double hourOvertime) {
		double overtime = 0;
		if (this.getAge() >= 18) {
			overtime = ((double) getDaySalary() / 8) * 1.5;
		}
		return overtime;
	}

	void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.println("Day salary: " + getDaySalary());
	}
}

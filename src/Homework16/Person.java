package Homework16;

public class Person {
	private String name;
	private int age;
	private boolean isMale;

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	public Person(String name, int age, boolean isMale) {
		setName(name);
		setAge(age);
		setMale(isMale);
	}

	void showPersonInfo() {
		String gender = "";
		if (isMale) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		System.out.println("Name: " + getName() + "\nAge: " + getName() + "\nGender: " + gender);
	}
}

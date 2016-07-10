package Homework16;

public class Student extends Person {

	private double score;

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		}
	}

	public double getScore() {
		return score;
	}

	Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	void showStudentInfo() {
		String gender = "";
		if (isMale()) {
			gender = "Male";
		} else {
			gender = "Female";
		}
		System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + gender + "\nScore: " + getScore());

	}

}

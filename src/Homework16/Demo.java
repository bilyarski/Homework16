package Homework16;

public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Person spas = new Person("Spas", 23, true);
		Person mitko = new Person("Dimitar", 28, true);
		Student georgi = new Student("Georgi", 26, true, 6);
		Student katya = new Student("Katya", 24, false, 5.6);
		Employee stavri = new Employee("Stavri", 35, true, 40);
		Employee ico = new Employee("Hristo", 45, true, 60);

		people[0] = spas;
		people[1] = mitko;
		people[2] = georgi;
		people[3] = katya;
		people[4] = stavri;
		people[5] = ico;

		for (int index = 0; index < people.length; index++) {

			if (people[index] != null) {

				if (people[index] instanceof Student) {
					((Student) people[index]).showStudentInfo();
					System.out.println("________________________________");
				} else if (people[index] instanceof Employee) {
					((Employee) people[index]).showEmployeeInfo();
					System.out.println("________________________________");
				} else {
					people[index].showPersonInfo();
					System.out.println("________________________________");
				}
			}

		}
		for (int index = 0; index < people.length; index++) {

			if (people[index] != null) {
				if (people[index] instanceof Employee) {
					double overtime = ((Employee) people[index]).calculateOvertime(2);
					System.out.println(people[index].getName() + ": need to receive  " + overtime);
				}
			}
		}

	}

}

package Homework16;

public class Demo {

	public static void main(String[] args) {

		Person[] people = new Person[10];

		Person spas = new Person("Spas", 23, true);
		Person mitko = new Person("Dimitar", 28, true);
		Student georgi = new Student("Georgi", 26, true, 6);
		Student katya = new Student("Katya", 24, false, 5.6);
		Employee stavri = new Employee("Stavri", 36, true, 40);
		Employee ico = new Employee("Hristo", 40, true, 55);
		System.out.println(stavri.calculateOvertime(2));

	}

}

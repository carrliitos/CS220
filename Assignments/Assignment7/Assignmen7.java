import java.util.ArrayList;

public final class Assignmen7 {
	public static void main(String[] args) {

		Person[] people = {
			new Student("Carlitos", "Salazar", 123456, Program.COMPSCI, Program.BIO, 3.6),
			new Student("Henry", "Mycatnotyours", 789456, Program.PAWPATROL, Program.LITTERETIQUETTE, 4.0),
			new Student("Bentley", "Saruman", 147852, Program.WIZARDRY, Program.BIRDCALLS, 2.6),
			new Student("Saruman", "Bentley", 258741, Program.IDENTITYTHEFT, Program.ISNOTAJOKEJIM, 4.0),
			new Student("Pam", "Beesly", 123212, Program.RECEPTION, Program.ANSWERINGCALLS, 4.0),
			new GraduateStudent("Benzon", "Salazar", 1950288, Program.COMPSCI, Program.COMPSCI, 4.0, 20000),
			new GraduateStudent("Emi", "Nem", 000111, Program.MATH, Program.MATH, 4.0, 21000),
			new GraduateStudent("Teresa", "Sukkert", 1950288, Program.COMPSCI, Program.COMPSCI, 4.0, 20000),
			new Instructor("Dwight", "Schrute", 111222, Program.SELFDEFENSE, 70000.00),
			new Instructor("Bob", "Belcher", 808, Program.HOMEEC, 60000.00),
			new Instructor("Ted", "Mosby", 111111, Program.ENGARC, 90000.00)
		};

		System.out.println("All graduate students in the database:");
		for(int i = 0; i < people.length; i++){
			Person value = people[i];
			if(value instanceof GraduateStudent){
				GraduateStudent graduateStudent = (GraduateStudent) value;
				System.out.println(graduateStudent);
			}
		}

		System.out.println("\nAll of the Employees in the database:");
		for(int i = 0; i < people.length; i++){
			Person value = people[i];
			if(value instanceof Employee){
				Employee employees = (Employee) value;
				System.out.println(employees);

				double arrSalary[] = {employees.getSalary()};
				double sum = 0.0;

				for(int j = 0; j < arrSalary.length; j++){
					sum = sum + arrSalary[j];
				}

				double avgSalary = sum / arrSalary.length;

				System.out.printf("The average salary of all Employees: $%.2f.%n", avgSalary);
			}
		}
	}
}
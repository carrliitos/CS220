import java.util.Arrays;

public final class Assignment6 {
	public static void main(String[] args) {

		Person[] people = {
			new Student("Carlitos", "Salazar", 123456, "Computer Science", "Biology", 3.6),
			new Student("Henry", "Mycatnotyours", 789456, "Paw Patrol", "Litter Etiquette", 4.0),
			new Student("Bentley", "Saruman", 147852, "Wizardry", "Bird Calls", 2.6),
			new Student("Saruman", "Bentley", 258741, "IDENTITYTHEFT", "ISNOTAJOKEJIM", 4.0),
			new Student("Pam", "Beesly", 123212, "Reception", "Answering Calls", 4.0),
			new Instructor("Dwight", "Schrute", 111222, "Self Defense"),
			new Instructor("Bob", "Belcher", 808, "Home Economics"),
			new Instructor("Ted", "Mosby", 111111, "Engineering and Architecture")
		};

		System.out.println("Everyone in the database:");
		for(int i = 0; i < people.length; i++) {
			System.out.println(people[i]);
		}

		System.out.println("\nAll of the Instructors in the database:");
		System.out.println(people[5]);
		System.out.println(people[6]);
		System.out.println(people[7]);

		System.out.println("\nThe average GPA of each student in the database:");
		for(int i = 0; i < people.length; i++){
			Person value = people[i];
			if(value instanceof Student){
				Student student = (Student) value;
				student.getGPA();
			}
		}

	}
}
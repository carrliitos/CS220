public abstract class Person {
	final String firstName;
	final String lastName;
	final int id;

	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String toString() {
		String str = String.format("%s %s", firstName, lastName);
		return str;
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public int getID() { return id; }
}
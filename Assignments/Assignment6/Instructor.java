class Instructor extends Person {
	private final String department;

	Instructor(String firstName, String lastName, int id, String department) {
		super(firstName, lastName, id);
		this.department = department;
	}
	@Override
	public final String toString(){
		String str = String.format(" Prof. %s (Department of %s)", lastName, department);
		return str;
	}

	public String getDepartment() { return department; }
}
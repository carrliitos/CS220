public class Instructor extends Person implements Employee{
	private final Program department;
	private double salary;

	public Instructor(String firstName, String lastName, int id, Program department, double salary) {
		super(firstName, lastName, id);
		this.department = department;
		this.salary = salary;
	}
	@Override
	public final String toString(){
		String str = String.format(" Prof. %s (Department of %s)", lastName, department);
		return str;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void setSalary() {
		this.salary = salary;
	}


	public Program getDepartment() { return department; }
}
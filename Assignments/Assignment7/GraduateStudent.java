public class GraduateStudent extends Student implements Employee {
	private double salary;

	public GraduateStudent(String firstName, String lastName, int id, Program major, Program minor, double gpa, double salary) {
		super(firstName, lastName, id, major, minor, gpa);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary() {
		this.salary = salary;
	}

}
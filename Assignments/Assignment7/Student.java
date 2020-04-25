public class Student extends Person {
	private Program major;
	private Program minor;
	private double gpa;

	public Student(String firstName, String lastName, int id, Program major, Program minor, double gpa) {
		super(firstName, lastName, id);
		this.major = major;
		this.minor = minor;
		this.gpa = gpa;
	}

	@Override
	public final String toString(){
		String str = String.format("%s %s [%s Major / %s Minor] GPA: %f", firstName, lastName, major, minor, gpa);
		return str;
	}

	public void setMajor(Program major)
	{ this.major = major; }
	public void setMinot(Program minor)
	{ this.minor = minor; }
	public void setGPA(double gpa)
	{ this.gpa = gpa; }

	public Program getMajor() { return major; }
	public Program getMinor() { return minor; }
	public double getGPA() { return gpa; }
}
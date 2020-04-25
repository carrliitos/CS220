class Student extends Person {
	private String major;
	private String minor;
	private double gpa;

	public Student(String firstName, String lastName, int id, String major, String minor, double gpa) {
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

	public void setMajor(String major)
	{ this.major = major; }
	public void setMinot(String minor)
	{ this.minor = minor; }
	public void setGPA(double gpa)
	{ this.gpa = gpa; }

	public String getMajor() { return major; }
	public String getMinor() { return minor; }
	public double getGPA() { return gpa; }
}
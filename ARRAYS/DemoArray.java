/**
This program demonstrates how arrays are used. The array will hold salaries for four categories of employees
*/

public class DemoArray {
	public static void main(String[] args) {
		double salary[] = new double[4];

		salary[0] = 6.25;
		salary[1] = 6.55;
		salary[2] = 10.25;
		salary[3] = 16.85;

		System.out.println("Salaries one by one: ");
		System.out.println(salary[0]);
		System.out.println(salary[1]);
		System.out.println(salary[2]);
		System.out.println(salary[3]);
	}
}
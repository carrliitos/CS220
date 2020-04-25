/*
* This program is to show how to pass arrays to a method
*/

public class PassArrayElement {
	public static void main(String[] args) {
		final int NUM_ELEMENTS = 4; 
		int someNums[] = {5, 10, 15, 20};
		int x;

		System.out.print("At start of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x) {System.out.print(" " + someNums[x]);} // Create an array of four integers and displays them
		System.out.println();
		for(x = 0; x < NUM_ELEMENTS; ++x) {methodGetsOneInt(someNums[x]);} // call the method four times, passing each element in each turn
		System.out.print("At end of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x) {System.out.print(" " + someNums[x]);} // display the four numbers again
		System.out.println();
	}

	public static void methodGetsOneInt(int one) { 
		System.out.print("At start of method one is: " + one); // this method will display the number
		one = 999; 											   // change them to 999
		System.out.println(" and at the of method one is: " + one);	// and then display the number again
	}
}	
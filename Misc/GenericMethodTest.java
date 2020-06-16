/**
* Generic methods and classes enables programmers to specify, with a single method
* declaration, a set of related methods, or with a single class declaration, a set
* of related types, respectively.
* Generics also provide compile-time safety that allows programmers to catch invalid
* types at compile time.
*
*
* You can write single generic method declaration that can be called with arguments
* of different types. Based on the types of the arguments passed to the generic 
* method, the compiler handles each method call appropriately.
*
* Rules to follow:
* 	- All generic method declarations have a type parameter section delimited by
*		single brackets (<and>) that precedes the method's return type
* 	- Each type parameter section contains one or more type parameters separated
* 		by commas.
* 	- The type parameter can be used to declare the return type and act as
* 		placeholders for the types of arguments passed to the generic method
* 	- A generic method's body is declared like that of any other method.
* 		Type parameters can represent only reference types, not primitive types.
*/

public class GenericMethodTest {
	// Generic method printArray
	public static <E> void printArray(E[] inputArray) {
		// Display the array elements
		for(E element : inputArray) {
			System.out.printf("%s,", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create the arrays of Integer, Double, Character
		Integer[] intArray = {1, 3, 5, 6, 7, 8, 9, 10};
		Double[] doubleArray = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

		System.out.println("Array intArray contains:");
		printArray(intArray); // pass an integer array
		System.out.println("Array doubleArray contains:");
		printArray(doubleArray); // pass a double array
		System.out.println("Array charArray contains:");
		printArray(charArray); // pass a character array
	}
}
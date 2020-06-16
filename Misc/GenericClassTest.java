/**
* Generic Classes:
* 	- Declaration looks like a non-generic class declaration, except that the
* 		class name is followed by a type parameter section
* 	- As with generic methods, the type parameter section of a generic class can have
* 		one or more type parameters separated by commas.
*/

public class GenericClassTest<T> {
	private T t;

	public void add(T t){
		this.t = t;
	}
	
	public T get() { return t; }

	public static void main(String[] args) {
		GenericClassTest<Integer> integerBox = new GenericClassTest<Integer>();
		GenericClassTest<String> stringBox = new GenericClassTest<String>();

		// integerBox.add(new Integer(10)); -- Deprecated
		integerBox.add(Integer.valueOf(10));
		stringBox.add(new String("Hello World"));

		System.out.printf("Integer Value: %d\n\n", integerBox.get());
		System.out.printf("String Value: %s\n\n", stringBox.get());
	}
}
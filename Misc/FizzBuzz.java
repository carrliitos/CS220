public class FizzBuzz {
	public static void main(String[] args) {
		final int fizz = 3;
		final int buzz = 5;

		for(int i = 1; i <= 100; i++) {
			if((i % fizz == 0) && (i % buzz == 0)) {
				System.out.println("Fizz Buzz");
			}else if((i % fizz == 0)) { 
				System.out.println("Fizz");
			}else if((i % buzz == 0)) { 
				System.out.println("Buzz");
			}else{ System.out.println(i); }
		}
	}
}
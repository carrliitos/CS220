import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public final class Lab20 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 1, 2, 3, 5, 1, 2, 5, 6, 0, 1, 8, 9, 8, 6 };

		//TODO: Find the unique values in the array
		// List<Integer> uniqueValues = new ArrayList<Integer>(); // List is an interface, so we can't instantiate it.
																// Instead we use one of its implementing classes like ArrayList
																// We also need to import them
		// for(int i = 0; i < numbers.length; i++) {
		// 	// Option 1
		// 	// int value = numbers[i];
		// 	// if(!uniqueValues.contains(value)) { uniqueValues.add(value); }

		// 	// Option 2
		// 	// int value = numbers[i];
		// 	// if(!uniqueValues.contains(i)) { uniqueValues.add(i); }
		// }

		// Option 3: Enhanced For Loop
		// for(int value : numbers) { // "For each integer values in numbers" 
				// -- <What do we want to store the value in?> : <Where are we pulling from?>
		// 	The value in this case is the value of the numbers -- not the value of the index
		// 	if(!uniqueValues.contains(value)) { uniqueValues.add(value); }
		// }

		// Option 4: (best one so far) Sets - A collection that contains no duplicate elements and HashSet as the implementing class
		Set<Integer> uniqueValues = new HashSet<Integer>();
		for(int value : numbers) { 
			uniqueValues.add(value);
		}

		System.out.println("Unique Values:");
		System.out.println(uniqueValues);

		//TODO: Search for the number 9
		boolean containsNine = uniqueValues.contains(9);
		System.out.println("Contains Nine?:");
		System.out.println(containsNine);

		//TODO: Search for the number 4
		boolean containsFour = uniqueValues.contains(4);
		System.out.println("Contains Four?:");
		System.out.println(containsFour);

		//TODO: Get the frequency of each value in the array
		// We use Maps and HashMap as the implementing class
		// Class HashMap<K, V> -- K = key, V = value
		// We map each value to its frequency
		Map<Integer, Integer> frequencies = new HashMap<>(); // we use just the diamond operator because it's inferred from the declaration
		for(int key : numbers) {
			int count = frequencies.getOrDefault(key, 0);
			frequencies.put(key, count+1);
		}

		System.out.println("\nFrequency of each value: <Value>=<Frequency>");
		System.out.println(frequencies);
	}
}
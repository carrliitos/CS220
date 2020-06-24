/** HashMaps are hash table based implementation of the Map interface.
* 	HashMap class is roughly equivalent to a HashTable, but is unsynchornized
* 	and permits nulls.
*
*	This implementation allows for constant-time performance for basic operations,
* 	assuming the hash function disperses the elements properly among the buckets.
*
*	An instance of HashMap has two parameters:
*		1. Initial Capacity
* 			- Capacity is the number of buckets in the hash table
*			- Initial Capacity is the capacity at the time the hash table is created.
* 		2. Load Factor
*			- A measure of how full the hash table is allowed to get before its capacity is
*				automatically increased.
*		- When the the number of entries exceeds the poduct of the load factor and initial capacity,
*			the hash table is rehashed, that is the internal data structure is rebuilt, so that
* 			the hash table has approximately twice the number of buckets.
*/

import java.util.HashMap;

public class HashMapAwesomeness {
	public static void main(String[] args) {
		// Say we have some integers
		int a = 10;
		int b = 11;
		int c = 12;
		int d = 13;
		// If we had over a million of these values, we want to be able to put these variables
		//	into one easily accessible place -- enter HashMap
		
		// Create the HashMap<> object
		// We need to parameterize our HashMap with whatever we're putting into our map
		// In this case, our key = String, and value = Integer
		HashMap<String, Integer> happy = new HashMap<>();
		// to put the keys and their values onto our map, use the put(key, value) method
		happy.put("a", 10);
		happy.put("b", 11);
		happy.put("c", 12);
		happy.put("d", 13);

		// System.out.println(happy);
		// $ {a=10, b=11, c=12, d=13}
		// System.out.println(happy.get("a"));
		// $ 10

		// Example 2 - Store username and passwords
		HashMap<String, String> fun = new HashMap<>();
		fun.put("bSalazar", "ThatisMe");
		fun.put("henryBoi", "FluffyBoy123");
		fun.put("tSukkert", "ThisIsTeresaGurl");
		fun.put("helloKitty", "hellokittyFAN123");

		// System.out.println(fun);
		// $ {henryBoi=FluffyBoy123, bSalazar=ThatisMe, helloKitty=hellokittyFAN123, tSukkert=ThisIsTeresaGurl}
		fun.remove("helloKitty");
		// System.out.println(fun);
		// $ {henryBoi=FluffyBoy123, bSalazar=ThatisMe, tSukkert=ThisIsTeresaGurl}
	}
}
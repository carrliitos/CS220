
public final class Lab16 {

	public static void main(String[] args) {
		//When we want to store or pass an enum, we use the EnumName.ENUM_VALUE
		//In this case, we're passing Genre.ROCK as an argument
		Album a1 = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, Genre.ROCK);

		//Notice how the Genre is printed nicely from the toString() even though we never modified that method!
		System.out.println(a1);

		printOpinion(a1);
	}

	//Prints our opinion about an album based solely on its Genre (don't actually do this!)
	//Try changing the genre of the album passed in to see how the outcome changes
	private static void printOpinion(Album album) {
		//Retrieve the Genre using the getter
		Genre genre = album.getGenre();

		//The 'switch' statement allows us to construct complex if/else conditions without having to write them individually
		//It cleans up our code significantly!
		//Inside of the () parentheses, we put a constant expression such as a variable
		//That is the value 'to be switched'
		switch (genre) {
			//Each 'case' defines a certain value we define an outcome for
			//These can be stacked to form a 'cascade' which allows us to share one outcome over several values
			//For example- we share the print statement "I probably like this album" between 5 different Genres
			//Much better than writing if statements!
			case ROCK:
			case FOLK:
			case JAZZ:
			case CLASSICAL:
			case ELECTRONIC:
				System.out.println("I probably like this album!");
				//We must ALWAYS 'break' at the end of each block
				//This stops the switch statement from continuing through the cases
				break;
			//Cases do not have to be stacked- they can be individual as well
			case POP:
				System.out.println("I probably wouldn't care for this album");
				break;
			//We can use the 'default' case last to satisfy any values which were not already defined with their own case
			//This should always go last!
			default:
				System.out.println("I probably have a neutral opinion about this album");
				break;
		}
	}
}

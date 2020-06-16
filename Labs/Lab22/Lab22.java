import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public final class Lab22 {
	// Create a final path, which is a constant and can be capitalized
	// Since we are saving it as raw binary, we can save it however we want -- with any extension we want
	private static final String PATH = "myData.uww";

	public static void main(String[] args) {
		/* ***For seeing the saveToFile in action*** -- we need to comment it out to work on the next method

		Album myAlbum = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, Genre.ROCK);		
		
		try{
			// See saveToFile in action with our album
			saveToFile(myAlbum, PATH);			
		}catch(IOException e) {
			System.out.println("Failed to write to file");
			return;
		}
		*/

		// Handle all exceptions
		try{
			Album myAlbum = loadFromFile(PATH);
			System.out.println(myAlbum);
		}catch(FileNotFoundException e) {
			System.out.println("Can't load from file. File was not found.");
		}catch(IOException f) {
			System.out.println("Can't load from file. Error while reading");
		}catch(ClassNotFoundException g) {
			System.out.println("Can't load from file. Missing correct class.");
		}
	}

	private static void saveToFile(Album album, String path) throws IOException {
		// Create new ObjectOutputStream and create it to the given PATH
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH)); // Handle or throw exceptions
		// Write the object to the given path
		outputStream.writeObject(album);
		// Close the stream
		outputStream.close();
	}

	private static Album loadFromFile(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
		// Before trying to load from a file, check to see if it exists
		File file = new File(PATH);
		if(!file.exists()) { // For good practice, if a file does not exit, we should throw an exception
			throw new FileNotFoundException();
		}
		// Read from the file
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH)); // This whole method already throws a FileNotFoundException
		// Read in an object and cast it to a type we want
		Object obj = inputStream.readObject(); // This is a downcast -- Object cannot be converted to Album
		// Close stream 
		inputStream.close();
		return (Album)obj;
	}
}
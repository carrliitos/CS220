import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Lab21 {
	public static void main(String[] args) { // Never throw exception in main -- main is our last line of defense, we need better practice and handle exceptions better
		// If we want to handle it in main, we need to design a try-catch block
		String path = "Rolling-Stone-Top-500-Albums.csv";
		// save our list
		List<Album> albums;

		try {
			albums = readAlbumsFromFile(path);
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
			return;
		}catch(IOException e) {
			System.out.println("Error while reading from file");
			return;
		}

		// Experiment with the data to print it out in console
		albums.add(new Album("The Peace and The Panic", "Neck Deep", 2017, Genre.ROCK));

		// Print the albums using enhanced for loop
		for(Album album : albums) { System.out.println(album); }

		// Write the albums into file
		try {
			writeAlbumsToFile(albums, "Test.csv"); // test on a different copy please			
			System.out.println("Succesfully wrote to file.");
		}catch(IOException f) {
			System.out.println("Could not write to file");
		}
	}

	// Goal: we want to have a certain number of albums all stored together that was read in from our file
	// We use ArrayList because they are dynamic and will expand and resize to the size of its content
	private static List<Album> readAlbumsFromFile(String path) throws FileNotFoundException, IOException { // To handle unreported exception, handle FileNotFoundException
		// We need a buffered reader to read in from a file
		// We give the FileReader a file name parameter using the path
			// we dont want to pass in the hardcoded String literal
		BufferedReader reader = new BufferedReader(new FileReader(path)); // We've delegated the exception error to whoever uses it

		// Store data
		// List<Albums> albums = new ArrayList<>(); or
		ArrayList<Album> albums = new ArrayList<>(); // -- remember: We cannot instantiate a list because it is an interface
		
		// Go through the file and place data in ArrayList<>()
		
		// Consume the header row of .csv -- we don't want it
		reader.readLine(); // catch or declare IOException to be thrown

		// Read in data -- we can use any of the loops -- we use while loop, because we don't know how many items are going to be in the file
		String line; // initialize vv
		while( (line = reader.readLine()) != null) {
			// Split the lines in .csv
			String[] columns = line.split(",");
			// Start parsing things that we have in our classes
			// Parse year to string
			int year = Integer.parseInt(columns[1]);
			String title = columns[2];
			String artist = columns[3];
			// Parse String to Enum -- use the valueOf() method
			Genre genre = Genre.valueOf(columns[4].toUpperCase()); // Enums must be exactly the same -- even capitalizations

			// Create the album
			Album album = new Album(title, artist, year, genre);
			albums.add(album);
		}

		// close reader
		reader.close();
		
		return albums;
	}


	// Goal: To modify our files and place them in the file at compile time
	// Parameters = we need a place to put our file, and we need the Albums to place in a file
	private static void writeAlbumsToFile(List<Album> albums, String path) throws IOException {
		// Check to see if the path or file exists
		File file = new File(path); // File is an instance.. not a file on the disk
		if(!file.exists()) { file.createNewFile(); }

		// Create a file with text in it
		BufferedWriter writer = new BufferedWriter(new FileWriter(path)); // We're writing back to our original .csv or to a different .csv

		// Make sure we match the format of our original file
		// Create a header
		writer.write("Number,Year,Album,Artist,Genre");
		writer.newLine(); // detects what the proper end of line character is for any OS

		// Print out everything in our ArrayList or List
		for(int i = 0; i < albums.size(); i++) {
			Album album = albums.get(i); // .get() is defined by the List interface
			// Convert data into strings that needs to be converted, and then join them
			String number = Integer.toString(i + 1);
			String year = Integer.toString(album.getYear());
			String title = album.getTitle();
			String artist = album.getArtist();
			String genre = album.getGenre().toString();

			String line = String.join(",", number, year, title, artist, genre);

			// Write it to file
			writer.write(line);
			writer.newLine();
		}

		// close writer
		writer.close();
	}
}
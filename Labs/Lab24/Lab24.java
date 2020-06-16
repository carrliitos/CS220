import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public final class Lab24 {
	public static void main(String[] args) {
		List<Album> albums;

		try {
			albums = readAlbumsFromFile("Rolling-Stone-Top-500-Albums.csv");
			System.out.println("Successfully read from file!");
		}catch(FileNotFoundException e) {
			System.out.println("File not found");
			return;
		}catch(IOException e) {
			System.out.println("Could not read from file");
			return;
		}

		// Calling the method, but not directly, by passing a reference to it -- not invoking it
		// Pass the reference inside the sort method
		// Pass the compareAlbumsByYear(), because Comparator<> is a functional interface -- 
										// it has one method that is required to give a definition in order to provide a complete implementation of it

		// We need to provide a location of where we'll find the compareAlbumsByYear method
		// Syntax - <Class Name>::<Method Name>
		// albums.sort( Lab24::compareAlbumsByYear); -- METHOD REFERENCE

		// inside of sort, we need to break what it is that we need
		// we need two arguments, a1 and a2
		// what types are a1 and a2? they are albums -- it is implied by the compiler
		// -> after this, we tell it what are we returning? -- we don't explicitly say return
		albums.sort((a1, a2) -> a1.getYear() - a2.getYear()); // Lambda Expressions

		for(Album album : albums) {
			System.out.println(album);
		}
	}

	// Simple method -- compare method wants 2 (a1 and a2) things from the comparator
	// From here, we start removing what is implied by the compiler:
	/*
		int -- because the sort method MUST obviously return an integer, because it requires two arguments, and is sorted by the difference
		compareAlbumsByYear -- Because names do not matter in Java
		Album -- Because it has to be an album, we can only compare Albums to Albums because the type of our list is an album
		private -- we can remove
		static -- we can remove
	
	(a1, a2) {
		// Comparison
		// if string, we use their compareTo() value and return that
		// return difference of integers for their comparisons
		return a1.getYear() - a2.getYear();
	}
	*/

	private static List<Album> readAlbumsFromFile(String path) throws FileNotFoundException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

		List<Album> albums = new ArrayList<>();

		bufferedReader.readLine();

		String line;
		while((line = bufferedReader.readLine()) != null) {
			String[] columns = line.split(",");
			int year = Integer.parseInt(columns[1]);
			String title = columns[2];
			String artist = columns[3];
			Genre genre = Genre.valueOf(columns[4].toUpperCase());

			Album album = new Album(title, artist, year, genre);
			albums.add(album);
		}

		bufferedReader.close();
		return albums;
	}
}
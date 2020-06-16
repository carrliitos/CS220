import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public final class Lab23 {
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

		// Anonymous class -- CAN BE DONE WITH ANY INTERFACE
		albums.sort(new Comparator<Album>() { // It will implement the Comparator<Album> class
			@Override
			// We need to have compare, otherwise we would not have a comparator
			public int compare(Album al1, Album al2) {
				// Let's sort the album by year
				return al1.getYear() - al2.getYear();
			}
		});

		for(Album album : albums) {
			System.out.println(album);
		}
	}

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

import java.util.Scanner;
import java.io.File;

public class Lab6 {

	/* 	Declare a 'constant' value
		These are great for when we use the same literal (hard-coded value) repeatedly
		If we needed to change the number of albums, we'd only have to change it once! */
	static final int NUMBER_OF_ALBUMS = 500;

	public static void main(String[] args) {
		/*	This is a 'relative' filepath
			That means it's located relative to wherever your Java program is running
			You can also provide 'absolute' paths (C:\Users\Name\Programs\file.txt)
			However, we never want to use absolute paths because they are specific to that user!
			
			The .CSV file extension stands for Comma Separated Values
			They're similar to Microsoft Excel files except they lack any formatting (fonts, colors, formulas, etc.)
			Try opening the file with Notepad or similar text editor and you'll see the values stored as plaintext
			Open the file with Microsoft Excel and you'll see how the data is formatted nicely into columns and rows
			Each line represents a single data point containing several pieces of information (values)
			For this file in particular, it's 1) Ranking 2) Release Year 3) Album Title 4) Artist Name 5) Genre */

		String path = "Rolling-Stone-Top-500-Albums.csv";

		/*	File is a type provided by Java in the java.io.File library
			It's used to hold data ABOUT a file (not the file itself!)
			Think of it as a shortcut, a pointer to the file */
		File file = new File(path);

		/*	We've used Scanner to read input from the user before
			But it can also be used to read data from a File
			However, creating a Scanner using a File as an argument can throw a FileNotFoundException
			Therefore, we must contain the dangerous code inside of a try/catch block */
		Scanner scanner;
		try {
			// Construct a Scanner using our File as the argument
			scanner = new Scanner(file);
		}
		// Catch the potential Exception
		catch (Exception e) {
			System.out.println("File not found");
			return;
		}

		/*	Create 'parallel arrays' to store all the data in the file
			Each index of these arrays should match the same index in the other arrays
			For example: the data at the 5th index of 'years' should be the correct year for the album at the 5th index of 'titles' */
		int[] years = new int[NUMBER_OF_ALBUMS];
		String[] titles = new String[NUMBER_OF_ALBUMS];
		String[] artists = new String[NUMBER_OF_ALBUMS];
		String[] genres = new String[NUMBER_OF_ALBUMS];

		/*	The first line of the file is a header so we skip it
			This is very common in .CSV files */
		scanner.nextLine();

		// 	Run a loop once for every album in the file (each album is one line)
		for (int i = 0; i < NUMBER_OF_ALBUMS; i++) {
			// Read the line
			String line = scanner.nextLine();

			// Split it into columns using a comma "," as a separator
			String[] columns = line.split(",");

			// Parse the proper data type from each column
			int year = Integer.parseInt(columns[1]);
			String title = columns[2];
			String artist = columns[3];
			String genre = columns[4];

			// Place the data into the proper array
			years[i] = year;
			titles[i] = title;
			artists[i] = artist;
			genres[i] = genre;
		}

		// Print out the results
		for (int i = 0; i < NUMBER_OF_ALBUMS; i++) {
			String title = titles[i];
			int year = years[i];
			String artist = artists[i];
			String genre = genres[i];

			// Remember to always add one to indices when printing them!
			// Computer Scientists love zero-based indexing, but end-users find it confusing
			System.out.printf("%d)\t%s (%d) by %s [%s]%n", i + 1, title, year, artist, genre);
		}

		// Always close the Scanner when we're done with it to prevent resource leaks!
		scanner.close();

		/*	Note that Scanner can have issues with large data sets (we're using a large file to demonstrate this!)
			It's simple to use but does not scale well
			If your Scanner fails, try reducing the number of lines read at once (i.e. reduce NUMBER_OF_ALBUMS)
			Later we'll learn about a more powerful file reading technique which can easily handle large files! */
	}
}
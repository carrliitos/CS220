import java.util.Arrays;

public final class Lab18 {
	public static void main(String[] args) {
		Album[] albums = {
			new Album("The Dark Side of the Moon", "Pink Floyd", 1973, Genre.ROCK),
			new Album("Sgt. Pepper's Lonely Hearts Club Band", "The Beatles", 1969, Genre.ROCK),
			new Album("Blood on the Tracks", "Bob Dylan", 1975, Genre.FOLK),
			new Album("Oracular Spectacular", "MGMT", 2009, Genre.ELECTRONIC),
			new Album("War", "U2", 1983, Genre.ROCK)
		};

		System.out.println("\nSorting by album artist...");
		Arrays.sort(albums, new AlbumArtistComparator());
		printArray(albums);

		System.out.println("\nSorting by album title...");
		Arrays.sort(albums, new AlbumTitleComparator());
		printArray(albums);

		System.out.println("\nSorting by years...");
		Arrays.sort(albums);
		printArray(albums);


	}
	// Comparable is a generic interface 
	// <T> means generic
	// T - the type of objects that this pbject may be compared to
	private static <T> void printArray (Album[] array){
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}

public final class Album implements Comparable<Album>{ // I want to use a generic interface, we need to tell it what it is comparable to
		// In this case, the Ablbums -- we want to compare Album to Album
	private final String title;
	private final String artist;
	private final int year;
	private final Genre genre;

	public Album(String title, String artist, int year, Genre genre) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public int getYear() {
		return year;
	}

	public Genre getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return String.format("%s (%d) by %s [%s]", title, year, artist, genre);
	}


	//This whole method is our natural ordering
	@Override
	public int compareTo(Album other) { // How does it know that it should be an Album it is comparing to?
		// Because that is the generic type of comparable -- we are saying that Albums are comparable to other Albums
		// If this should come before other, then return a negative number
		// If this is equivalent to other then return zero
		// If this should come after other, then return a positive number

		return year - other.getYear();

	}
}

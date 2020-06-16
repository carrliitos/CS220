import java.io.Serializable;

public final class Album implements Comparable<Album>, Serializable{ 
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

	@Override
	public int compareTo(Album other) { 
		return year - other.getYear();
	}
}
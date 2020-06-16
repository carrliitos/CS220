//Rename me to Album
public final class AlbumTemplate {

	private final String title;
	private final String artist;
	private final int year;
	private final String genre;

	//Rename me to Album
	public AlbumTemplate(String title, String artist, int year, String genre) {
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

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return String.format("%s (%d) by %s [%s]%n", title, year, artist, genre);
	}
}

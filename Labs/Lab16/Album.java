
public final class Album {

	private final String title;
	private final String artist;
	private final int year;

	//By using the Genre enum instead of a String, we ensure that only values we approve can be stored in here
	//This prevents us as programmers from making a mistake later
	//It prevents the user from entering invalid values
	//And it prevents other people using our code from making a mistake
	private final Genre genre;

	//Enums are their own type, just like a class or an interface
	//As such, they can be passed as arguments, declared as instance variables, etc.
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
		return String.format("%s (%d) by %s [%s]%n", title, year, artist, genre);
	}
}

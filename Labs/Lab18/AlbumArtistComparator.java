import java.util.Comparator;


// This is the alternative to our natural ordering
public final class AlbumArtistComparator implements Comparator<Album> {
	@Override // AlbumArtistComparator is not abstract and does not override abstract method compare(Album, Album)
	// So we need to override
	public int compare(Album a1, Album a2){
		String artist1 = a1.getArtist();
		String artist2 = a2.getArtist();

		return artist1.compareTo(artist2);
	}
}
import java.util.Comparator;

public final class AlbumTitleComparator implements Comparator<Album> {
	@Override
	public int compare(Album a, Album b) { // The names of the parameters does not matter, we just have to match the types
		return a.getTitle().compareTo(b.getTitle());
	}
}
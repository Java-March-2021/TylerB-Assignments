import java.util.HashMap;
import java.util.Set;

public class SongList {
	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Happy Birthday", "Happy Birthday to you, you look like a monkey and you smell like one too");
		trackList.put("Mary Had A Little Lamb", "Mary had a little lamb whose fleece was white as snow.");
		trackList.put("Row Your Boat", "Row row row your boat gently down the stream");
		trackList.put("Humpty Dumpty", "Humpty Dumpty sat on a wall. Humpty Dumpty had a great fall");
		
		String track = trackList.get("Humpty Dumpty");
		System.out.println(track);
		
		Set<String> keys = trackList.keySet();
		for(String key : keys) {
			System.out.println("Track:" + key);
			System.out.println("Lyrics" + trackList.get(key));
		}
	}
}

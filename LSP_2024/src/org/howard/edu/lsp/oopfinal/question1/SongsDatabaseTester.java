package org.howard.edu.lsp.oopfinal.question1;
import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;



public class SongsDatabaseTester {
	SongsDatabase db = new SongsDatabase();
	
    @Test
    public void testAddSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> countrySongs = db.getSongs("Country");

        Set<String> jazzSongs = db.getSongs("Jazz");
        

        assertTrue(rapSongs.contains("Savage"));
        assertTrue(countrySongs.contains("Sweet Alabama"));
        assertTrue(jazzSongs.contains("Always There"));

    }

    @Test
    public void testGetSongs() {
    	
        db.addSong("Rap", "Savage");
        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> otherSongs = db.getSongs("Random");

        assertEquals(1, rapSongs.size());
        assertTrue(rapSongs.contains("Savage"));
        
        assertTrue(otherSongs.isEmpty());

    }

    
    
    @Test
    public void testGetGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertEquals("", db.getGenreOfSong("Unknown Song"));
    }

	
}

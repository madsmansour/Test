import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTDD {

    @Test
    void testTrack1() {
        Track track = new Track("You and I", Duration.ofMinutes(10).plusSeconds(8), false);
        assertEquals(track.getTitle(), "You and I");
        assertEquals(track.getDuration(), Duration.ofMinutes(10).plusSeconds(8));
        assertFalse(track.isBonusTrack());
    }
    @Test
    void testTrack2() {
        Track track2 = new Track("America", Duration.ofMinutes(4).plusSeconds(12), true);
        assertEquals(track2.getTitle(),"America");
        assertEquals(track2.duration, Duration.ofMinutes(4).plusSeconds(12));
        assertTrue(track2.isBonusTrack());
    }

    @Test
    void testEmptyRecordCreation() {
        Record record = new Record("single","Under Production", LocalDate.of(2074,10,6));
        assertEquals("single",record.getType());
        assertEquals("Under production",record.getTitle());
        assertEquals(LocalDate.of(2074,10,6),record.getReleaseDate());
        assertEquals(0,record.getTrackCount());
        assertEquals(Duration.ofSeconds(0),record.getPlayTime());
    }

    @Test
    void testRecordCreationWithTwoTracks() {
        Record record = new Record("album","Close to the Edge", LocalDate.of(1972,9,13));
        assertEquals("album",record.getType());
        assertEquals("Close to the Edge",record.getTitle());
        assertEquals(LocalDate.of(1972,9,13),record.getReleaseDate());
        assertEquals(2,record.getTrackCount());
        assertEquals(Duration.ofMinutes(14).plusSeconds(20),record.getPlayTime());
    }

}
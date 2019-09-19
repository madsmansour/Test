import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest {

    @Test
    void testGetD() {
        Track track = new Track(Duration.ofMinutes(10).plusSeconds(8),false,"you and i");
        Duration d = Duration.ofMinutes(10).plusSeconds(8);
        assertEquals(d,track.getD());
    }

    @Test
    void testSetD() {
    }

    @Test
    void testIsBonusTrack() {
    }

    @Test
    void testSetBonusTrack() {
    }

    @Test
    void getTitle() {
        Track track = new Track(Duration.ofMinutes(10).plusSeconds(8),false,"you and i");
        String testTitle = "you and i";
        assertEquals(testTitle,track.getTitle());
    }

    @Test
    void setTitle() {
    }
}
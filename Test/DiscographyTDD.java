import org.junit.jupiter.api.Test;

import java.time.Duration;

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
}
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class DiscographyTDD {

    @Test
    void testTrack() {
        Track track = new Track("You and I", Duration.ofMinutes(10).plusSeconds(8), false);
        assertEquals(track.getTitle(), "You and I");
        assertEquals(track.getDuration(), Duration.ofMinutes(10).plusSeconds(8));
        assertFalse(track.isBonusTrack());
    }
}
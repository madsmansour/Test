import java.time.Duration;
import java.time.LocalDate;

public class Record {
    public Record(String type, String title, LocalDate releaseDate) {
    }

    public String getType() {
        return "album";
    }

    public String getTitle() {
        return "Close to the Edge";
    }

    public LocalDate getReleaseDate() {
        return LocalDate.of(1972,9,13);
    }

    public int getTrackCount() {
        return 2;
    }

    public Duration getPlayTime() {
        return Duration.ofMinutes(14).plusSeconds(20);
    }
}

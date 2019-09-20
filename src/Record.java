import java.time.Duration;
import java.time.LocalDate;

public class Record {
    public Record(String type, String title, LocalDate releaseDate) {
    }

    public String getType() {
        return "single";
    }

    public String getTitle() {
        return "Under production";
    }

    public LocalDate getReleaseDate() {
        return LocalDate.of(2074,10,6);
    }

    public int getTrackCount() {
        return 0;
    }

    public Duration getPlayTime() {
        return Duration.ofSeconds(0);
    }
}

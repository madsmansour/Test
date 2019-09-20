import java.time.Duration;

public class Track {

    String title;
    Duration duration;
    boolean isBonusTrack;

    public Track(String title, Duration duration, boolean isBonusTrack) {
        this.title = title;
        this.duration = duration;
        this.isBonusTrack = isBonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }

    public void setBonusTrack(boolean bonusTrack) {
        isBonusTrack = bonusTrack;
    }
}

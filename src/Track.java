import java.time.Duration;

public class Track {

    public Track(Duration d, boolean isBonusTrack, String title) {
        this.d = d;
        this.isBonusTrack = isBonusTrack;
        this.title = title;
    }

    Duration d;
    boolean isBonusTrack;

    public Track(String and_you_and_i, Duration ofSeconds, boolean b) {
    }

    public Duration getD() {
        return d;
    }

    public void setD(Duration d) {
        this.d = d;
    }

    public boolean isBonusTrack() {
        return isBonusTrack;
    }

    public void setBonusTrack(boolean bonusTrack) {
        isBonusTrack = bonusTrack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

}

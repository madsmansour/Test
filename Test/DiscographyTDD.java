import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.Duration;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class DiscographyTDD {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Main.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testTrackCreation() {
        Track track = new Track("And you and I" , Duration.ofMinutes(10).plusSeconds(8), false);
        String title = track.getTitle();
        boolean bonusTrack = track.isBonusTrack();
        assertEquals(title,"And you and I");
        Duration d = track.getD();
        assertFalse(bonusTrack);
        assertEquals(Duration.ofMinutes(10).plusSeconds(8),d);
    }
}

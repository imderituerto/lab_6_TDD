import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ServerTest {

    Server server;
    Guest guest1;
    Guest guest2;

    @BeforeEach
    public void setUp(){
        server = new Server();
        guest1 = new Guest("Will", 19, 10, AccessLevel.BLACKLIST, Sobriety.SOBER, "£");
        guest2 = new Guest("Alice", 17, 4, AccessLevel.GREENLIST, Sobriety.DRUNK, "£");
    }

    // Test that guest can only get served if over 18
    @Test
    public void canServeGuestOver18(){
        assertThat(server.serveGuest(guest1)).isEqualTo(true);
    }
    @Test
    public void canServeGuestUnder18(){
        assertThat(server.serveGuest(guest2)).isEqualTo(false);
    }

    // Test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void canServeTenPounds(){
        assertThat(server.serveGuest(guest1)).isEqualTo(true);
    }
    @Test
    public void canServeFourPounds(){
        assertThat(server.serveGuest(guest2)).isEqualTo(false);
    }

    // Test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void canServeSober(){
        assertThat(server.serveGuest(guest2)).isEqualTo(true);
    }
    @Test
    public void canServeNotSober(){
        assertThat(server.serveGuest(guest1)).isEqualTo(false);
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void canServeBanned(){
        assertThat(server.serveGuest(guest1)).isEqualTo(true);
    }
    @Test
    public void canServeNotBanned(){
        assertThat(server.serveGuest(guest2)).isEqualTo(true);
    }
    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}

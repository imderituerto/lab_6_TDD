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
        guest1 = new Guest("Will", 18, 50, AccessLevel.GREENLIST, Sobriety.DRUNK, "£");
        guest2 = new Guest("Alice", 17, 50, AccessLevel.GREENLIST, Sobriety.SOBER, "£");
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void guestIsOver18(){
        //act
        /* if Guest age is =>18, serve (true)
            else, don't serve (false)
         */
        //assert
        assertThat(guest1.getAge()).isEqualto(>=18) // return true
    }

    @Test
    public void guestIsUnder18(){
        //arrange
        Guest guest = new Guest("Adam", 17);
        //act
        /* if Guest age is =>18, serve (true)
            else, don't serve (false)
         */

        //assert
        assertThat(guest2.getAge()).isEqualto(>=18) // return false
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)

}



public class Server {
    public boolean serveGuest(Guest guest){
        //bouncer pattern
        if (guest.getAge() < 18) {
            return false;
        }
        if (guest.getWallet() < 5) {
            return false;
        }
        if (guest.getSobriety() == Sobriety.DRUNK) {
        return false;
        }
        if (guest.getAccessLevel() != AccessLevel.GREENLIST) {
            return false;
        }
        return true;

        /* if
                not >18
                wallet not >5
                access not GREENLIST
                sobriety not SOBER/TIPSY
                currency not £
                don't serve (return false)
         else
                serve (return true)

         */

        // assertThat(guest2.getAge()).isEqualto(>=18) // return false
    }
}

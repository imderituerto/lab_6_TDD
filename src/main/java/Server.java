public class Server {
    public boolean serveGuest(Guest guest){
        if (guest.getAge() < 18) {
            return false;
        }

        return true;

        /* if
                age is >= 18
                wallet is >= 10
                access is != BLACKLIST
                sobriety != DRUNK
                currency = £
                serve (return true)
         else
                don't serve (return false)

         */

        // assertThat(guest2.getAge()).isEqualto(>=18) // return false
    }
}

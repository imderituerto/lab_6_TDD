import java.util.ArrayList;

public class Guest {

    private String name;
    private int age;
    private int wallet;
    private AccessLevel accessLevel;
    private Sobriety sobriety;
    private String currency;

    public Guest(String name, int age, int wallet, AccessLevel accessLevel, Sobriety sobriety, String currency){
        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.accessLevel = accessLevel;
        this.sobriety = sobriety;
        this.currency = currency;
    }

    public int getAge(){
        return this.age;
    }
    public int getWallet(){
        return this.wallet;
    }
    public Sobriety getSobriety(){
        return this.sobriety;
    }
    public AccessLevel getAccessLevel(){
        return this.accessLevel;
    }

}

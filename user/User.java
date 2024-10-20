package user;

import java.util.UUID;

public abstract class User {
    public String id;
    public  String username;
    public String password;
    public String type;

    public User(String username, String password, String type) {
        this.id = UUID.randomUUID().toString().substring(0,3);
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getId(){
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public abstract double getBalance();
    public abstract double setBalance(double newBalance);
    public abstract double setBalancePurchase(double newBalance);

    public String getType(){
        return type;
    }

}

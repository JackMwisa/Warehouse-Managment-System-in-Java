package user;

public class Client extends User {

    private double balance;

    public Client(String username, String password, String type) {
        super();
        this.balance = 0;
    }

    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double newBalance) {
        this.balance += newBalance;
    }

    public void setBalancePurchase(double newBalance) {
        this.balance -= newBalance;
    }

}


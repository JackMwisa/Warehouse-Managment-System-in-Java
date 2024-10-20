package user;

public class Manager extends User{
    private double accountBalance;


    public Manager(String username, String password, String type) {
        super(username, password, type);
        this.accountBalance = 0;
    }

    @Override
    public String getUsername(){
        return username;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public double getBalance() {
        return accountBalance;
    }

    @Override
    public void setBalance(double newBalance) {
        this.accountBalance = newBalance;
    }

    public void setBalancePurchase(double newBalance) {
        this.accountBalance -= newBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

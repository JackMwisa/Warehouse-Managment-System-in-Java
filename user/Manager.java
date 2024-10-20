package user;

public class Manager extends User{
    private double accountBalance;


    public Manager(String id, String username, String password, String type) {
        String manager = "Manager";

        super(id, username, password, type:manager);
        this.accountBalance = 0;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}

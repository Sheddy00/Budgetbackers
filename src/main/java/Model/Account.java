package Model;

public class Account {
    private int id;
    private String name;
    private double balance;
    private String currency;
    private String password;

    public Account(int id, String name, double balance, String currency, String password) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

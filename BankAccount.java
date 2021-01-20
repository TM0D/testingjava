// package u5classes;
public class BankAccount {
    private double balance;
    private int accountID;
    private String userName;

    private static int nextAvailID = 1;

    // Java Setup Classes

    public BankAccount() {
        balance = 0;
        accountID = nextAvailID;
        userName = "";
        nextAvailID++;
    }

    public BankAccount(String user) {
        balance = 0;
        accountID = nextAvailID;
        userName = user;
        nextAvailID++;
    }

    public BankAccount(String user, double bal) {
        balance = bal;
        accountID = nextAvailID;
        userName = user;
        nextAvailID++;
    }
/*
    public BankAccount(int accountIDIn, String user) {
        balance = 0;
        accountID = accountIDIn;
        userName = user;
    }
*/
    public BankAccount(BankAccount other){
        balance = other.getBal();
        accountID = nextAvailID;
        userName = other.getUsername();
        nextAvailID++;
    }

    public String toString() {
        if (userName.equals("")) {
            return accountID + ": $" + balance;
        } else {
            return userName + ": $" + balance;
        }
    }

    // Accessors

    public int getAccountID() {
        return accountID;
    }

    public double getBal() {
        return balance;
    }

    public String getUsername() {
        return userName;
    }
    
    // Check Methods

    private boolean checkID() {
        if (accountID == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Vairables

    public void setBal(double newBal) {
        if (checkID()) {
            System.out.println("Requires Account ID. Balance is $" + balance);
            return;
        }
        balance = newBal;
    }

    public void deposit(double addToBal){
        if (checkID()) {
            System.out.println("Requires Account ID. Balance is $" + balance);
            return;
        } 
        balance += addToBal;
    }

    public void withdrawl(double rmFromBal){
        if (checkID()) {
            System.out.println("Requires Accound ID. Balance is $" + balance);
            return;
        } 
        balance -= rmFromBal;
    }

    public void setUsername(String newUsername){
        userName = newUsername;
    }

}

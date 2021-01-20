// package u5classes;
public class BankAccount {
    private double balance;
    private int accountID;
    private String userName;

    // Java Setup Classes

    public BankAccount() {
        balance = 0;
        accountID = 0; // make random id
        userName = "";
    }

    public BankAccount(int accountIDIn, String user) {
        balance = 0;
        accountID = accountIDIn;
        userName = user;
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
            System.out.print("Requires Accound ID. Balance is $" + balance);
            return;
        }
        balance = newBal;
    }

    public void deposit(double addToBal){
        if (checkID()) {
            System.out.print("Requires Accound ID. Balance is $" + balance);
            return;
        } 
        balance += addToBal;
    }

    public void withdrawl(double rmFromBal){
        if (checkID()) {
            System.out.print("Requires Accound ID. Balance is $" + balance);
            return;
        } 
        balance -= rmFromBal;
    }

}

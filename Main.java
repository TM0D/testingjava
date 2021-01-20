// import java.util.Scanner;
// import u5classes.*;
// import archive.*;
public class Main {
  public static void main(String[] args) {
    testing();
  }
  
  // CURRENT
  public static void testing() {
    BankAccount b1 = new BankAccount("Test");
    BankAccount nullAccount = new BankAccount();

    System.out.println(b1);
    System.out.println(nullAccount);

    b1.setBal(546);

    System.out.println(b1.getAccountID());
    System.out.println(b1.getUsername());
    System.out.println(b1.getBal());

    b1.withdrawl(46);

    System.out.println(b1);

    nullAccount.setBal(534);

    System.out.println(nullAccount);
  }
}
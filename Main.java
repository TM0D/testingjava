// import java.util.Scanner;
import u5classes.*;
// import archive.*;
public class Main {
  public static void main(String[] args) {
    testingHW();
  }
  
  // CURRENT
  public static void testingHW() {
    HiddenWord puzzle = new HiddenWord("WELLERMAN"); // 9

    System.out.println(puzzle.getGuess("WESTLTOWN"));
    System.out.println(puzzle.getGuess("WELLSTOWN"));
    System.out.println(puzzle.getGuess("WELLERTON"));
    System.out.println(puzzle.getGuess("WELLERMIN"));
    System.out.println(puzzle.getGuess("WELLERMAN"));

  }

  public static void testingBA() {
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
package archive;

import java.util.Scanner;

/**
 * This is just a bunch of olf methods i quickly wrote for little things
 * throughout about 4 units, usually by sorted by date written. Few have
 * Javadoc already, but I might change that, idk.
 * 
 */
public class oldAPCSACode {
  // Unit 1 & 2
  public static String getInitials(String fullName) {
    // BAD PRACTICE DON'T DO THIS
    fullName = fullName.trim();
    fullName = " " + fullName;
    int secondSpace = fullName.indexOf(" ", 2) + 1;
    int thirdSpace = fullName.indexOf(" ", secondSpace + 1) + 1;

    String It = fullName.substring(1, 2) + fullName.substring(secondSpace, secondSpace + 1)
        + fullName.substring(thirdSpace, thirdSpace + 1);
    // System.out.println(secondSpace);

    return It.toUpperCase();
  }

  public static int doubleToInt(double a) {
    return (int) a;
  }

  public static void mathMethods() {
    int test;
    for (int i = 0; i < 100; i++) {
      test = (int) (Math.random() * 5) + 3;
      System.out.print(test);
    }
  }

  /**
   * Given a string, if the string begins with "red" or "blue" return that color
   * string, otherwise return the empty string. seeColor("redxx") --> "red"
   * seeColor("xxred") --> "" seeColor("blueTimes") --> "blue"
   */
  public static String seeColor(String str) {
    String redSub = "";
    String blueSub = "";
    if (str.length() > 2) {
      redSub = str.substring(0, 3);
    }
    if (str.length() > 3) {
      blueSub = str.substring(0, 4);
    }
    if (redSub.equals("red")) {
      return "red";
    } else if (blueSub.equals("blue")) {
      return "blue";
    } else {
      return "";
    }
  }
  public static String seeColorV2(String str) {
    str = str + "xxxxxx";
    String redSub = str.toLowerCase().substring(0, 3);
    String blueSub = str.toLowerCase().substring(0, 4);
    if (redSub.equals("red")) {
      return "red";
    } else if (blueSub.equals("blue")) {
      return "blue";
    } else {
      return "";
    }
  }

  public static boolean lessBy10(int a, int b, int c){
   int ap = a - 10; int bp = b - 10; int cp = c - 10;
   if (a <= bp || a <= cp || b <= ap || b <= cp || c <= ap || c <= bp){
    return true;
   } else {
     return false;
   }
  }

  public static void guessGame() {
    int throwAway = (int)(Math.random() * 100);
    System.out.println("I have chosen a number between 1 and 100. Guess: " + throwAway);
    Scanner input = new Scanner(System.in);
    String guess = input.nextLine();
    while (!(Integer.valueOf(guess) == throwAway)) {
      int intGuess = Integer.valueOf(guess);
      if (intGuess > throwAway) {
        System.out.print("Too High!");
      } else {
        System.out.print("Too Low!");
      }
      System.out.println(" Try again!");
      guess = input.nextLine();
    }
    System.out.println("You got it!");
    input.close();
  }

/**
   * Prints the first num self-devisors that 
   * are greator than
   * or equal to start
   * 
   * @Note APCSA.FRQ
   * @see isSelfDevisor
   */
  public static void firstNumSelfDivisors(int start, int total) {
    for(int i = 0; i < total; i++) {
      while(!isSelfDevisor(start)){
        start++;
      }
      System.out.println(start);
      start++;
    }
  }

  /**
   * Returns true/false depending weather 
   * or not number is a self devisor.
   * 
   * @note APCSA.FRQ
   * @see firstNumSelfDivisors
   */
  public static boolean isSelfDevisor(int number) {
    int n = number;
    while (!(n == 0)) {
      int d = n % 10;
      if (d == 0) {
        return false;
      } else if (number % d != 0) {
        return false;
      } else {
       n = n / 10;
      }
    }
    return true;
  }

  public static void DayOTW(){
      Scanner in = new Scanner(System.in);
  
      System.out.println("Enter the date: (mm dd yyyy)");
  
      int mm = in.nextInt();
      int dd = in.nextInt();
      int yyyy = in.nextInt();
      System.out.println("You entered: " + mm + "/" + dd + "/" + yyyy);
      in.close();
  
      int dotw;
  
      int a = ((14 - mm)/12);
      yyyy = yyyy - a;
      mm = mm + 12 * a - 2;
  
      dotw = (dd + yyyy + (yyyy / 4) - (yyyy / 100) + (yyyy / 400) + (31 * mm) / 12) % 7;
  
     switch(dotw) {
      case 0 : System.out.print("The day is Sunday."); break;
      case 1 : System.out.print("The day is Monday."); break;
      case 2 : System.out.print("The day is Tuesday."); break;
      case 3 : System.out.print("The day is Wednesday."); break;
      case 4 : System.out.print("The day is Thursday."); break;
      case 5 : System.out.print("The day is Friday."); break;
      case 6 : System.out.print("The day is Saturday."); break;
      default : System.out.print("The day could not be found."); break;
     }
  
  }
}

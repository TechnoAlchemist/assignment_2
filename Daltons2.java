import java.util.Scanner;

public class Daltons2 {

  public static void main(String[] args) {

    int[] brothers = new int[4];

    String[] names = new String[] {"Joe", "William", "Jack", "Averell"};

    Scanner scan = new Scanner(System.in);

    System.out.println("We are going to sort the Dalton bros according to height");

    // need to initialize the array values here
      for (int j = 0; j < names.length; j++) {
        System.out.print("Enter the height of " + names[j] + ": " );
        brothers[j] = scan.nextInt();
      }

    // print the array values
    for (int j = 0; j < names.length; j++) {
      System.out.print(names[j] + ": " + brothers[j]);
    System.out.println();
    }
  }
}
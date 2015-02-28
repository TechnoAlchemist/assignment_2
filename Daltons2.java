import java.util.Scanner;

public class Daltons2 {

  public static void main(String[] args) {

    int[] brothers = new int[4];

    String[] names = new String[] {"Joe", "William", "Jack", "Averell"};

    Scanner scan = new Scanner(System.in);

    System.out.println("We are going to sort the Dalton bros according to height");

    // need to initialize the array values here
    for (int i = 0; i < names.length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("Enter the height of " + names[i] + ": " );
        brothers[j] = scan.nextInt();
      }
    }

    // print the array values
   for (int i = 0; i < names.length; i++) {
    for (int j = 0; j <= i; j++) {
      System.out.print(names[i] + ": \t" + brothers[j]);
    System.out.println();
    }
   }
  }
}
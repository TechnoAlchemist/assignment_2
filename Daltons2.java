import java.util.Scanner;
import java.util.Arrays;

public class Daltons2 {

  public static void main(String[] args) {

    int[] brothers = new int[4];

    String[] names = new String[] {"Joe", "William", "Jack", "Averell"};

    Scanner scan = new Scanner(System.in);

    System.out.println("We are going to sort the Dalton bros according to height (inches) ");

    // need to initialize the array values here
    for (int index = 0; index < names.length; index++) {
      System.out.print("Enter the height of " + names[index] + ": " );
      brothers[index] = scan.nextInt();
    }

    // print the array values
    System.out.println("The Brothers' heights in Ascending order are: ");

    for (int index = 0; index < names.length; index++) {
      Arrays.sort(brothers);
      System.out.print(names[index] + ": " + brothers[index] + " inches.");
    System.out.println();
    }

    System.out.println("The Brothers' heights in Descending order are: ");

    for (int index = names.length - 1; index >= 0; index--) {
      Arrays.sort(brothers);
      System.out.print(names[index] + ": " + brothers[index] + " inches.");
    System.out.println();
    }
  }
}
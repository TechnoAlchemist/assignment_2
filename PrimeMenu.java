import java.util.Scanner;

public class PrimeMenu {

  public static void main(String[] args) {

    System.out.print("Please enter a positive natural number: ");

    Scanner scan = new Scanner(System.in);

    int number = scan.nextInt();

    int count;

    scan.close();

    for (int i = 2; i <= (number); i++) {
      count = 0;     
      while (number % i == 0) {
        number /= i;
        count++;
      }

      if (count == 0) {
        continue;
      }

      System.out.println("The prime number is: " + i + " and the count is: " + count);
    }
  } 
}
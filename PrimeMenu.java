import java.util.Scanner;

public class PrimeMenu {

  public static void main(String[] args) {

    System.out.print("Please enter a positive natural number: ");

    Scanner scan = new Scanner(System.in);

    int number = scan.nextInt();

    int count;

    scan.close();

    // Print the number of 2s that divide n
    while (number % 2 == 0) {
      System.out.printf("%d ", 2);
      number = number / 2;
    }

    // n must be odd at this point. So we can skip one element
    for (int i = 3; i <= Math.sqrt(number); i = i + 2) {

      // while i divides n, print i and divide n
      while (number % i == 0) {
        System.out.printf("%d ", i);
        number = number / i;
      }

    }

    // this condition is to handle the case when n is a prime number  
    // greater than 2

    if ( number > 2) {
      System.out.printf("%d ", number);
    }

    // for (int i = 2; i <= (number); i++) {
    //   count = 0;     
    //   while (number % i == 0) {
    //     number /= i;
    //     count++;
    //   }

    //   if (count == 0) {
    //     continue;
    //   }

    //   System.out.println(i + "**" + count);
    // }
  } 
}
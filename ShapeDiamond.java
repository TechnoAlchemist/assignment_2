/* Gabriel Lafontant glafonta@gmail.com */

import java.util.Scanner;

public class ShapeDiamond {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num;

    System.out.println("Welcome to Diamond Cutter where we display the pattern of *.");
    
    System.out.print("Please enter a number: ");
    num = scan.nextInt();

    System.out.println("\nHere is the Diamond of Stars\n");


    for (int i = -num; i <= num; i++) {
      for (int j = -num; j <= num; j++) {
        if (Math.abs(i) + Math.abs(j) <= num) {
          System.out.print("*");
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.println();
     }

  }
}
/* Gabriel Lafontant glafonta@gmail.com */

import java.util.Scanner;

public class ShapeDiamond {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num;

    System.out.println("Welcome to Diamond Cutter where we display the pattern of *.");
    
    System.out.print("Please enter a number: ");
    num = scan.nextInt();

    for (int i = 1; i <= num; i++) {

      for (int j = 0; j < (num - 1); j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int k = 1; k < i; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

    for (int i = num - 1; i >= 1; i--) {

      for (int j = 0; j < (num - 1); j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int k = 1; k < i; k++) {
        System.out.print("*");
      }

      System.out.println();
    }

    System.out.println();

  }
}
/* Gabriel Lafontant glafonta@gmail.com */

import java.util.Scanner;

public class ShapeDiamond {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num;
    String diamond;

    System.out.println("Welcome to Diamond Cutter where take integers and shape them into a diamond patter.");
    
    System.out.print("Please enter a number: ");
    num = scan.nextInt();

    String numString = Integer.toString(num);

    diamond = String.format("%" + numString.length() + "s", "").replace(' ', '*');

    System.out.println(diamond);


  }
}
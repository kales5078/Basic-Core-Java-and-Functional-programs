/*************************************************************************************************************************************************************************
  ***************************************************************** To compute Quotient and Remainder ********************************************************************
  *
  * Name suraj akle
  * date 18/06/2021
  *
  ***********************************************************************************************************************************************************************/

import java.util.Scanner;
public class QuotientRemainder {

  public static void main(String[] args) {

    // Get Divend and Divisor input from user
	
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Divedend");
    int dividend=sc.nextInt();

    System.out.println("Enter the Divisor");
    int divisor=sc.nextInt();

    // Computing Process

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  }
}

/*************************************************************************************************************************************************************************
  ********************************************************* Check the number is Even or Odd ******************************************************************************
  * Name : suraj kale
  * @Since 18-08-2021 
***********************************************************************************************************************************************************************/

import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		// Get input from user

		System.out.println("Enter the Number");

		int num=sc.nextInt();

		// check the remainer is 0 or not 

		if (num % 2 ==0) {

			System.out.println("Given Number is even");

  		}

		else

			System.out.println("Given Number is odd");

	}

}

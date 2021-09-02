/*************************************************************************************************************************************************************************
  ************************************************************** Prints and compute upto 1/1+1/2+.....+1/N ****************************************************************
  *
  * Name : Suraj Kale
  * Date : 18/06/2021 
  *
  ***********************************************************************************************************************************************************************/

import java.util.*;
class Harmonic {
        public static void main(String[] args) {

		// Get input N from the user

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the harmoni value");
                int hv=sc.nextInt();
		double sum=0;
	
		// Print value by using for loop	

		for (int i=1; i<=hv; i++) {
			sum=sum+(1.0/i);
		}
		System.out.println("sum = "+sum);
	}
}

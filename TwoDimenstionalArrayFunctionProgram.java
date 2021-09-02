package company;
import java.util.Scanner;
public class TwoDimenstionalArrayFunctionProgram {
  public static void main(String[] args) {
		
	  System.out.print("Enter 2D array size : ");
      Scanner sc=new Scanner(System.in);
      int rows=sc.nextInt();
      int columns=sc.nextInt();
      
      System.out.println("Enter array elements : ");    
       
      int twoD[][]=new int[rows][columns];
	for(int i=0; i<rows;i++)
        {            
           for(int j=0; j<columns;j++)
           {
               twoD[i][j]=sc.nextInt();
           }
        }
       System.out.print("Array you entered : \n");
      for(int i=0; i<rows;i++)
       {            
          for(int j=0; j<columns;j++)
          {
            System.out.print(twoD[i][j]+" ");
          }
       System.out.println();
       }
      
}
}

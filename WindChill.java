package math;
import java.util.*;
public class WindChill {
	//class level varrible
	 static double t,v;
	 
	 //function to get windchill value 
	static void windchill() {
		
 double w=(35.74)+(0.6215*t)+((0.4275*t)-(35.75))*Math.pow(v,0.16);
			System.out.println(w);
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter Value of v");
			double v=sc.nextDouble();
			System.out.println("Enter Value of t");
	        double t=sc.nextDouble();
		
			windchill();
	
	
		}	
	
}

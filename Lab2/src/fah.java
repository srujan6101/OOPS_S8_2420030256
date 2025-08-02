import java.util.Scanner;
public class fah {
	
	public static void main(String[] args) {
	    int temp;
	    System.out.print("Enter the temp");
	    Scanner sc = new Scanner(System.in);
	       temp = sc.nextInt();  
	    double cel = (temp - 32) * 5.0/9.0;
	    System.out.print("Temperature in Celsius is : " +cel);
	    
	    
	    
	  }


}

import java.util.Scanner;
public class perfect_number {

	  public static void main(String[] args) {
	    
	    int n;
	    System.out.print("Enter Number : ");
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    
	    int sum = 1;
	    
	    for(int i = 2;i<n;i++) {
	      
	      if(n % i == 0) {
	        sum +=i;
	      }
	    }
	    if(sum == n) {
	    System.out.print(n + " is a perfect number.");
	    
	    }
	    
	    else {
	      System.out.print(n + " is not a perfect number");
	    }
	    
	  }
}
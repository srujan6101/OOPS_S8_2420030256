import java.util.Scanner;
public class characteridentification {
	  
	  public static void main(String[] args) {
	        
	    System.out.println("Enter Character: "); 
	        Scanner sc = new Scanner(System.in);
	        
	        char ch;
	        
	        ch = sc.next().charAt(0);
	        
	        if(ch >= 65 && ch <= 90)
	        {
	          System.out.println("Character is an Alphabet.");
	        }
	        
	        else if(ch >= 97 && ch <= 122)
	        {
	          System.out.println("Character is an Alphabet.");
	        }
	        else
	        {
	          System.out.println("Character is not an Alphabet.");
	        }

	      }
	  
	  

	}


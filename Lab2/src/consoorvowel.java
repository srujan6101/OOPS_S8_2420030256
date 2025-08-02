	import java.util.Scanner;
public class consoorvowel {
	 public static void main(String[] args) {
		    
		    System.out.print("Enter Character : ");
		    Scanner sc = new Scanner(System.in);
		    char ch = sc.next().charAt(0);
		    
		    if(ch == 'a' 
		    		||ch == 'e' || ch == 'i'||ch == 'o' ||ch == 'u' ||ch == 'A'|| 
		        ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') {
		      System.out.print(ch + " is a Vowel.");
		      
		    }
		    
		    else {
		      
		      System.out.print(ch + " is a consonant.");
		    }
		    
		  
		  }


}

package lab2;
import java.util.*;
public class vowel_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter a character: ");
char ch = sc.next().charAt(0); 
if((ch =='A' ||ch=='E' || ch=='I'||ch=='o'||ch=='u')||(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
	System.out.println("given character is an vowel:"+ch);
}
else {
	System.out.println("given character is not an vowel");
}
	}

}
package lab2;
import java.util.*;
public class sum_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
while(num!=0) {
	int digit=num%10;
	sum=digit+sum;
	 num=num/10;
}
System.out.println("sum of digits in a number is:"+sum);
	}

}
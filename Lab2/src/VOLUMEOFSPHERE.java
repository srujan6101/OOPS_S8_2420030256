import java.util.Scanner;
public class VOLUMEOFSPHERE {
	 public static void main(String[] args) {
		   int r;
		   float pi=3.14f;
		   double vol;
		   System.out.print("Enter the radius");
		     Scanner sc = new Scanner(System.in);
		     r = sc.nextInt();  
		     vol = 4/3*pi*r*r*r;
		     System.out.print("Volume of Sphere is : " +vol);
		     
		     
		     
		     
		 }
}

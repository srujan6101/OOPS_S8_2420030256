package lab3;

import java.util.Scanner;

public class nonrepeating_characters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                System.out.println("First non-repeating character: " + c);
                sc.close(); // Closing the scanner
                return;
            }
        }

        System.out.println("No non-repeating characters found.");
        sc.close();
    }
}

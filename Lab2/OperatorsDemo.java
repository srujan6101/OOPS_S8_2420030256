public class OperatorsDemo {
    public static void main(String[] args) {

        // Variables
        int a = 10, b = 5;

        System.out.println("===== Arithmetic Operators =====");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        System.out.println("\n===== Relational Operators =====");
        System.out.println("a == b : " + (a == b));  // Equal to
        System.out.println("a != b : " + (a != b));  // Not equal to
        System.out.println("a > b  : " + (a > b));   // Greater than
        System.out.println("a < b  : " + (a < b));   // Less than
        System.out.println("a >= b : " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b : " + (a <= b));  // Less than or equal to

        System.out.println("\n===== Logical Operators =====");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));  // Logical AND
        System.out.println("x || y : " + (x || y));  // Logical OR
        System.out.println("!x     : " + (!x));      // Logical NOT

        System.out.println("\n===== Assignment Operators =====");
        int c = 20;
        System.out.println("Initial c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 → " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 → " + c);
        c -= 10; // c = c - 10
        System.out.println("c -= 10 → " + c);

        System.out.println("\n===== Unary Operators =====");
        int d = 7;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));  // Pre-increment
        System.out.println("d++ = " + (d++));  // Post-increment
        System.out.println("After d++ → " + d);
        System.out.println("--d = " + (--d));  // Pre-decrement
        System.out.println("d-- = " + (d--));  // Post-decrement
        System.out.println("After d-- → " + d);

        System.out.println("\n===== Bitwise Operators =====");
        int p = 6;  // 0110 in binary
        int q = 3;  // 0011 in binary
        System.out.println("p & q = " + (p & q));   // Bitwise AND
        System.out.println("p | q = " + (p | q));   // Bitwise OR
        System.out.println("p ^ q = " + (p ^ q));   // Bitwise XOR
        System.out.println("~p    = " + (~p));      // Bitwise NOT
        System.out.println("p << 1 = " + (p << 1)); // Left shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift
    }
}

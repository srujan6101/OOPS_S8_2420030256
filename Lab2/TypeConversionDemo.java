public class TypeConversionDemo {
    public static void main(String[] args) {

        System.out.println("===== Implicit Type Conversion (Widening) =====");

        int intVal = 100;
        long longVal = intVal;               // int to long
        float floatVal = longVal;            // long to float
        double doubleVal = floatVal;         // float to double

        System.out.println("int value: " + intVal);
        System.out.println("Converted to long: " + longVal);
        System.out.println("Converted to float: " + floatVal);
        System.out.println("Converted to double: " + doubleVal);

        System.out.println("\n===== Explicit Type Conversion (Narrowing) =====");

        double originalDouble = 123.456;
        float castFloat = (float) originalDouble;   // double to float
        int castInt = (int) originalDouble;         // double to int (fraction lost)
        byte castByte = (byte) castInt;             // int to byte (may overflow)

        System.out.println("Original double: " + originalDouble);
        System.out.println("Casted to float: " + castFloat);
        System.out.println("Casted to int (decimal truncated): " + castInt);
        System.out.println("Casted to byte (possible overflow): " + castByte);
    }
}

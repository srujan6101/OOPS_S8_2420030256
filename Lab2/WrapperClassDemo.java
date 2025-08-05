public class WrapperClassDemo {
    public static void main(String[] args) {

        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 12.34;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        // Converting primitives to wrapper class objects (Boxing)
        Integer wrappedInt = Integer.valueOf(primitiveInt);      // Boxing
        Double wrappedDouble = Double.valueOf(primitiveDouble);
        Character wrappedChar = Character.valueOf(primitiveChar);
        Boolean wrappedBoolean = Boolean.valueOf(primitiveBoolean);

        // Autoboxing (automatic conversion from primitive to wrapper)
        Integer autoBoxedInt = primitiveInt;

        // Unboxing (wrapper to primitive)
        int unboxedInt = wrappedInt.intValue();

        // Auto-unboxing
        double autoUnboxedDouble = wrappedDouble;

        // Displaying results
        System.out.println("===== Wrapper Class Demonstration =====");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed int from Integer: " + unboxedInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Auto-unboxed Double: " + autoUnboxedDouble);

        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Wrapped Character: " + wrappedChar);

        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Wrapped Boolean: " + wrappedBoolean);
        System.out.println("========================================");
    }
}

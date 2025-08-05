public class MinMaxInArray {
    public static void main(String[] args) {
        int[] arr = {25, 78, 12, 45, 89, 2};
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest: " + min);
        System.out.println("Biggest: " + max);
    }
}

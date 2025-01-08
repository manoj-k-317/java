public class min_max {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 8, 0, 7 };
        int max = arr[0];
        int min = arr[0];

        for (int n : arr) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}

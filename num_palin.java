public class num_palin {
    public static void main(String[] args) {
        int n = 1271;
        int r = 0;
        int o = n;

        while (n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }
        System.out.println("reverse of the number is: " + r);

        if (o==r) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}

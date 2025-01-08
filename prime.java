public class prime {
    public static void main(String[] args) {
        int n = 66;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("number is prime");
        } else {
            System.out.println("not a prime number");
        }
    }
}

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 10;

        for(int i = 2; i <= count; i++){
            int c = a+b;
            System.out.println(a+"");
            a=b;
            b=c;
        }
    }
}

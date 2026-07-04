public class Factorial {
    public static void main(String[] args) {
        int number = 12;
        System.out.println(factorial(number));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        for(int i = n - 1; i > 0; i--) {
            n = n * i;
        }
        return n;
    }
}

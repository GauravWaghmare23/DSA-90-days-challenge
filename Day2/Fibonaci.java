public class Fibonaci {
    public static void main(String[] args) {
        int nth = 12;
        System.out.println(fibonaci(nth));
    }

    public static int fibonaci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int first = 0;
        int second = 1;
        int answer = 0; 
        for (int i = 2; i <= n; i++) {
            answer = first + second;
            first = second;
            second = answer;
        }
        return answer;
    }
}

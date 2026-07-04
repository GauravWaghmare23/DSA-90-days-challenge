public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrome(int n) {
        int num = n;
        int reverseNumber = 0;

        while(num > 0) {
            int lastNumber = num % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            num = num / 10;
        }
        return n == reverseNumber;
    }
}

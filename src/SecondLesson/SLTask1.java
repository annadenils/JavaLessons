package SecondLesson;

public class SLTask1 {
    public static boolean isPalindrome(int x) {
        int palindrome = x;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (x == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome1(int y) {
        String normal = "" + y;
        String reverse = new StringBuilder(normal).reverse().toString();
        if (normal.equals(reverse)) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome1(1229));
        System.out.println(isPalindrome(1278));

    }
}

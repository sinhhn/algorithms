package basic;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.toCharArray()[i] != s.toCharArray()[s.length() - i - 1]) {
                return false;
            }
        }
        return true;
    }
}

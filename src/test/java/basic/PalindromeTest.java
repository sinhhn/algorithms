package basic;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    @Test
    void palindromeTest1() {
        String s = "";
        Assert.assertEquals(false, Palindrome.isPalindrome(s));
    }

    @Test
    void palindromeTest2() {
        String s = "abccba";
        Assert.assertEquals(true, Palindrome.isPalindrome(s));
    }

    @Test
    void palindromeTest3() {
        String s = "abccbad";
        Assert.assertEquals(false, Palindrome.isPalindrome(s));
    }



    @Test
    void palindromeTest4() {
        String s = "abcdefghijklmnopqrstuvwxyzzyxwvutsrqponmlkjihgfedcba";
        Assert.assertEquals(true, Palindrome.isPalindrome(s));
    }
}

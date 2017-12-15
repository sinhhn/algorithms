package basic.codefight;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class NonRepeatCharacterTest {
    @Test
    void firstNonRepeatCharacterTest1() {
        String s = "abacabad";
        Assert.assertEquals('c', NonRepeatCharacter.firstNotRepeatingCharacter(s));
    }

    @Test
    void firstNonRepeatCharacterTest2() {
        String s = "abacabaabacaba";
        Assert.assertEquals('_', NonRepeatCharacter.firstNotRepeatingCharacter(s));
    }

    @Test
    void firstNonRepeatCharacterTest3() {
        String s = "abacabaabacaabacabaabacabaabacabaabacabaabacabaabacabagabacabaababacabaabacaabacabaabacabaabacabaabacabaabacabaabacabagabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaZbaabacabaabacaabacabaabacabaabacabaabacabaabacabaabacabagabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaZbaabacabaabacaabacabaabacabaabacabaabacabaabacabaabacabiagabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaZbaacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaabacabaZba";
        Assert.assertEquals('i', NonRepeatCharacter.firstNotRepeatingCharacter(s));
    }

}

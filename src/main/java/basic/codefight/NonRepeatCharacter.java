package basic.codefight;

import java.util.*;

public class NonRepeatCharacter {
    public static char firstNotRepeatingCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            if(set.contains(s.charAt(i))) {
                continue;
            }
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    flag = false;
                    set.add(s.charAt(i));
                    break;
                }
            }
            if (flag) {
                return s.charAt(i);
            }
        }
        return '_';
    }
}

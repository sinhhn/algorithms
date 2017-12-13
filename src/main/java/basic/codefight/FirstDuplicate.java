package basic.codefight;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public static int firstDuplicate(int[]a ) {
        Set<Integer>set = new HashSet<>();
        for (int x : a) {
            if(set.contains(x)) {
                return x;
            }
            else {
                set.add(x);
            }
        }
        return -1;
    }
}

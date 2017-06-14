package lab4;

import lab4.utils.RegExp;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class UtilsTest {
    @Test
    public void testAddSameSymbols() {
        String reg = "[a-z]";

        RegExp regExp = new RegExp(reg);
        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }
        assertEquals("Wrong parse of regexp", set, regExp.getSymbols());
    }

    @Test
    public void testAddDifferentSymbols() {
        String reg = "[A-Z]";

        RegExp regExp = new RegExp(reg);
        Set<Character> set = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            set.add(c);
        }
        assertNotEquals("Wrong parse of regexp", set, regExp.getSymbols());
    }

    @Test
    public void testEvalFirst() {
        // TODO
        /*
        td: [#,*]
        t: [0,1,2,3,4,5,6,7,(,8,9]
        e: [0,1,2,3,4,5,6,7,(,8,9]
        f: [0,1,2,3,4,5,6,7,(,8,9]
        NUM: [0,1,2,3,4,5,6,7,8,9]
        ed: [#,+]
        */
    }
}

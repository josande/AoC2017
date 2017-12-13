package day13;

import org.junit.jupiter.api.Test;

import static day13.Day13.getDelay;
import static day13.Day13.getScore;
import static day13.Day13.setInput;
import static org.junit.jupiter.api.Assertions.*;

class Day13Test {
    @Test
    void test() {
        setInput("0: 3\n" +
                "1: 2\n" +
                "4: 4\n" +
                "6: 4");
        assertEquals(24, getScore());
        assertEquals(10, getDelay());

    }
    @Test
    void puzzle() {
        String input="0: 3\n" +
                "1: 2\n" +
                "2: 4\n" +
                "4: 4\n" +
                "6: 5\n" +
                "8: 8\n" +
                "10: 6\n" +
                "12: 6\n" +
                "14: 8\n" +
                "16: 6\n" +
                "18: 6\n" +
                "20: 8\n" +
                "22: 12\n" +
                "24: 8\n" +
                "26: 8\n" +
                "28: 12\n" +
                "30: 8\n" +
                "32: 12\n" +
                "34: 9\n" +
                "36: 14\n" +
                "38: 12\n" +
                "40: 12\n" +
                "42: 12\n" +
                "44: 14\n" +
                "46: 14\n" +
                "48: 10\n" +
                "50: 14\n" +
                "52: 12\n" +
                "54: 14\n" +
                "56: 12\n" +
                "58: 17\n" +
                "60: 10\n" +
                "64: 14\n" +
                "66: 14\n" +
                "68: 12\n" +
                "70: 12\n" +
                "72: 18\n" +
                "74: 14\n" +
                "78: 14\n" +
                "82: 14\n" +
                "84: 24\n" +
                "86: 14\n" +
                "94: 14";
        setInput(input);
        System.out.println("Day13(a): "+getScore());
        System.out.println("Day13(b): "+getDelay());

    }
}
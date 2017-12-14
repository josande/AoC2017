package day14;

import org.junit.jupiter.api.Test;

import static day14.Day14.setInput;
import static day14.Day14.toBinaryString;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day14Test {
    @Test
    void testBinaryConv() {
        assertEquals("0000",toBinaryString("0"));
        assertEquals("00010001",toBinaryString("11"));
        assertEquals("1111",toBinaryString("f"));
    }
    @Test
    void test1() {
        String input="flqrgnkx";
        setInput(input);
    }
    @Test
    void puzzle() {
        String input="ugkiagan";
        setInput(input);
        System.out.println("Day14(a): ");
        System.out.println("Day14(b): ");

    }
}
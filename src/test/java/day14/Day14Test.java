package day14;

import org.junit.jupiter.api.Test;

import static day14.Day14.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day14Test {
    @Test
    void testBinaryConv() {
        assertEquals("0000",toBinaryString("0"));
        assertEquals("00010001",toBinaryString("11"));
        assertEquals("1111",toBinaryString("f"));
    }

    @Test
    void test() {
        String input="flqrgnkx";
        setInput(input);
        assertEquals(8108, getSquares());
        assertEquals(1242, getRegions());
    }
    @Test
    void puzzle() {
        String input="ugkiagan";
        setInput(input);
        System.out.println("Day14(a): "+getSquares());
        System.out.println("Day14(b): "+getRegions());

    }
}
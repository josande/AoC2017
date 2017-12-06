package day6;

import org.junit.jupiter.api.Test;

import static day6.Day6.calculateA;
import static day6.Day6.calculateB;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day6Test {
    @Test
    void test1a() {
        String input="0 2 7 0";
        assertEquals(5, calculateA(input));
    }
    @Test
    void test1b() {
        String input="0 2 7 0";
        assertEquals(4, calculateB(input));
    }
    @Test
    void puzzle() {
        String input="2 8 8 5 4 2 3 1 5 5 1 2 15 13 5 14";
        System.out.println("Result Day6(a): "+calculateA(input));
        System.out.println("Result Day6(b): "+calculateB(input));
    }
}
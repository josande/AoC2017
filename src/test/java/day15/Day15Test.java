package day15;

import org.junit.jupiter.api.Test;

import static day15.Day15.getMatches;
import static day15.Day15.setInput;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day15Test {
    @Test
    void testA() {
        setInput(65L, 1,8921L, 1,40000000L);
        assertEquals(588, getMatches());
    }

    @Test
    void testB() {
        setInput(65L, 4,8921L, 8,5000000L);
        assertEquals(309, getMatches());
    }
    @Test
    void puzzleA() {
        setInput(591L, 1,393L, 1,40000000L);
        System.out.println("Day15(a) "+getMatches());
    }
    @Test
    void puzzleB() {
        setInput(591L, 4,393L, 8,5000000L);
        System.out.println("Day15(b) "+getMatches());
    }
}
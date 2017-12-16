package day15;

import org.junit.jupiter.api.Test;

import static day15.Day15.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day15Test {
    @Test
    void testA() {
        assertEquals(588, solveA(65, 8921, 40000000L));
    }
    @Test
    void testB() {
        assertEquals(309, solveB(65,4,8921,8,5000000L));
    }
    @Test
    void puzzleA() {
        System.out.println("Day15(a): "+solveA(591, 393, 40000000L));
    }
    @Test
    void puzzleB() {
        System.out.println("Day15(b): "+solveB(591, 4, 393, 8 ,5000000L));
    }
}
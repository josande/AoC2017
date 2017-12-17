package day17;

import org.junit.jupiter.api.Test;

import static day17.Day17.solveA;
import static day17.Day17.solveB;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day17Test {

    @Test
    void testA() {
        assertEquals(638, solveA(3, 2017));
    }
    @Test
    void testB() {
        assertEquals(9, solveB(3, 9));
    }

    @Test
    void puzzle() {
        System.out.println("Day17(a): "+ solveA(376,2017));
        System.out.println("Day10(b): "+ solveB(376,50000000));
    }
}
package day10;

import org.junit.jupiter.api.Test;

import static day10.Day10.*;
import static org.junit.jupiter.api.Assertions.*;

class Day10Test {
    @Test
    void testInput() {
        String input="3,4,1,5";
        setKnotHashInput(5,1,input);
        assertEquals(12, getMultiple());
    }
    @Test
    void testModifyInput() {
        String input="1,2,3";
        assertEquals("49,44,50,44,51,17,31,73,47,23", modifyInput(input));
        setKnotHashInput(256, 64, modifyInput(input));
        assertEquals("3efbe78a8d82f29979031a4aa0b16a9d",getDenseHash());
    }
    @Test
    void testHexConversions() {
        assertEquals("00", intToHex(0));
        assertEquals("ff", intToHex(255));
    }
    @Test
    void testXorCalculations() {
        assertEquals(6, xor(5,3));
    }

    @Test
    void testGetDenseHash1() {
        String input="";
        setKnotHashInput(256, 64, modifyInput(input));
        assertEquals("a2582a3a0e66e6e86e3812dcb672a272", getDenseHash());
    }
    @Test
    void testGetDenseHash3() {
        String input="AoC 2017";
        setKnotHashInput(256, 64, modifyInput(input));
        assertEquals("33efeb34ea91902bb2f59c9920caa6cd", getDenseHash());
    }

    @Test
    void puzzle() {
        String input="46,41,212,83,1,255,157,65,139,52,39,254,2,86,0,204";
        setKnotHashInput(256, 1, input);
        System.out.println("Day10(a): "+getMultiple());


        setKnotHashInput(256, 64, modifyInput(input));
        System.out.println("Day10(b): "+getDenseHash());
    }
}
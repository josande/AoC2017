package day3;

import org.junit.jupiter.api.Test;

import static day3.Day3.calculateA;
import static day3.Day3.calculateB;
import static org.junit.jupiter.api.Assertions.*;

class Day3Test {
    @Test
    void test1a() {
        int input=1;
        assertEquals(0, calculateA(input));
    }
    @Test
    void test1b() {
        int input=1;
        assertEquals(1, calculateB(input));
    }
    @Test
    void test2a() {
        int input=12;
        assertEquals(3, calculateA(input));
    }
    @Test
    void test2b() {
        int input=12;
        assertEquals(23, calculateB(input));
    }
    @Test
    void test3a() {
        int input=23;
        assertEquals(2, calculateA(input));
    }
    @Test
    void test3b() {
        int input=23;
        assertEquals(23, calculateB(input));
    }
    @Test
    void test4a() {
        int input=2;
        assertEquals(1, calculateA(input));
    }
    @Test
    void puzzle() {
        int id=325489;
        System.out.println("Result Day3(a): " + calculateA(id));
        System.out.println("Result Day3(b): " + calculateB(id));
    }

}
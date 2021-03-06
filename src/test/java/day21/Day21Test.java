package day21;

import org.junit.jupiter.api.Test;

import static day21.Day21.*;
import static org.junit.jupiter.api.Assertions.*;

class Day21Test {
    @Test
    void testA() {
        setInput("../.# => ##./#../...\n" +
                ".#./..#/### => #..#/..../..../#..#");
        iteratePicture(2);
        assertEquals(12, getPixels());
    }
    @Test
    void puzzle() {
        setInput("../.. => ###/##./##.\n" +
                "#./.. => .##/###/...\n" +
                "##/.. => ##./###/#..\n" +
                ".#/#. => .##/#.#/###\n" +
                "##/#. => .#./###/#..\n" +
                "##/## => .../#.#/...\n" +
                ".../.../... => .#../#.#./..##/.###\n" +
                "#../.../... => ...#/#..#/#.../#.#.\n" +
                ".#./.../... => .###/..##/.#.#/..#.\n" +
                "##./.../... => ##.#/#.##/..#./...#\n" +
                "#.#/.../... => .##./####/..../..#.\n" +
                "###/.../... => ...#/..../..../##.#\n" +
                ".#./#../... => ##../#..#/..##/#.##\n" +
                "##./#../... => ###./...#/#..#/#.#.\n" +
                "..#/#../... => .##./#.../.###/#.#.\n" +
                "#.#/#../... => ...#/#.##/####/##.#\n" +
                ".##/#../... => ####/..../..#./....\n" +
                "###/#../... => ..##/..##/.###/..#.\n" +
                ".../.#./... => ..../.#../.#.#/...#\n" +
                "#../.#./... => ..#./#.../####/#...\n" +
                ".#./.#./... => ...#/##../#.../.#..\n" +
                "##./.#./... => ####/..../#.../#..#\n" +
                "#.#/.#./... => #.##/#.#./##../.##.\n" +
                "###/.#./... => ###./...#/#.##/#.##\n" +
                ".#./##./... => ..##/#.##/###./#.#.\n" +
                "##./##./... => ..../..##/.###/#..#\n" +
                "..#/##./... => ####/...#/##../####\n" +
                "#.#/##./... => ##../.#.#/.#../.#.#\n" +
                ".##/##./... => ..#./.#../.#../###.\n" +
                "###/##./... => #.../.###/..##/.#..\n" +
                ".../#.#/... => ...#/##../.##./....\n" +
                "#../#.#/... => .#../..../..#./###.\n" +
                ".#./#.#/... => ##../#.#./#.../...#\n" +
                "##./#.#/... => .##./...#/#.##/#.##\n" +
                "#.#/#.#/... => #.../#.##/#..#/...#\n" +
                "###/#.#/... => ..##/#.##/...#/###.\n" +
                ".../###/... => #.../#.##/.#.#/...#\n" +
                "#../###/... => ..#./###./.#.#/#.#.\n" +
                ".#./###/... => ###./.#.#/.##./.#.#\n" +
                "##./###/... => .###/#.##/##../.##.\n" +
                "#.#/###/... => .#../..##/..../..#.\n" +
                "###/###/... => ...#/.#../.#.#/#...\n" +
                "..#/.../#.. => ...#/.#.#/..#./...#\n" +
                "#.#/.../#.. => ##.#/###./####/##.#\n" +
                ".##/.../#.. => .###/.##./..##/....\n" +
                "###/.../#.. => ..../.#.#/...#/#..#\n" +
                ".##/#../#.. => #.##/.#.#/##../##..\n" +
                "###/#../#.. => ..../..##/####/#.#.\n" +
                "..#/.#./#.. => #.#./##.#/##../##..\n" +
                "#.#/.#./#.. => #.##/.##./##.#/#.##\n" +
                ".##/.#./#.. => ##.#/#.../.#../####\n" +
                "###/.#./#.. => ###./..##/####/.##.\n" +
                ".##/##./#.. => #.##/..#./...#/.#..\n" +
                "###/##./#.. => ##.#/#.#./#.../..#.\n" +
                "#../..#/#.. => ####/...#/..../#.#.\n" +
                ".#./..#/#.. => ##../.###/.###/.#..\n" +
                "##./..#/#.. => #.#./###./...#/.##.\n" +
                "#.#/..#/#.. => #.#./.###/..##/..##\n" +
                ".##/..#/#.. => .#../#..#/##../#...\n" +
                "###/..#/#.. => ####/#.##/#.../...#\n" +
                "#../#.#/#.. => ##../.###/#.../....\n" +
                ".#./#.#/#.. => ..../#.#./##../..#.\n" +
                "##./#.#/#.. => #..#/...#/##../##..\n" +
                "..#/#.#/#.. => ####/#..#/..##/##.#\n" +
                "#.#/#.#/#.. => .#../..##/###./.#..\n" +
                ".##/#.#/#.. => #..#/#.../..../####\n" +
                "###/#.#/#.. => ..../.##./.#.#/...#\n" +
                "#../.##/#.. => #.#./#.##/#.../#...\n" +
                ".#./.##/#.. => #.##/###./.##./####\n" +
                "##./.##/#.. => ###./.###/##.#/#..#\n" +
                "#.#/.##/#.. => ##../####/####/#.#.\n" +
                ".##/.##/#.. => ####/#.#./###./.##.\n" +
                "###/.##/#.. => ##.#/#..#/.##./..#.\n" +
                "#../###/#.. => ...#/####/#.#./#.#.\n" +
                ".#./###/#.. => ..##/.##./.###/..#.\n" +
                "##./###/#.. => ..#./##.#/####/##..\n" +
                "..#/###/#.. => ###./.###/..../###.\n" +
                "#.#/###/#.. => ##.#/###./..../..#.\n" +
                ".##/###/#.. => .##./##.#/#.##/.##.\n" +
                "###/###/#.. => .#.#/####/#.##/##..\n" +
                ".#./#.#/.#. => ..##/..##/#.##/#.#.\n" +
                "##./#.#/.#. => #.##/#.##/..#./..##\n" +
                "#.#/#.#/.#. => .#.#/..../#.#./..#.\n" +
                "###/#.#/.#. => #.#./..##/###./#.##\n" +
                ".#./###/.#. => .#../.###/..##/##..\n" +
                "##./###/.#. => ##.#/..#./#.#./#...\n" +
                "#.#/###/.#. => ##../###./.#.#/...#\n" +
                "###/###/.#. => ###./##.#/..../###.\n" +
                "#.#/..#/##. => #.#./##.#/#.#./.##.\n" +
                "###/..#/##. => .#.#/#.../####/.##.\n" +
                ".##/#.#/##. => ##.#/#.#./#.#./.#..\n" +
                "###/#.#/##. => ...#/..##/###./#.##\n" +
                "#.#/.##/##. => #.##/##.#/#..#/..##\n" +
                "###/.##/##. => .###/.#.#/#.##/.#..\n" +
                ".##/###/##. => #..#/#..#/#.##/.#..\n" +
                "###/###/##. => ..##/.##./####/###.\n" +
                "#.#/.../#.# => ##../#.##/##../.##.\n" +
                "###/.../#.# => ###./#.#./##.#/####\n" +
                "###/#../#.# => ###./#.#./#..#/...#\n" +
                "#.#/.#./#.# => ###./###./.#.#/.#..\n" +
                "###/.#./#.# => ..#./...#/..#./##..\n" +
                "###/##./#.# => .###/#..#/#.##/.#.#\n" +
                "#.#/#.#/#.# => ####/#.../##../....\n" +
                "###/#.#/#.# => ##../...#/..##/..#.\n" +
                "#.#/###/#.# => .##./#.../#..#/#..#\n" +
                "###/###/#.# => .#.#/#.../..../#..#\n" +
                "###/#.#/### => #.#./.##./##../.###\n" +
                "###/###/### => ###./.#../####/..##");
        iteratePicture(5);
        System.out.println("Result Day21(a): "+getPixels());
        iteratePicture(13);
        System.out.println("Result Day21(b): "+getPixels());
    }
}
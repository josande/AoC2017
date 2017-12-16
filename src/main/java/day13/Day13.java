package day13;

import java.util.HashMap;
import java.util.Map;

class Day13 {
    private static Map<Integer, Integer> layers;

    static void setInput(String input) {
        layers = new HashMap<>();
        for (String row : input.split("\n")) {
            int pos = Integer.valueOf(row.split(": ")[0]);
            int len = Integer.valueOf(row.split(": ")[1]);
            layers.put(pos, len);
        }
    }
    static int getDelay() {
        int i=0;
        while (isCaught(i))
            i++;
        return i;
    }
    private static boolean isCaught(int delay) {
        for (int i : layers.keySet())
            if ((i + delay) % (2 * layers.get(i) - 2) == 0)
                return true;
        return false;
    }
    static int getScore() {
        int sum=0;
        for (int i : layers.keySet())
            if (i % (2*layers.get(i)-2) == 0)
                sum += i*layers.get(i);
        return sum;
    }
}

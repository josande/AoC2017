package day13;

import java.util.HashMap;
import java.util.Map;

class Day13 {
    private static Map<Integer, Integer> layers;

    static void setInput(String input) {
        layers = new HashMap<>();
        for (String row : input.split("\n")) {
            int position = Integer.valueOf(row.split(": ")[0]);
            int length   = Integer.valueOf(row.split(": ")[1]);
            layers.put(position, length);
        }
    }
    static int getDelay() {
        int i=0;
        while (isCaught(i))
            i++;
        return i;
    }
    private static boolean isCaught(int delay) {
        boolean caught = false;
        for (int i : layers.keySet()) {
            if ((i + delay) % (2 * layers.get(i) - 2) == 0) {
                caught = true;
            }
        }
        return caught;
    }
    static int getScore() {
        int sum=0;
        for (int i : layers.keySet()) {
            if (i % (2*layers.get(i)-2) == 0){
                sum += i*layers.get(i);
            }
        }
        return sum;
    }
}

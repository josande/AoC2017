package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day6 {
    private static List<Integer[]> knownStates;
    static void setInput(String input) {
        knownStates=getKnownValues(input);
    }
    static int calculateA() {
        return knownStates.size()-1;
    }

    static int calculateB() {
        Integer[] duplicate = knownStates.get(knownStates.size()-1);

        for (int i = 0; i<knownStates.size(); i++) {
            if (Arrays.equals(knownStates.get(i), duplicate)) {
                return knownStates.size() - 1 - i;
            }
        }
        return -1;
    }

    private static List<Integer[]> getKnownValues(String input) {
        List<Integer[]> knownStates = new ArrayList<>();
        String[] valuesAsString = input.split(" ");
        int size= valuesAsString.length;

        Integer[] values= new Integer[size];

        for (int i=0;i<size;i++) {
            values[i]=Integer.valueOf(valuesAsString[i]);
        }

        while (true) {
            knownStates.add(Arrays.copyOf(values, size));

            int highestValue = 0;
            int highestPos = 0;

            for (int position = 0; position < size; position++) {
                if (values[position] > highestValue) {
                    highestValue = values[position];
                    highestPos = position;
                }
            }
            int currentPos = highestPos + 1;
            if (currentPos == size) {
                currentPos = 0;
            }
            values[highestPos] = 0;
            for (int blocks = 0; blocks < highestValue; blocks++) {
                values[currentPos]++;
                currentPos++;

                if (currentPos == size) {
                    currentPos = 0;
                }
            }
            for (Integer[] state : knownStates) {
                if (Arrays.equals(state, values)) {
                    knownStates.add(values);
                    return knownStates;
                }
            }
        }
    }
}

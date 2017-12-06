package day6;

import java.util.ArrayList;
import java.util.List;

class Day6 {

    static int calculateA(String input) {
        List<Integer[]> knownStates=getKnownValues(input);
        return knownStates.size()-1;
    }

    static int calculateB(String input) {
        List<Integer[]> knownStates=getKnownValues(input);
        Integer[] duplicate = knownStates.get(knownStates.size()-1);

        for (int i = 0; i<knownStates.size(); i++) {
            boolean match=true;
            for (int v=0;v<duplicate.length; v++) {
                if (!knownStates.get(i)[v].equals(duplicate[v])) {
                    match=false;
                }
            }

            if (match) {
                return knownStates.size()-1 - i;
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


        for (int i=0;;i++) {
            knownStates.add(values);

            Integer[] newValues = new Integer[size];
            for (int j = 0; j < size; j++) {
                newValues[j] = values[j];
            }
            values = newValues;

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
                boolean match = true;
                for (int v = 0; v < size; v++) {
                    if (!values[v].equals(state[v])) {
                        match = false;
                    }
                }
                if (match) {
                    knownStates.add(values);
                    return knownStates;
                }
            }
        }
    }
}

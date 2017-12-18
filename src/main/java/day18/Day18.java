package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Day18 {
    private static List<Long> toProgramQueue0;
    private static List<Long> toProgramQueue1;
    private static Map<String, Long> values;
    private static Map<String, Long> otherValues;
    private static boolean firstRecovery;
    private static int position, otherPosition;
    private static long firstRecoveredValue;
    private static int currentId;

    private static int timesOneSent;
    static void setInput(String input) {
        //Set initial values
        firstRecovery = true;
        firstRecoveredValue = 0L;
        timesOneSent = 0;
        toProgramQueue0 = new ArrayList<>();
        toProgramQueue1 = new ArrayList<>();

        values = new HashMap<>();
        otherValues = new HashMap<>();

        position =0; otherPosition=0; currentId=0;
        //Starting parameters for 18b
        values.put("p",  0L);
        otherValues.put("p",  1L);

        String[] rows=input.split("\n");
        while(position >=0 && position < rows.length) {
            executeCommand(rows[position]);
        }
    }
    static long getFirstRecovery() {
        return firstRecoveredValue;
    }
    static int getNumberOfMessageSentFromProgram1() {
        return timesOneSent;
    }
    private static void executeCommand(String row) {
        String[] command = row.split(" ");
        switch(command[0]) {
            case "snd" : sendMessage(command); position++; break;
            case "set" : setRegistry(command); position++; break;
            case "add" : add(command); position++; break;
            case "mul" : multiply(command); position++; break;
            case "mod" : modulo(command); position++; break;
            case "rcv" : recover(command); break;
            case "jgz" : jump(command); break;
            default : System.out.println("Unhandled command "+row);break;
        }
    }

    static private void sendMessage(String[] row) {
        if (currentId==0) {
            toProgramQueue1.add(stringToInt(row[1]));
        } else {
            timesOneSent++;
            toProgramQueue0.add(stringToInt(row[1]));
        }
    }
    static private void setRegistry(String[] row) {
        setValue(row[1], stringToInt(row[2]));
    }
    static private void add(String[] row) {
        setValue(row[1], getValue(row[1]) + stringToInt(row[2]));
    }
    static private void multiply(String[] row) {
        setValue(row[1], getValue(row[1]) * stringToInt(row[2]));
    }
    static private void modulo(String[] row) {
        setValue(row[1], getValue(row[1])%stringToInt(row[2]));
    }
    static private void recover(String[] row) {
        Long value=null;

        if (currentId==0) {
            if (!toProgramQueue0.isEmpty()) {
                value = toProgramQueue0.get(0);
                toProgramQueue0.remove(0);
            }
        } else {
            if (!toProgramQueue1.isEmpty()) {
                value = toProgramQueue1.get(0);
                if (firstRecovery) {
                    firstRecovery = false;
                    firstRecoveredValue = toProgramQueue1.get(toProgramQueue1.size()-1);
                }
                toProgramQueue1.remove(0);
            }
        }

        if(value!=null) {
            setValue(row[1], value);
            position++;
        }
        else
            switchProgram();
    }
    static private void switchProgram() {
        if (toProgramQueue0.isEmpty() && toProgramQueue1.isEmpty())
            position=-2; //This ends the execution
        else {
            int tempPosition = position;
            position = otherPosition;
            otherPosition = tempPosition;

            HashMap<String, Long> tempMap = new HashMap<>(values);
            values = new HashMap<>(otherValues);
            otherValues = new HashMap<>(tempMap);

            currentId=currentId==0?1:0;
        }

    }
    static private void jump(String[] row) {
        if (stringToInt(row[1])>0) {
            position +=stringToInt(row[2]);
        } else {
            position++;
        }
    }

    private static void setValue(String name, Long value) {
        if (values.containsKey(name)) {
            values.replace(name, value);
        } else {
            values.put(name, value);
        }
    }
    private static Long getValue(String registry) {
        return values.getOrDefault(registry, 0L);
    }
    private static Long stringToInt(String string) {
        if (string.matches("^-?\\d+$")) {
            return Long.parseLong(string);
        }
        return getValue(string);
    }
}

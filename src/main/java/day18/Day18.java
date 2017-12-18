package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Day18 {
    static private List<Long> toProgram0;
    static private List<Long> toProgram1;
    static private Map<String, Long> values;
    static private Map<String, Long> otherValues;

    static private int position;
    static private int otherPosition;

    static private int currentId;

    static private int timesOneSent;
    static void setInput(String input) {
        timesOneSent=0;
        toProgram0 = new ArrayList<>();
        toProgram1 = new ArrayList<>();

        values = new HashMap<>();
        otherValues = new HashMap<>();
        position =0; otherPosition=0;
        currentId=0;
        String[] rows=input.split("\n");
        while(position >=0 && position < rows.length) {
            executeCommand(rows[position]);
        }
        values.put("p",  0L);
        otherValues.put("p",  1L);

    }
    static int getTimesOneSent() {
        return timesOneSent;
    }
    static void executeCommand(String row) {
        String command = row.split(" ")[0];
        switch(command) {
            case "snd" : sendMessage(row); position++; break;
            case "set" : setRegistry(row); position++; break;
            case "add" : add(row); position++; break;
            case "mul" : multiply(row); position++; break;
            case "mod" : modulo(row); position++; break;
            case "rcv" : recover(row); break;
            case "jgz" : jump(row); break;
            default : System.out.println("Unhandled command "+row);break;
        }
    }

    static private void sendMessage(String row) {
        String value = row.split(" ")[1];
        System.out.println(position +" - "+row.split(" ")[0]+" "+(value));
        if (currentId==0)
            toProgram1.add(stringToInt(value));
        else {
            timesOneSent++;
            toProgram0.add(stringToInt(value));
        }
    }
    static private void setRegistry(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(position +" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, stringToInt(value));
    }
    static private void add(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(position +" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, getValue(registry) + stringToInt(value));
    }
    static private void multiply(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(position +" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, getValue(registry) * stringToInt(value));
    }
    static private void modulo(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(position +" - "+row.split(" ")[0]+" "+registry+" "+stringToInt(value));

        setValue(registry, getValue(registry)%stringToInt(value));
    }
    static private void recover(String row) {
        String registry = row.split(" ")[1];
        Long value=null;

        if (currentId==0) {
            if (!toProgram0.isEmpty()) {
                value = toProgram0.get(0);
                toProgram0.remove(0);
            }
        } else {
            if (!toProgram1.isEmpty()) {
                value = toProgram1.get(0);
                toProgram1.remove(0);
            }
        }
        if(value!=null) {
            setValue(registry, value);
            position++;
        }
        else
            switchProgram();
    }
    static private void switchProgram() {
        if (toProgram0.isEmpty() && toProgram1.isEmpty())
            position=-2;
        else {
            int tempPosition = position;
            position = otherPosition;
            otherPosition = tempPosition;

            HashMap<String, Long> tempMap = new HashMap<String, Long>(values);
            values = new HashMap<String, Long>(otherValues);
            otherValues = new HashMap<String, Long>(tempMap);

            if (currentId == 0)
                currentId = 1;
            else
                currentId = 0;
        }

    }
    static private void jump(String row) {
        String val1=row.split(" ")[1];
        String val2=row.split(" ")[2];
        System.out.println(position +" - "+row.split(" ")[0]+" "+(val1)+" "+stringToInt(val2));

        if (stringToInt(val1)>0) {
            position +=stringToInt(val2);
        } else {
            position = position +1;
        }
    }


    static void setValue(String name, Long value) {
        if (values.containsKey(name)) {
            values.replace(name, value);
        } else {
            values.put(name, value);
        }
    }
    static Long getValue(String registry) {
        if (values.containsKey(registry))
            return values.get(registry);
        else
            return 0L;
    }
    static private Long stringToInt(String string) {
        Long value;
        try {
            value = Long.parseLong(string);
        } catch (Exception ex) {
            value=getValue(string);
        }
        return value;
    }
}

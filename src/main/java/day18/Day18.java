package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Day18 {
    static List<Long> played;
    static Map<String, Long> values;
    static int positition;
    static void setInput(String input) {
        played = new ArrayList<>();
        values = new HashMap<>();
        positition=0;

        String[] rows=input.split("\n");
        while(positition>=0 && positition < rows.length) {
            executeCommand(rows[positition]);
        }

    }
    static void executeCommand(String row) {
        String command = row.split(" ")[0];
//        System.out.println(positition+" | "+command+" | "+row);
        switch(command) {
            case "snd" : playSound(row); positition++; break;
            case "set" : setRegistry(row); positition++; break;
            case "add" : add(row); positition++; break;
            case "mul" : multiply(row); positition++; break;
            case "mod" : modulo(row); positition++; break;
            case "rcv" : recover(row); positition++; break;
            case "jgz" : jump(row); break;
            default : System.out.println("Unhandled command "+row);break;
        }
    }

    static private void playSound(String row) {
        String value = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+(value));
        played.add(stringToInt(value));
    }
    static private void setRegistry(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, stringToInt(value));
    }
    static private void add(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, getValue(registry) + stringToInt(value));
    }
    static private void multiply(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+(registry)+" "+stringToInt(value));

        setValue(registry, getValue(registry) * stringToInt(value));
    }
    static private void modulo(String row) {
        String value = row.split(" ")[2];
        String registry = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+registry+" "+stringToInt(value));

        setValue(registry, getValue(registry)%stringToInt(value));
    }
    static private void recover(String row) {
        String value = row.split(" ")[1];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+stringToInt(value));

        if (stringToInt(value)!=0) {
            Long lastPlayed = played.get(played.size()-1);
            positition = -2;
            System.out.println("Recovered : " + lastPlayed);
        }
    }
    static private void jump(String row) {
        String val1=row.split(" ")[1];
        String val2=row.split(" ")[2];
        System.out.println(positition+" - "+row.split(" ")[0]+" "+(val1)+" "+stringToInt(val2));

        if (stringToInt(val1)>0) {
            positition+=stringToInt(val2);
        } else {
            positition=positition+1;
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

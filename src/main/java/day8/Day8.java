package day8;


import java.util.ArrayList;
import java.util.List;

class Day8 {

    private static class Position {
        final private String name;
        private int value=0;

        Position(String name) {
            this.name=name;
            if (value>biggestValEver) { biggestValEver=value; }
        }
        String getName() {
            return name;
        }
        int getValue() {
            return value;
        }
        void setValue(int value) {
            this.value=value;
            if (value>biggestValEver) { biggestValEver=value; biggestValEverName=name; }
        }
    }

    private static List<Position> positions;
    private static int biggestValEver; private static String biggestValEverName;

    static void parseInstructions(String instructions) {
        positions = new ArrayList<>();
        biggestValEver=0; biggestValEverName=null;

        for (String instruction : instructions.split("\n")) {
            String[] parts = instruction.split(" ");
            String name       = parts[0];
            String change     = parts[1];
            String changeVal  = parts[2];

            int changeValue;
            try {
                changeValue = Integer.parseInt(changeVal);
            } catch (NumberFormatException nfex) {
                changeValue = getPosition(changeVal).getValue();
            }



            String compareVal1 = parts[4];
            int compareValue1;
            try {
                compareValue1 = Integer.parseInt(compareVal1);
            } catch (NumberFormatException nfex) {
                compareValue1 = getPosition(compareVal1).getValue();
            }

            String comparator = parts[5];

            String compareVal2= parts[6];
            int compareValue2;
            try {
                compareValue2=Integer.parseInt(compareVal2);
            } catch (NumberFormatException nfex) {
                compareValue2 = getPosition(compareVal2).getValue();
            }


            boolean doSomething = false;
            switch(comparator) {
                case ">"  : {doSomething = compareValue1 >  compareValue2; break;}
                case ">=" : {doSomething = compareValue1 >= compareValue2; break;}
                case "<"  : {doSomething = compareValue1 <  compareValue2; break;}
                case "<=" : {doSomething = compareValue1 <= compareValue2; break;}
                case "==" : {doSomething = compareValue1 == compareValue2; break;}
                case "!=" : {doSomething = compareValue1 != compareValue2; break;}
                default : {System.out.println("Missed instruction for "+comparator); break;}
            }
            if (doSomething) {
                Position changePos=getPosition(name);
                int currValue=changePos.getValue();
                switch(change) {
                    case "inc" : { changePos.setValue(currValue + changeValue); break; }
                    case "dec" : { changePos.setValue(currValue - changeValue); break; }
                    case "cpy" : { changePos.setValue(currValue * changeValue); break; }
                    default : { System.out.println("Dont know what to do with "+change); break; }
                }
            }
        }
    }
    private static Position getPosition(String name) {
        for (Position pos : positions) {
            if (pos.getName().equals(name))
                return pos;
        }
        Position newPos = new Position(name);
        positions.add(newPos);
        return newPos;
    }
    private static Position getPositionWithHighestValue() {
        int biggestValue=0; Position position=null;
        for (Position p : positions) {
            if (p.getValue()>biggestValue) {
                biggestValue = p.getValue();
                position=p;
            }
        }
        return position;
    }
    static int getHighestPositionValue() {
        return getPositionWithHighestValue().getValue();
    }
    static String getHighestPositionName() {
        return getPositionWithHighestValue().getName();
    }
    static int getHighestEverPositionValue() {
        return biggestValEver;
    }
    static String getHighestEverPositionName() {
        return biggestValEverName;
    }
}

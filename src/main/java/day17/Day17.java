package day17;

import java.util.ArrayList;
import java.util.List;

class Day17 {
    static int solveA(int steps, @SuppressWarnings("SameParameterValue") int length) {
        List<Integer> values=new ArrayList<>();
        values.add(0, 0);
        int currentPosition=1;
        for (int i =1; i<=length;i++) {
            currentPosition=getNextPosition(currentPosition, i, steps);
            values.add(currentPosition, i);
        }
        return values.get(currentPosition==length?0:currentPosition+1);
    }

    static int solveB(int steps, int length) {
        int currentPosition=1;
        int value=0;
        for (int i = 1; i<=length;i++) {
            currentPosition=getNextPosition(currentPosition,i,steps);
            if (currentPosition==1) { value=i;}
        }
        return value;
    }
    static private int getNextPosition(int currentPosition, int value, int steps) {
        currentPosition+=steps;
        while (currentPosition>=value)currentPosition-=value;
        return currentPosition+1;
    }
}

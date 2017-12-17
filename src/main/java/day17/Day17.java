package day17;

import java.util.ArrayList;
import java.util.List;

class Day17 {
    static int solveA(int input, @SuppressWarnings("SameParameterValue") int length) {
        List<Integer> values=new ArrayList<>();
        values.add(0, 0);
        int currentPosition=1;
        for (int i =1; i<=length;i++) {
            currentPosition=(currentPosition+input)%i+1;
            values.add(currentPosition, i);
        }
        return values.get(currentPosition+1==length?0:currentPosition+1);
    }

    static int solveB(int input, int length) {
        int currentPosition=1;
        int value=0;
        for (int i = 1; i<=length;i++) {
            currentPosition=(currentPosition+input)%i+1;
            if (currentPosition==1) { value=i; }
        }
        return value;
    }
}

package day2;

import java.util.ArrayList;

class Day2 {

    static int calculateA(String input){
        int sum=0;
        for (String row : input.split("\n")) {
            int min=10000,max=0;
            for (String value : row.split("\t")) {
                int intVal=Integer.valueOf(value);
                min = Integer.min(min, intVal);
                max = Integer.max(max, intVal);
            }
            sum+=max-min;
        }
        return sum;
    }
    static int calculateB(String input){
        int sum=0;
        for (String row : input.split("\n")) {
            ArrayList<Integer> rowValues=new ArrayList<>();
            for (String value : row.split("\t")) {
                int intVal=Integer.valueOf(value);
                for (int i : rowValues) {
                    if (i%intVal==0) {
                        sum += i / intVal;
                    }
                    if (intVal%i==0) {
                        sum+= intVal / i;
                    }
                }
                rowValues.add(intVal);
            }
        }
        return sum;
    }
}

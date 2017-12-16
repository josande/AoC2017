package day16;

import java.util.Arrays;

class Day16 {
    static private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static private char[] order, originalOrder;
    static private String[] rows;
    static private int cycleLength, orderLength;
    static void setInput(int numberOfPrograms, String input) {
        orderLength=numberOfPrograms;
        rows = input.split(",");
        order = new char[numberOfPrograms]; cycleLength=1;

        originalOrder=Arrays.copyOf(alphabet, orderLength);
        order=Arrays.copyOf(originalOrder, orderLength);

        dance();
        while(!Arrays.equals(order,originalOrder)) {
            dance();
            cycleLength++;
        }
    }
    static String dance(int iterations) {
        order=Arrays.copyOf(originalOrder, orderLength);
        for (int i=0; i<iterations%cycleLength; i++) {
            dance();
        }
        return String.valueOf(order);
    }

    private static void dance() {
        for (String row : rows) {
            switch (row.charAt(0)) {
                case 's': spin(row); break;
                case 'x': exchange(row); break;
                case 'p': partner(row);break;
            }
        }
    }

    private static void spin(String row) {
        int length=Integer.valueOf(row.substring(1));

        char[] temp = Arrays.copyOf(order, orderLength);
        System.arraycopy(temp, 0, order, length, orderLength-length);
        System.arraycopy(temp, orderLength-length, order,0, length);
    }
    private static void exchange(String row) {
        row=row.substring(1);
        int pos1=Integer.valueOf(row.split("/")[0]);
        int pos2=Integer.valueOf(row.split("/")[1]);

        char p1=order[pos1];
        order[pos1]=order[pos2];
        order[pos2]=p1;
    }
    private static void partner(String row) {
        char c1 = row.charAt(1);
        char c2 = row.charAt(3);

        for (int i=0; i<orderLength;i++) {
            if (order[i] == c1)
                order[i] = c2;
            else if (order[i] == c2) {
                order[i] = c1;
            }
        }
    }
}

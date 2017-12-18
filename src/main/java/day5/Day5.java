package day5;

class Day5 {
    private static int[] values;
    private static int position, size;
    static void setInput(String input) {
        String[] valuesAsString = input.split(" ");
        size= valuesAsString.length; position=0;

        values= new int[size];
        for (int i=0;i<size;i++) {
            values[i]=Integer.valueOf(valuesAsString[i]);
        }
    }
    static int calculateA() {
        int steps=0;
        while (position < size) {
            int cv = values[position];
            values[position] = cv+1;
            position += cv;
            steps++;
        }
        return steps;
    }
    static int calculateB() {
        int steps=0;
        while (position < size) {
            int cv = values[position];
            values[position] = cv+(cv<3?1:-1);
            position += cv;
            steps++;
        }
        return steps;
    }
}

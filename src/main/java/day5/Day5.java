package day5;

class Day5 {
    static int calculateA(String input) {
        String[] valuesAsString = input.split(" ");
        int size= valuesAsString.length, position=0, steps=0;

        int[] values= new int[size];
        for (int i=0;i<size;i++) {
            values[i]=Integer.valueOf(valuesAsString[i]);
        }

        while (position < size) {
            int cv = values[position];
            values[position] = cv+1;
            position += cv;
            steps++;
        }
        return steps;
    }
    static int calculateB(String input) {
        String[] valuesAsString = input.split(" ");
        int size = valuesAsString.length, position = 0, steps = 0;

        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = Integer.valueOf(valuesAsString[i]);
        }

        while (position < size) {
            int cv = values[position];
            values[position] = cv+(cv<3?1:-1);
            position += cv;
            steps++;
        }
        return steps;
    }
}

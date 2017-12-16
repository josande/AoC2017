package day16;

class Day16 {
    static private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    static private String order, originalOrder;
    static private String[] rows;
    static private int cycleLength;
    static void setInput(int numberOfPrograms, String input) {
        rows = input.split(",");
        order = ""; cycleLength=1;
        for (int i = 0; i < numberOfPrograms; i++) {
            order += alphabet[i];
        }
        originalOrder=order;
        dance();
        while(!order.equals(originalOrder)) {
            dance();
            cycleLength++;
        }
    }
    static String dance(int iterations) {
        order=originalOrder;
        for (int i=0; i<iterations%cycleLength; i++) {
            dance();
        }
        return order;
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
        order = order.substring(order.length()-length, order.length()) + order.substring(0, order.length()-length);
    }
    private static void exchange(String row) {
        row=row.substring(1);
        int pos1=Integer.valueOf(row.split("/")[0]);
        int pos2=Integer.valueOf(row.split("/")[1]);

        char p1=order.charAt(pos1);
        char p2=order.charAt(pos2);

        order=order.substring(0,pos1)+p2+order.substring(pos1+1);
        order=order.substring(0,pos2)+p1+order.substring(pos2+1);
    }
    private static void partner(String row) {
        String p1=""+row.charAt(1);
        String p2=""+row.charAt(3);

        order=order.replaceFirst(p1, "'");
        order=order.replaceFirst(p2, p1);
        order=order.replaceFirst("'", p2);
    }
}

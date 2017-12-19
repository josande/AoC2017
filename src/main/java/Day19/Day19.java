package Day19;

class Day19 {
    private static char[][] map;
    private static String letters;
    private  static int width, height, x, y, dx, dy, steps;
    static void setInput(String input) {
        letters=""; steps=0;

        String[] rows = input.split("\n");

        width=rows[0].length();
        height=rows.length;

        map = new char[height][width];

        //Create map
        for (int y=0; y<height; y++) {
            map[y]=rows[y].toCharArray();
        }
        //Find start pos
        y=0;
        for (x=0; x<width; x++) {
            if (map[y][x]==('|')) {
                break;
            }
        }
        dx=0; dy=1;
        //Run the maze
        while (getNextChar());

    }
    static String getLetters() {
        return letters.trim();
    }
    static int getSteps() {
        return steps;
    }
    static private boolean getNextChar() {
         x=x+dx;
         y=y+dy;
          steps++;
         if (x<0 || x==width || y<0 || y==height) {
             return false;
         }
         char c = map[y][x];
         switch (c) {
             case '|' : {break;}
             case '+' : {
                 if (dy!=0) {
                    if (x<width-1 && map[y][x+1]!=' ') {
                        dy=0; dx=1;
                    }
                    if (x>0 && map[y][x-1]!=' ') {
                         dy=0; dx=-1;
                    }
                 } else {
                     if (y<height-1 && map[y+1][x]!=' ') {
                         dy=1; dx=0;
                     }
                     if (y>0 && map[y-1][x]!=' ') {
                         dy=-1; dx=0;
                     }
                 }
                 break;}
             case '-' : {break;}
             case ' ' : {return false;}
             default  : {letters+=c;}
         }

         return true;

     }
}

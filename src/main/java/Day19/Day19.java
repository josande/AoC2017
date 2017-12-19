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

        map = new char[width][height];

        //Create map
        for (int y=0; y<height; y++) {
             for (int x=0; x < width; x++) {
                 char c=rows[y].charAt(x);
                 map[x][y]=c;
             }
        }
        //Find start pos
        y=0;
        for (x=0; x<width; x++) {
            if (map[x][y]==('|')) {
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
         char c = map[x][y];
         switch (c) {
             case '|' : {break;}
             case '+' : {
                 if (dy!=0) {
                    if (x<width-1 && map[x+1][y]!=' ') {
                        dy=0; dx=1;
                    }
                    if (x>0 && map[x-1][y]!=' ') {
                         dy=0; dx=-1;
                    }
                 } else {
                     if (y<height-1 && map[x][y+1]!=' ') {
                         dy=1; dx=0;
                     }
                     if (y>0 && map[x][y-1]!=' ') {
                         dy=-1; dx=0;
                     }
                 }
                 break;}
             case '-' : {break;}
             default  : {if (c==' ')
                 return false; letters+=c; break;}

         }

         return true;

     }
}

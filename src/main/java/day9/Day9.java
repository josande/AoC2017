package day9;

class Day9 {
    private static String data="";
    private static int garbageSize=0;

    static void setInput(String input) {
        data="";
        garbageSize=0;
        data= removeExclamation(input);

        StringBuilder tempData= new StringBuilder();
        boolean isJunk=false;

        for (int i=0; i < data.length(); i++) {
            if (isJunk && data.charAt(i) != '>') {
                garbageSize++;
            }
            if (data.charAt(i) == '<') {
                isJunk=true;
            }
            if (!isJunk)
                tempData.append(data.charAt(i));
            if (data.charAt(i) == '>') {
                isJunk=false;
            }
        }
        data= tempData.toString();
    }
    private static String removeExclamation(String string) {
        StringBuilder filteredString= new StringBuilder();
        for (int i=0; i < string.length(); i++) {
            if (string.charAt(i) == '!') {
                i++;
            } else {
                filteredString.append(string.charAt(i));
            }
        }
        return filteredString.toString();
    }
    static int getNumberOfGroups() {
        int groups=0;
        for (int i=0; i<data.length();i++) {
            if (data.charAt(i) == '{')
                groups++;
        }
        return groups;
    }
    static int getScore() {
        int score=0, depth=0;
        for (int i=0; i<data.length();i++) {
            if (data.charAt(i) == '{') {
                depth++;
                score += depth;
            }
            if (data.charAt(i) == '}') {
                depth--;
            }
        }
        return score;
    }
    static int getGarbageSize() {
        return garbageSize;
    }
}

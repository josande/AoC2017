package day11;

class Day11 {

    private static int n,nw,ne,stepsFromHome,maxStepsFromHome;
    static void setInput(String input) {
        n=0;nw=0;ne=0;
        String[] steps=input.split(",");
        stepsFromHome=0; maxStepsFromHome=0;
        for (String step : steps) {
            switch(step) {
                case "n" : {n++; break;}
                case "s" : {n--; break;}
                case "nw" : {nw++; break;}
                case "ne" : {ne++; break;}
                case "sw" : {ne--; break;}
                case "se" : {nw--; break;}
            }
            simplify();
            stepsFromHome = Math.abs(n)+Math.abs(nw)+Math.abs(ne);
            maxStepsFromHome = Math.max(maxStepsFromHome, stepsFromHome);
        }
    }
    static int getMaxStepsFromHome() {
        return maxStepsFromHome;
    }
    static int getStepsFromHome() { return stepsFromHome; }

    private static void simplify() {
        while (nw > 0 && ne > 0) {
            n++;
            nw--; ne--;
        }
        while (nw < 0 && ne < 0) {
            n--;
            nw++; ne++;
        }
        while ((nw > 0 || ne > 0 ) && n < 0) {
            n++;
            nw--; ne--;
        }
        while ((nw < 0 || ne < 0) && n > 0) {
            n--;
            nw++; ne++;
        }
    }
}

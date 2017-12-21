package day15;

class Day15 {
    final private static Long multiplierA = 16807L, multiplierB = 48271L, divider = 2147483647L;

    @SuppressWarnings("SameParameterValue")
    static int solveA(int startA, int startB, Long iterations) {
        int matches=0;
        Long restA= (long) startA, restB= (long) startB;
        for (int i=0; i<iterations; i++) {
            restA = restA * multiplierA % divider;
            restB = restB * multiplierB % divider;
            if ((restA & 0xffff) == (restB & 0xffff))
                matches++;
        }
        return matches;
    }

    @SuppressWarnings("SameParameterValue")
    static int solveB(int startA, int dividerA, int startB, int dividerB, long iterations) {
        int matches=0;
        Long restA= (long) startA, restB= (long) startB;
        Long temp;
        for (int i=0; i<iterations; i++) {
            temp=-1L;
            while ((temp & (dividerA-1)) != 0 ) {
                restA = restA * multiplierA % divider;
                temp=restA;
            }
            temp=-1L;
            while ((temp & (dividerB-1)) != 0 ) {
                restB=restB*multiplierB % divider;
                temp=restB;
            }
            if ((restA & 0xffff) == (restB & 0xffff))
                matches++;
        }
        return matches;
    }
}

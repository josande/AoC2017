package day15;

class Day15 {
    final private static Long multiplierA = 16807L, multiplierB = 48271L, divider = 2147483647L;

    private static Long restA, restB;
    private static int matches;

    static void setInput(Long startA, int dividerA, Long startB, int dividerB, Long iterations) {
        restA=startA; restB=startB; matches=0;
        Long tempA, tempB;
        for (int i=0; i<iterations; i++) {
            tempA=-1L;
            while (tempA<0 || tempA%dividerA!=0) {
                restA = restA * multiplierA % divider;
                tempA=restA;
            }
            tempB=-1L;

            while (tempB<0 || tempB%dividerB!=0) {
                restB=restB*multiplierB % divider;
                tempB=restB;
            }
            if ((restA & 0xffff) == (restB & 0xffff))
                matches++;
        }
    }

    static int getMatches() {
        return matches;
    }
}

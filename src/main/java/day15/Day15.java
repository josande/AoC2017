package day15;

class Day15 {
    final private static Long multiplierA = 16807L, multiplierB = 48271L, divider = 2147483647L;

    private static Long restA, restB;
    private static int matches;

    static void setInput(Long startA, int dividerA, Long startB, int dividerB, int iterations) {
        restA=startA; restB=startB; matches=0;

        for (int i=0; i<iterations; i++) {
            Long tempA=-1L;
            while (tempA<0 || tempA%dividerA!=0) {
                restA = restA * multiplierA % divider;
                tempA=restA;
            }
            String a ="0000000000000000" + Long.toBinaryString(restA);
            a=a.substring(a.length()-16, a.length());

            Long tempB=-1L;
            while (tempB<0 || tempB%dividerB!=0) {
                restB=restB*multiplierB % divider;
                tempB=restB;
            }

            String b  ="0000000000000000" + Long.toBinaryString(restB);
            b=b.substring(b.length()-16, b.length());

            if (a.equals(b))
                matches++;
        }
    }

    static int getMatches() {
        return matches;
    }
}

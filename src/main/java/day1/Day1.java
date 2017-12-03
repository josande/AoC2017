package day1;

class Day1 {
    static int calculateA(String input) {
        int sum=0;
        input+=input.charAt(0);
        for(int i=0;i<input.length()-1;i++){
            if(input.charAt(i)==input.charAt(i+1)) {
                sum+=input.charAt(i)-'0';
            }
        }
        return sum;
    }
    static int calculateB(String input) {
        int sum=0, halfListLength=input.length()/2;
        for (int i=0; i<halfListLength;i++) {
            if (input.charAt(i) == input.charAt(i + halfListLength)) {
                sum += input.charAt(i) - '0';
            }
        }
        return 2*sum;
    }
}

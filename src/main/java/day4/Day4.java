package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Day4 {
    static boolean calculateA(String input) {
        List<String> words = new ArrayList<>();
        for (String word : input.split(" ")) {
            if (words.contains(word)) {
                return false;
            } else {
                words.add(word);
            }
        }
        return true;
    }
    static boolean calculateB(String input) {
        List<String> words = new ArrayList<>();
        for (String word : input.split(" ")) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);

            if (words.contains(sorted)) {
                return false;
            } else {
                words.add(sorted);
            }
        }
        return true;
    }
}

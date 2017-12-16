package day10;

import java.util.ArrayList;
import java.util.List;

public class Day10 {
    private static int currentPosition, skipSize;
    private static int[] list, lengths;
    public static void setKnotHashInput(int length, int rotations, String input) {
        list = new int[length];
        if (input.length()>0)
            lengths=new int[input.split(",").length];
        else
            lengths=new int[0];
        currentPosition=0;
        skipSize=0;
        for (int i=0; i< length; i++) {
            list[i]=i;
        }
        for (int i=0; i<lengths.length;i++) {
            lengths[i]=Integer.valueOf(input.split(",")[i]);
        }
        rotate(rotations);
    }
    private static void rotate(int iterations) {
        for (int j=0; j<iterations; j++) {
            for (int length : lengths) {
                rotatePart(length);
            }
        }
    }
    public static String modifyInput(String input) {
        StringBuilder newInput= new StringBuilder();
        for (char c : input.toCharArray()) {
            newInput.append((int) c).append(",");
        }
        newInput.append("17,31,73,47,23");
        return newInput.toString();
    }
    private static void rotatePart(int lengthToRotate) {
        int[] rotatedPart=new int[lengthToRotate];
        for (int i=0; i<lengthToRotate;i++){
            rotatedPart[i]=list[(currentPosition+i)%list.length];
        }
        for (int i=lengthToRotate-1; i>=0;i--){
            list[(currentPosition+lengthToRotate-i-1)%list.length]=rotatedPart[i];
        }

        currentPosition=(currentPosition+lengthToRotate+skipSize)%list.length;
        skipSize++;
    }
    static int xor(int a, int b) {
        return a^b;
    }

    private static List<Integer> getXorValues() {
        List<Integer> combinedValues= new ArrayList<>();
        int currVal=0;
        for (int i=0; i<list.length; i++) {
            currVal=xor(currVal, list[i]);
            if (i%16==15) {
                combinedValues.add(currVal);
                currVal=0;
            }
        }
        return combinedValues;

    }
    static int getMultiple() {
        return list[0]*list[1];
    }

    public static String getDenseHash() {
        StringBuilder hash= new StringBuilder();
        for (int i : getXorValues()) {
            hash.append(intToHex(i));
        }
        return hash.toString();
    }
    static String intToHex(int integer) {
        String hexString= Integer.toHexString(integer);
        if (hexString.length()==1) hexString="0"+hexString;

        return hexString;
    }
}

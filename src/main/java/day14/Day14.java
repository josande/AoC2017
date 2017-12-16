package day14;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static day10.Day10.*;

class Day14 {

    final private static Boolean[][] data = new Boolean[128][128];
    static void setInput(String input) {
        String knotHash;
        for (int y=0; y<128; y++) {
            knotHash = getKnotHash(input+"-"+y);
            data[y] = toBinaryArray(knotHash);
        }

    }
    static int getSquares() {
        return findSquaresUsed();
    }
    static int getRegions() {
        return findNumberOfRegions();
    }
    private static int findSquaresUsed() {
        int squares=0;
        for (int y=0; y<128; y++) {
            for (int x=0; x<128; x++) {
                if (data[x][y]) {
                    squares++;
                }
            }
        }
        return squares;
    }

    private static int findNumberOfRegions() {
        List<Point> involvedCells=new ArrayList<>();
        int numberOfRegions=0;
        Point point = findNextRegion();
        while (point != null) {

            involvedCells.clear();
            involvedCells.add(point);

            while (involvedCells.size()>0) {
                List<Point> newCells=new ArrayList<>();

                for (Point p : involvedCells) {
                    newCells.addAll(getNeighbours(p));
                }
                involvedCells.clear();
                involvedCells.addAll(newCells);
                newCells.clear();
            }
            point = findNextRegion();
            numberOfRegions++;
        }
        return numberOfRegions;
    }
    static private List<Point> getNeighbours(Point p) {
        int x = (int) p.getX();
        int y = (int) p.getY();
        data[x][y]=false;
        List<Point> neighbors=new ArrayList<>();
        if (x>0 && data[x-1][y]) {data[x-1][y]=false; neighbors.add(new Point(x-1,y));}
        if (y>0 && data[x][y-1]) {data[x][y-1]=false; neighbors.add(new Point(x,y-1));}
        if (x<127 && data[x+1][y]) {data[x+1][y]=false; neighbors.add(new Point(x+1,y));}
        if (y<127 && data[x][y+1]) {data[x][y+1]=false; neighbors.add(new Point(x,y+1));}
        return neighbors;
    }
    private static Point findNextRegion() {
        for (int y=0;y<128;y++) {
            for (int x=0;x<128;x++) {
                if (data[x][y])
                    return new Point(x,y);
            }
        }
        return null;
    }

    public static String toBinaryString(String hex) {

        StringBuilder bin = new StringBuilder();
        StringBuilder binFragment;
        int iHex;

        for(int i = 0; i < hex.length(); i++){
            iHex = Integer.parseInt(""+hex.charAt(i),16);
            binFragment = new StringBuilder(Integer.toBinaryString(iHex));

            while(binFragment.length() < 4){
                binFragment.insert(0, "0");
            }
            bin.append(binFragment);
        }
        return bin.toString();
    }
    private static Boolean[] toBinaryArray(String hex) {
        Boolean[] bools = new Boolean[128];
        String binaryString=toBinaryString(hex);
        for (int i =0; i<128; i++) {
            bools[i]=binaryString.charAt(i) == '1';
        }
        return bools;
    }

    static private String getKnotHash(String string) {
        setKnotHashInput(256, 64, modifyInput(string));
        return getDenseHash();
    }
 }

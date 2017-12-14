package day14;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static day10.Day10.*;

public class Day14 {

    static String[] knotHashes=new String[128];
    static String[] binaryRep =new String[128];

    static int squaresUsed,regions;
    static Map<Dimension, Boolean> locations = new HashMap<Dimension, Boolean>();

    static void setInput(String input) {
        squaresUsed=0; regions=0;
        for (int i=0; i<=127; i++) {
            knotHashes[i]=getKnotHash(input+"-"+i);
            binaryRep[i]=toBinaryString(knotHashes[i]);


            for (int j=0; j<binaryRep[i].length();j++) {
                boolean filled=binaryRep[i].charAt(j) == '1';
                if (filled) {
                    squaresUsed++;
                }
                locations.put(new Dimension(i,j), filled);
            }



        }

        System.out.println("Squares: "+squaresUsed);
        System.out.println("Regions: "+findNumberOfRegions());


    }

    private static int findNumberOfRegions() {
        List<Dimension> involvedCells=new ArrayList<>();
        int maxX=128;
        int maxY=128;
        int numberOfRegions=0;

        while (findFirstRegion() != null) {
            Dimension d0=findFirstRegion();

            locations.put(d0, false);

            involvedCells.clear();
            involvedCells.add(d0);

            Boolean cont=true;

            while (cont) {
                List<Dimension> newCells=new ArrayList<Dimension>();

                for (Dimension d : involvedCells) {
                    int x= (int) d.getWidth();
                    int y= (int) d.getHeight();

                    if (x > 0) {
                        Dimension n1 = new Dimension(x - 1, y);
                        if (locations.get(n1)) {
                            newCells.add(n1);
                            locations.put(n1, false);
                        }
                    }
                    if (x < maxX-1 ) {
                        Dimension n1 = new Dimension(x + 1, y);
                        if (locations.get(n1)) {
                            newCells.add(n1);
                            locations.put(n1, false);
                        }
                    }
                    if (y > 0) {
                        Dimension n1 = new Dimension(x, y - 1);
                        if (locations.get(n1)) {
                            newCells.add(n1);
                            locations.put(n1, false);
                        }
                    }
                    if (y < maxY-1 ) {
                        Dimension n1 = new Dimension(x, y + 1);
                        if (locations.get(n1)) {
                            newCells.add(n1);
                            locations.put(n1, false);
                        }
                    }

                    cont = newCells.size()>0;
                }
                involvedCells.clear();
                involvedCells.addAll(newCells);
                newCells.clear();
            }

            numberOfRegions++;
        }
        return numberOfRegions;
    }
    private static Dimension findFirstRegion() {
        for (int y = 0; y <= 127; y++) {
            for (int x = 0; x < binaryRep[y].length(); x++) {
                Dimension d = new Dimension(x, y);
                if (locations.get(d)) {
                    return d;
                }
            }
        }
        return null;
    }
    public static String toBinaryString(String hex) {

        String bin = "";
        String binFragment = "";
        int iHex;
        hex = hex.trim();
        hex = hex.replaceFirst("0x", "");

        for(int i = 0; i < hex.length(); i++){
            iHex = Integer.parseInt(""+hex.charAt(i),16);
            binFragment = Integer.toBinaryString(iHex);

            while(binFragment.length() < 4){
                binFragment = "0" + binFragment;
            }
            bin += binFragment;
        }
        return bin;
    }

    static private String getKnotHash(String string) {
        setKnotHashInput(256, 64, modifyInput(string));
        return getDenseHash();
    }
 }

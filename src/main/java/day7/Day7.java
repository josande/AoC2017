package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Day7 {
    private static class Disc{
        final private String name;
        final private int  weight;
        final private List<String> children=new ArrayList<>();
        Disc(String name, int weight, String children) {
            this.name=name;
            this.weight=weight;
            for (String child : children.split(", "))
                if (child.trim().length()>0)
                    this.children.add(child.trim());
        }
        private String getName() {
            return name;
        }
        int getWeight() {
            return weight;
        }
        int getWeightOfChildren() {
            int sum=0;
            for (Disc child : getChildren())
                sum+=child.getWeightIncludingChildren();
            return sum;
        }
        int getWeightIncludingChildren() {
            return getWeight() + getWeightOfChildren();
        }
        List<Disc> getChildren() {
            List<Disc> childDiscs=new ArrayList<>();
            for (String child : children) {
                childDiscs.add(getDiscByName(child));
            }
            return childDiscs;
        }
    }
    private static Disc getDiscByName(String name) {
        for (Disc disc: discs )
            if (disc.getName().equals(name))
                return disc;
        return null;
    }
    static private List<Disc> discs;

    static void setInputData(String input) {
        discs=new ArrayList<>();
        String[] rows = input.split("\n");

        for (String row : rows) {
            String[] words = row.split(" ");
            String name = words[0];
            int weight = Integer.valueOf(words[1].replaceAll("\\(", "").replaceAll("\\)", ""));
            if (!row.contains("->")) {
                discs.add(new Disc(name, weight, ""));
            } else {
                discs.add(new Disc(name, weight, row.split(" -> ")[1]));
            }

        }
    }
    static String calculateA() {
        String nameOfHeaviest="";
        int weightOfHeaviest=0;
        for (Disc disc : discs) {
            int weight=disc.getWeightIncludingChildren();
            if (weight>weightOfHeaviest) {
                weightOfHeaviest=weight;
                nameOfHeaviest=disc.getName();
            }
        }
        return nameOfHeaviest;
    }
    static int calculateB() {
        Disc discWithSmallestDiff=getDiscWithSmallestDiff();
        if (discWithSmallestDiff != null) {
            List<Integer> weights=new ArrayList<>();

            for (Disc child : discWithSmallestDiff.getChildren()) {
                weights.add(child.getWeightIncludingChildren());
            }
            int oddWeight=-1, commonWeight=-1;
            Disc oddDisc=null;
            for (int i=0; i<weights.size(); i++) {
                if ( Collections.frequency(weights, weights.get(i))==1) {
                    oddWeight=weights.get(i);
                    oddDisc=discWithSmallestDiff.getChildren().get(i);
                } else {
                    commonWeight=weights.get(i);
                }
            }
            if (oddDisc!=null) {
                return oddDisc.getWeight()-(oddWeight-commonWeight);
            }
        }
        return 0;
    }

    private static Disc getDiscWithSmallestDiff() {
        Disc discWithSmallestDiff=null;

        int smallestDiff=-1;

        for (Disc disc: discs) {
            if (disc.getChildren().size() > 0) {
                int diff = -1, previousWeight = 0;
                for (Disc c : disc.getChildren()) {
                    int weight = c.getWeightIncludingChildren();
                    if (previousWeight > 0 && weight != previousWeight) {
                        diff = Math.abs(previousWeight - weight);
                    }
                    previousWeight = weight;
                }
                if (diff > 0) {
                    if (smallestDiff < 0 || diff < smallestDiff) {
                        smallestDiff = diff;
                        discWithSmallestDiff = disc;
                    }
                }
            }
        }
        return discWithSmallestDiff;
    }
}

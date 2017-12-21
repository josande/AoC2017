package day21;

import java.util.HashMap;

class Day21 {

    private static HashMap<String, String> transformations;
    private static String currentPicture;

    static void setInput(String input) {
        transformations = new HashMap<>();
        currentPicture = ".#./..#/###";

        for (String row : input.split("\n")) {
            row = row.replaceAll(" ", "");
            transformations.put(row.split("=>")[0], row.split("=>")[1]);
        }
    }

    static void iteratePicture(int rotations) {
        for (int i = 0; i < rotations; i++) {
            currentPicture = transform(currentPicture);
        }
    }

    static int getPixels() {
        int pixels = 0;
        for (char c : currentPicture.toCharArray())
            if (c == '#')
                pixels++;
        return pixels;

    }

    private static String transform(String picture) {
        String[] rows = picture.split("/");
        StringBuilder newPicture = new StringBuilder();
        int length = rows.length;
        if (length % 2 == 0) { // 2->3*3
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();StringBuilder c = new StringBuilder();
            for (int row = 0; row < length; row = row + 2) {
                for (int part = 0; part < length; part = part + 2) {
                    String string = rows[row].substring(part, part + 2) + "/" +
                            rows[row + 1].substring(part, part + 2);
                    string = turnToKnownState(string);
                    a.append(transformations.get(string).split("/")[0]);
                    b.append(transformations.get(string).split("/")[1]);
                    c.append(transformations.get(string).split("/")[2]);
                }
                newPicture.append(a).append("/").append(b).append("/").append(c).append("/");
                a = new StringBuilder();
                b = new StringBuilder();
                c = new StringBuilder();
            }
        } else { // 3->4*4
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            StringBuilder c = new StringBuilder();StringBuilder d = new StringBuilder();
            for (int row = 0; row < length; row = row + 3) {
                for (int part = 0; part < length; part = part + 3) {
                    String string = rows[row].substring(part, part + 3) + "/" +
                            rows[row + 1].substring(part, part + 3) + "/" +
                            rows[row + 2].substring(part, part + 3);
                    string = turnToKnownState(string);

                    a.append(transformations.get(string).split("/")[0]);
                    b.append(transformations.get(string).split("/")[1]);
                    c.append(transformations.get(string).split("/")[2]);
                    d.append(transformations.get(string).split("/")[3]);
                }
                newPicture.append(a).append("/").append(b).append("/").append(c).append("/").append(d).append("/");
                a = new StringBuilder();
                b = new StringBuilder();
                c = new StringBuilder();
                d = new StringBuilder();
            }
        }

        newPicture = new StringBuilder(newPicture.substring(0, newPicture.length() - 1));
        return newPicture.toString();
    }

    private static String turnToKnownState(String string) {
        String input = string;
        if (transformations.containsKey(string))
            return string;
        String[] rows = string.split("/");
        if (rows.length == 2) {
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = flip2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate2(string);
            if (transformations.containsKey(string))
                return string;
            System.out.println("2: Couldn't solve " + input);
        } else {
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = flip3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;
            string = rotate3(string);
            if (transformations.containsKey(string))
                return string;

            System.out.println("3: Couldn't solve " + input);
        }
        return "";
    }


    private static String rotate2(String string) {
        String a = string.split("/")[0];    // a0 a1 -> b0 a0
        String b = string.split("/")[1];    // b0 b1    b1 a1

        return b.substring(0, 1) + a.substring(0, 1) + "/"
                + b.substring(1, 2) + a.substring(1, 2);
    }

    private static String rotate3(String string) {
        String a = string.split("/")[0];   //a0 a1 a2    c0 b0 a0
        String b = string.split("/")[1];   //b0 b1 b2 -> c1 b1 a1
        String c = string.split("/")[2];   //c0 c1 c2    c2 b2 a2

        return c.substring(0, 1) + b.substring(0, 1) + a.substring(0, 1) + "/"
                + c.substring(1, 2) + b.substring(1, 2) + a.substring(1, 2) + "/"
                + c.substring(2, 3) + b.substring(2, 3) + a.substring(2, 3);
    }

    private static String flip2(String string) {
        String a = string.split("/")[0];    // a0 a1 -> a1 a0
        String b = string.split("/")[1];    // b0 b1    b1 b0

        return a.substring(1, 2) + a.substring(0, 1) + "/"
                + b.substring(1, 2) + b.substring(0, 1);

    }

    private static String flip3(String string) {
        String a = string.split("/")[0];   //a0 a1 a2    a2 a1 a0
        String b = string.split("/")[1];   //b0 b1 b2 -> b2 b1 b0
        String c = string.split("/")[2];   //c0 c1 c2    c2 c1 c0

        return a.substring(2, 3) + a.substring(1, 2) + a.substring(0, 1) + "/"
                + b.substring(2, 3) + b.substring(1, 2) + b.substring(0, 1) + "/"
                + c.substring(2, 3) + c.substring(1, 2) + c.substring(0, 1);

    }
}
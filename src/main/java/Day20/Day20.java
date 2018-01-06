package Day20;

import java.util.ArrayList;
import java.util.List;

class Day20 {
    private static Integer[][] data;
    private static int numberOfParticles;
    private static List<Integer> removed;

    static void setInput(String input) {
        input=input.replaceAll("<","").replaceAll(">", "")
                .replaceAll("=", "").replaceAll(" ", "")
                .replaceAll("p","").replaceAll("v","").replaceAll("a", "");
        String[] rows = input.split("\n");
        removed = new ArrayList<>();

        numberOfParticles = rows.length;
        data=new Integer[rows.length][9];

        int minAcceleration=100;
        int slowestParticle=-1;
        for (int i =0; i<rows.length; i++) {
            for (int j=0; j<9;j++) {
                data[i][j]=Integer.valueOf(rows[i].split(",")[j]);
            }
            int acceleration=(Math.abs(data[i][6])+Math.abs(data[i][7])+Math.abs(data[i][8]));
            if (acceleration<minAcceleration) {
                slowestParticle=i;
                minAcceleration=acceleration;
            }
        }
        System.out.println("Result Day20(a): "+slowestParticle);
        int remainingAfterCollisions=-1;
        for (int i=0; i<40;i++) {
            remainingAfterCollisions=getClosestParticle();
        }
        System.out.println("Result Day20(b): "+remainingAfterCollisions);
    }

    static private Integer getClosestParticle() {
        for (int i =0; i<numberOfParticles; i++) {

            data[i][3]+=data[i][6];
            data[i][4]+=data[i][7];
            data[i][5]+=data[i][8];

            data[i][0]+=data[i][3];
            data[i][1]+=data[i][4];
            data[i][2]+=data[i][5];
        }
        boolean collision;
        for (int i =0; i<numberOfParticles; i++) {
            collision=false;
            if (removed.contains(i))
                continue;
            for (int j =0; j<numberOfParticles; j++) {
                if (i==j) continue;
                if (removed.contains(j))
                    continue;
                if (data[i][0].equals(data[j][0])&& data[i][1].equals(data[j][1]) &&  data[i][2].equals(data[j][2])) {
                    collision=true;
                    removed.add(j);
                }
            }
            if (collision)
                removed.add(i);
        }
        return numberOfParticles-removed.size();
    }


}

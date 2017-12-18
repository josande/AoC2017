package day12;

import java.util.ArrayList;
import java.util.List;

class Day12 {
    private static class Program {
        final int id;
        final List<Integer> connections=new ArrayList<>();

        Program(int id) {
            this.id=id;
        }
        private int getId() {
            return id;
        }
        private List<Integer> getConnections() {
            return connections;
        }
        private void addConnection(int id) {
            connections.add(id);
        }
    }

    private static List<Program> programs;

    public static void setInput(String input) {
        programs= new ArrayList<>();
        for(String row : input.split(("\n"))) {
            row=row.replaceAll(" ","");
            int id= Integer.valueOf(row.split("<->")[0]);
            Program p = new Program(id);
            String connections = row.split("<->")[1];
            for (String connectionId : connections.split(",")) {
                p.addConnection(Integer.valueOf(connectionId));
            }
            programs.add(p);
        }
    }
    private static Program getProgramById(int id) {
        for (Program p : programs)
            if (p.id==id)
                return p;
        return null;
    }
    static int getNumberOfGroups() {
        int groups=0;
        while (programs.size() > 0) {
             programs.removeAll(getGroupContaining(programs.get(0).getId()));
             groups++;
        }
        return groups;
    }
    private static boolean groupContains(List<Program> group, int id) {
        for (Program p: group)
            if (p.id==id)
                return true;
        return false;
    }
    static List<Program> getGroupContaining(int id) {
        Program p1 = getProgramById(id);
        List<Program> group=new ArrayList<>();
        group.add(p1);
        int groupSizeBefore=0;
        while (groupSizeBefore != group.size()) {
            List<Program> newPrograms=new ArrayList<>();
            groupSizeBefore = group.size();
            for (Program p : group)
                for (int c : p.getConnections())
                    if (!groupContains(group, c))
                        newPrograms.add(getProgramById(c));
            group.addAll(newPrograms);
        }
        return group;
    }
}

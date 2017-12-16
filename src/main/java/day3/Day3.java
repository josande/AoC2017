package day3;

import java.util.ArrayList;

class Day3 {
    private static class Cell {
        private final int x,y,id,value;

        Cell(int id, int x, int y) {
            this.id=id;
            this.x=x;
            this.y=y;
            this.value=getNeighbourValues(x,y);
            cells.add(this);
        }
        int getId() {return id;}
        int getX() {return x;}
        int getY() {return y;}
        int getValue() {return value;}
    }
    private static int getRing(int id) {
        for (int i=1; ; i++) {
            if ((2*i-1)*(2*i-1) >= id) {
                return i;
            }
        }
    }
    private final static ArrayList<Cell> cells = new ArrayList<>();

    private static Cell getCell(int cellId) {
        for (Cell cell : cells) {
            if (cell.getId() == cellId) {return cell;}
        }
        int ring = getRing(cellId);
        int startId =  1 + (2 * ring - 3) * (2 * ring - 3);
        int sideLength = 2 * ring - 1;

        int m1=startId+ring-2;
        int m2=startId+ring-3+sideLength;
        int m3=startId+ring-4+2*sideLength;
        int m4=startId+ring-5+3*sideLength;

        int d1=cellId-m1, d2=cellId-m2, d3=cellId-m3, d4=cellId-m4;

        int minToMiddle=Math.abs(d1);
        int x=ring-1, y=d1;

        if (Math.abs(d2)<minToMiddle) {
            x=-d2; y=ring-1;
            minToMiddle=d2;
        }
        if (Math.abs(d3)<minToMiddle) {
            x=-ring+1; y=-d3;
            minToMiddle=d3;
        }
        if (Math.abs(d4)<minToMiddle) {
            x=d4; y=-ring+1;
        }
        return new Cell(cellId, x, y);
    }
    private static int getValue(int x, int y) {
        for (Cell cell : cells) {
            if (cell.getX()==x && cell.getY()==y) {return cell.getValue();}
        }
        return 0;
    }
    private static int getNeighbourValues(int x, int y) {
        if (x==0 && y==0) {return 1;}
        return getValue(x-1,y+1)+getValue(x,y+1)+getValue(x+1,y+1)+
               getValue(x-1,y)+getValue(x+1,y)+
               getValue(x-1,y-1)+getValue(x,y-1)+getValue(x+1,y-1);
    }
    static int calculateA(int cellId){
        Cell cell = getCell(cellId);
        return (Math.abs(cell.getX())+Math.abs(cell.getY()));
    }
    static int calculateB(int input){
        int id=1, currentValue=0;
        while(currentValue <= input) {

            Cell cell = getCell(id);
            currentValue=cell.getValue();
            id++;
        }
        return currentValue;
    }
}

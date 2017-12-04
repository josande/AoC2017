package day3;

import java.util.ArrayList;

class Day3 {
    private static class Cell {
        private int x,y,id,value=0;

        Cell(int id, int x,int y) {
            this.id=id;
            this.x=x;
            this.y=y;
            this.value=getNeigbourValues(x,y);
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
    static ArrayList<Cell> cells = new ArrayList<>();

    private static Cell getCell(int cellId) {
        for (Cell cell : cells) {
            if (cell.getId() == cellId) {return cell;}
        }
        int ring = getRing(cellId);
        int startX = ring - 1, startY = ring == 1 ? 0 : 2 - ring;
        int startId = ring == 1 ? 1 : 1 + (2 * ring - 3) * (2 * ring - 3);
        int sideLength = 2 * ring - 1;

        int x = startX, y = startY, id = startId;

        for (int i = 0; i < sideLength - 2; i++) {
            if (cellId == id) {return new Cell(id, x, y);}
            y++; id++;
        }
        for (int i = 0; i < sideLength - 1; i++) {
            if (cellId == id) {return new Cell(id, x, y);}
            x--; id++;
        }
        for (int i = 0; i < sideLength - 1; i++) {
            if (cellId == id) {return new Cell(id, x, y);}
            y--; id++;
        }
        for (int i = 0; i < sideLength; i++) {
            if (cellId == id) {return new Cell(id, x, y);}
            x++; id++;
        }
        throw new IllegalArgumentException("Unable to find cell for id:"+id);
    }
    private static int getValue(int x, int y) {
        for (Cell cell : cells) {
            if (cell.getX()==x && cell.getY()==y) {return cell.getValue();}
        }
        return 0;
    }
    static int getNeigbourValues(int x, int y) {
        if (x==0 && y==0) {return 1;}
        return getValue(x-1,y+1)+getValue(x,y+1)+getValue(x+1,y+1)+
               getValue(x-1,y)+getValue(x+1,y)+
               getValue(x-1,y-1)+getValue(x,y-1)+getValue(x+1,y-1);
    }
    static int calculateA(int input){
        Cell cell = getCell(input);
        return Math.abs(cell.getX())+Math.abs(cell.getY());
    }
    static int calculateB(int input){
        int id=1, currentValue=0;
        while(currentValue<=input) {
            currentValue=getCell(id).getValue();
            id++;
        }
        return currentValue;
    }
}

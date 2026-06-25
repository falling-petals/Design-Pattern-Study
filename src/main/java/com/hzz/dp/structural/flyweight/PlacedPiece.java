package com.hzz.dp.structural.flyweight;

public class PlacedPiece {
    private final ChessPieceFlyweight flyweight;
    private final int row;
    private final int col;

    public PlacedPiece(ChessPieceFlyweight flyweight, int row, int col) {
        this.flyweight = flyweight;
        this.row = row;
        this.col = col;
    }

    public void display() {
        flyweight.display(row, col);
    }
}

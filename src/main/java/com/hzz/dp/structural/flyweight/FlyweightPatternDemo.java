package com.hzz.dp.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        List<PlacedPiece> board = new ArrayList<>();

        // 摆棋: 16个白子 + 16个黑子
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("车", "白"), 0, 0));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("马", "白"), 0, 1));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("象", "白"), 0, 2));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("后", "白"), 0, 3));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("王", "白"), 0, 4));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("象", "白"), 0, 5));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("马", "白"), 0, 6));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("车", "白"), 0, 7));
        for (int c = 0; c < 8; c++) {
            board.add(new PlacedPiece(FlyweightFactory.getFlyweight("兵", "白"), 1, c));
        }

        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("车", "黑"), 7, 0));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("马", "黑"), 7, 1));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("象", "黑"), 7, 2));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("后", "黑"), 7, 3));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("王", "黑"), 7, 4));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("象", "黑"), 7, 5));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("马", "黑"), 7, 6));
        board.add(new PlacedPiece(FlyweightFactory.getFlyweight("车", "黑"), 7, 7));
        for (int c = 0; c < 8; c++) {
            board.add(new PlacedPiece(FlyweightFactory.getFlyweight("兵", "黑"), 6, c));
        }

        System.out.println("\n========== 显示棋盘 ==========");
        board.forEach(PlacedPiece::display);

        System.out.println("\n========== 统计 ==========");
        System.out.println("棋子总数: " + board.size());
        System.out.println("享元对象数: " + FlyweightFactory.poolSize());
        System.out.println("节省比例: " + (board.size() - FlyweightFactory.poolSize()) + " 个对象被复用");
    }
}

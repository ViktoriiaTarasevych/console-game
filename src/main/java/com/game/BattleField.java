package com.game;

public class BattleField {
    private final int width;
    private final int height;
    private char[][] battleField;

    public BattleField(int width, int height) {
        this.battleField = createBattleField(width, height);
        this.height = height;
        this.width = width;
    }

    private char[][] createBattleField(int width, int height) {
        char[][] battleField = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                battleField[i][j] = ' ';
            }
        }
        return battleField;
    }

    public Position moveToPosition(Position newPosition, Position oldPosition, char symbol) {
        if (newPosition.getX() >= 0 && newPosition.getX() < this.width
                && newPosition.getY() >= 0 && newPosition.getY() < this.height) {
            battleField[oldPosition.getY()][oldPosition.getX()] = ' ';
            battleField[newPosition.getY()][newPosition.getX()] = symbol;
            return newPosition;
        } else {
            return oldPosition;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i <= this.width + 1; i++) {
            str = str + "-";
        }
        str += "\n";

        for (int i = 0; i < this.height; i++) {

            for (int j = 0; j < this.width; j++) {
                if (j == 0)
                    str += "|";
                str = str + battleField[i][j];
            }
            str += "|\n";
        }
        for (int i = 0; i <= this.width + 1; i++) {
            str = str + "-";
        }
        str += "\n";
        return str;
    }
}

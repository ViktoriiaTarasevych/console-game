package com.game;

public class BattleField {
    private char[][] battleField;

    public BattleField(int size, int size2) {
        this.battleField = createBattleField(size, size2);
    }

    private char[][] createBattleField(int size, int size2) {
        char[][] battleField = new char[size][size2];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size2; j++) {
                battleField[i][j] = ' ';
            }
        }
        return battleField;
    }

    public int moveToPosition(int oldPosition, int newPosition, char symbol) {
        if (newPosition >= 0 && newPosition < battleField.length) {
            battleField[oldPosition] [oldPosition] = ' ';
            battleField[newPosition] [newPosition] = symbol;
            return newPosition;
        } else {
            return oldPosition;
        }
    }

    @Override
    public String toString() {
        String str = "[";

        for (int i = 0; i < battleField.length; i++) {
            for (int j = 0; j < battleField.length; j++) {
                str = str + battleField[i][j];
            }
        }
        return str + "]";
    }
}

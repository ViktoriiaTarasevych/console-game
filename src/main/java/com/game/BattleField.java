package com.game;

public class BattleField {
    private char[] battleField;

    public BattleField(int size) {
        this.battleField = createBattleField(size);
    }

    private char[] createBattleField(int size) {
        char[] battleField = new char[size];
        for (int i = 0; i < battleField.length; i++) {
            battleField[i] = ' ';
        }

        return battleField;
    }

    public int moveToPosition(int oldPosition, int newPosition, char symbol) {
        if (newPosition >= 0 && newPosition < battleField.length) {
            battleField[oldPosition] = ' ';
            battleField[newPosition] = symbol;
            return newPosition;
        } else {
            return oldPosition;
        }
    }

    @Override
    public String toString() {
        String str = "[";

        for (int i = 0; i < battleField.length; i++) {
            str = str + battleField[i];
        }

        return str + "]";
    }
}

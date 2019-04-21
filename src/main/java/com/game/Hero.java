package com.game;

public class Hero {
    private int positionX;
    private BattleField battleField;

    public Hero(int positionX, BattleField battleField) {
        this.positionX = positionX;
        this.battleField = battleField;
        moveRight();
    }

    public void moveRight() {
        positionX = battleField.moveToPosition(positionX, positionX + 1, 'X');
    }

    public void moveLeft() {
        positionX = battleField.moveToPosition(positionX, positionX - 1, 'X');
    }
}

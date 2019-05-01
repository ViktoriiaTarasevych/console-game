package com.game;

public class Hero {
    private Position position;
    private BattleField battleField;


    public Hero(Position position, BattleField battleField) {
        this.position = position;
        this.battleField = battleField;
        moveRight();
    }

    public Position getPosition() {
        return position;
    }

    public void moveRight() {
        Position newPosition = new Position(position.getX() + 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'X');
    }

    public void moveLeft() {
        Position newPosition = new Position(position.getX() - 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'X');
    }

    public void moveUp() {
        Position newPosition = new Position(position.getX(), position.getY() - 1);
        position = battleField.moveToPosition(newPosition, position, 'X');
    }

    public void moveDown() {
        Position newPosition = new Position(position.getX(), position.getY() + 1);
        position = battleField.moveToPosition(newPosition, position, 'X');
    }
}

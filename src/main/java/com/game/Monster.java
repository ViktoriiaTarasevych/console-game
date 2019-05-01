package com.game;

import java.util.Random;

public class Monster {
    private Position position;
    private BattleField battleField;
    private Random random;

    public Monster(Position position, BattleField battleField) {
        this.position = position;
        this.battleField = battleField;
        this.random = new Random();
        moveRight();
    }

    public Position getPosition() {
        return position;
    }

    public void moveRandom() {
        int nextInt = random.nextInt(4);
        if (nextInt == 0) moveRight();
        if (nextInt == 1) moveLeft();
        if (nextInt == 2) moveDown();
        if (nextInt == 3) moveUp();
    }

    private void moveRight() {
        Position newPosition = new Position(position.getX() + 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'Z');
    }

    private void moveLeft() {
        Position newPosition = new Position(position.getX() - 1, position.getY());
        position = battleField.moveToPosition(newPosition, position, 'Z');
    }

    private void moveUp() {
        Position newPosition = new Position(position.getX(), position.getY() - 1);
        position = battleField.moveToPosition(newPosition, position, 'Z');
    }

    private void moveDown() {
        Position newPosition = new Position(position.getX(), position.getY() + 1);
        position = battleField.moveToPosition(newPosition, position, 'Z');
    }
}

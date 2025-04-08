package com.ohgiraffers.chap09.section04.uses3;

public class Dicer {

    private int currentPosition;

    public void throwDice(Dice dice){

        int diceNumber = dice.getNumber();
        move(diceNumber);
    }

    private void move(int diceNumber) {
        this.currentPosition += diceNumber;
    }
}

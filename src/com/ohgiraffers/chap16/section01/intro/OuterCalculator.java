package com.ohgiraffers.chap16.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum {
        int sumToNumber(int x, int y);
    }

    @FunctionalInterface
    public interface Minus {
        int minusToNumber(int x, int y);
    }

    @FunctionalInterface
    public interface Multiply {
        int multiplyToNumber(int x, int y);
    }

    @FunctionalInterface
    public interface Divide {
        int divideToNumber(int x, int y);
    }
}

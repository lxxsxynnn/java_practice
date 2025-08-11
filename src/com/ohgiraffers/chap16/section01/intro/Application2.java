package com.ohgiraffers.chap16.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 람다식 활용을 위한 내부 인터페이스 관리 기법에 대해 이해할 수 있다. */
        /*
        * 람다식을 사용하기 위해 인터페이스 내에 하나의 추상메서드만 작성할 수 있기 때문에
        * 관리해야 하는 인터페이스가 너무 많아질 수 있다.
        * 이때 내부 인터페이스를 활용하는 방법으로 사용할 수 있다.
        * */
        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiply multi =  (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumToNumber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusToNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multi.multiplyToNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + divide.divideToNumber(20, 10));
    }
}

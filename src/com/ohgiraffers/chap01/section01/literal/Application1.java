package com.ohgiraffers.chap01.section01.literal;

public class Application1 {

    public static void main(String[] args) {

        System.out.println('a'); //문자
        // System.out.println('ab'); //문자는 하나의 문자로 되어있어 두 개 이상은 문자가 아님 > 에러 발생
        System.out.println("ab"); //문자열
        // System.out.println(''); //아무 문자도 기록되지 않으면 에러 발생
        System.out.println(""); //문자열은 빈 값도 가능

        System.out.println('1'); //숫자가 아닌 문자열 1로 취급

        System.out.println(true);
        System.out.println(false);

    }
}

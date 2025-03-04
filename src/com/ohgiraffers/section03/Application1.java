package com.ohgiraffers.section03;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 상수란?
        * 변하지 않는 값(항상 고정된 값)을 저장해두기 위한 메모리상의 공간
        *
        * 사용 목적
        * 변경되지 않는 고정된 값을 저장하기 위해
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 함
        * 예) 수학 공식에 사용되는 수치 등
        *
        * 사용방법
        * 1. 상수 선언 (변수 선언과 유사하지만 final 키워드 사용)
        * 2. 값을 초기화 (초기화 이후 값 변경 불가)
        * 3. 필요한 위치에 상수를 호출해서 사용
        * */

        final int AGE;

        AGE = 20;

        System.out.println("AGE의 값 : " + AGE);
        System.out.println("AGE의 2배 : " + (AGE * 2));
        int sum = AGE;
//        int AGE = AGE + 10; // 대입 연산자의 왼쪽에는 기술 불가
    }
}

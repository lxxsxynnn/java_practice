package com.ohgiraffers.chap02.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 논리연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다. */
        /*
        * 논리 연산자의 우선순위와 활용
        * 논리 and 연산자와 논리 or 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자 우선순위가 논리 or 연산자 우선순위보다 높음
        * */

        /* 1. 1부터 100 사이의 값인지 확인해보기 */
        /* 1 <= 변수 <= 100 이렇게 사용 부락 -> 변수 >= 1 && 변수 <= 100 으로 사용해야 함 */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 2. 영어 대문자인지 확인 */
        /* 영어 대문자인지? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
        char char1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (char1 >= 'A' && char1 <= 'Z'));

        char char2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (char2 >= 'A' && char2 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        /* 문자변수 == 'y' || 문자변수 == 'Y' */
        char char3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + ( char3 == 'y' || char3 == 'Y'));

        char char4 = 'y';
        System.out.println("영문자 y인지 확인 : " + ( char4 == 'y' || char4 == 'Y'));

        /* 4. 영문자인지 확인 */
        /* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
        /*
        * 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 됨
        * 하지만 연산자 우선순위를 디테일하게 학습하고 개발하는 개발자가 적기 때문에 논리적으로 먼저 실행하는 내용을 괄호로 묶어주는 게 좋음
        * */

        char char5 = 'f';
        System.out.println("영문자인지 확인 : " + ( (char5 >= 'A' && char5 <= 'Z') || (char5 >= 'a' && char5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ( (char5 >= 65 && char5 <= 90) || (char5 >= 97 && char5 <= 122)));

        char char6 = 'F';
        System.out.println("영문자인지 확인 : " + ( (char6 >= 'A' && char6 <= 'Z') || (char6 >= 'a' && char6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ( (char6 >= 65 && char6 <= 90) || (char6 >= 97 && char6 <= 122)));
    }
}

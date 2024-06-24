package com.ohgirffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        System.out.println("============== 정수와 정수의 연산 ==============");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println(123);
        System.out.println(1.23);

        System.out.println("============== 실수와 실수의 연산 ==============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 10.0);
        //오차 발생 가능

        System.out.println("============== 정수와 실수의 연산 ==============");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        //결과는 항상 실수

        System.out.println("============== 문자와 문자의 연산 ==============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        //컴퓨터에 저장된 해당 문자에 해당하는 값을 가져와 계산이 가능

        System.out.println("============== 문자와 정수 연산 ==============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("============== 문자와 실수 연산 ==============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        System.out.println("============== 문자열과 문자열 연산 ==============");
        System.out.println("hello" + "world");
        //문자열은 '+' 연산만 가능(다른 타입과 이어붙여도 이어붙이기 형태로 '+' 연산만 가능)

        //논리값은 문자열과 '+' 연산만 가능
    }
}

package com.ohgiraffers.chap04.section02.looping;

public class Application {

    public static void main(String[] args) {

        A_for a = new A_for();
        /* 단독 for문 흐름 확인용 메소드 호출 */
        //a.testSimpleForStatement();

        /* 반복문을 사용하는 예제(필요성 느끼기) */
        //a.testForExample1();
        //a.testForExample2();
        //a.testForExample3();
        //a.testForExample4();

        /* 반복문을 일상 생활에서 사용하는 예제(규칙 찾기) */
        //a.printSimpleGugudan();

        A_nestedFor a2 = new A_nestedFor();
        /* 중첩 반복문을 사용하는 예제 */
        //a2.printGugudanFromTwoToNine();
        //a2.printUpgradeGugudanFromTwoToNine();
        //a2.printStarInputRowTimes();
        //a2.printTriangleStars();

        B_while b = new B_while();
        /* 단독 while문 흐름 확인용 메소드 호출 */
        //b.testSimpleWhileStatement();

        /* 반복문을 사용하는 예제(for문과 비교) */
        //b.testWhileExample1();
        //b.testWhileExample2();
        //b.testWhileExample3();

        C_doWhile c = new C_doWhile();
        /* 단독 do-while문 흐름 확인용 메소드 호출 */
        //c.testSimpleDoWhileStatement();

        /* do-while 반복문을 사용하는 에제 */
        c.testDoWhileExample1();
    }
}

package com.ohgiraffers.chap03.section01.method;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 메소드 전달 인자와 매개변수에 대해 이해하고 메소드 호출 시 활용할 수 있다. */
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        * 지금까지 우리가 배운 변수는 지역변수에 해당
        * */

        /*
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)
        * 클래스(static) 변수
        * */

        /*
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용 가능함
        * 이것을 지역변수의 스코프라고 함
        * 다른 메소드 간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있음
        * 이때 전달하는 값을 전달인자(argument)라고 부르고,
        * 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 함
        * */

        Application3 app3 = new Application3();

        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        /* 1. 전달인자로 값 전달 테스트 */
        /* 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 갯수, 순서가 일치하게 값을 넣어 호출해야 함 */
        app3.testMethod(40);
        //app3.testMethod("40");              //매개변수는 int형이지만 인자가 String형이기 때문에 호출 불가
        //app3.testMethod(20, 30, 40);        //매개변수는 int형 1개이지만 인자는 3개이기 때문에 호출 불가
        //app3.testMethod();                  //매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출 불가

        /* 2. 변수에 저장한 값 전달 테스트 */
        /* 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있음 */
        int age = 20;
        app3.testMethod(age);

        /* 2-2. 자동형변환을 이용하여 값을 전달할 수 있음 */
        byte byteAge = 10;
        app3.testMethod(byteAge);

        /* 2-3. 강제형변환을 이용하여 값 전달을 할 수 있음 */
        long longAge = 80;
        //app3.testMethod(longAge);         //자동형변환을 할 수 없어 에러 발생
        app3.testMethod((int) longAge);     //강제형변환을 이용해 자료형을 맞춘 후 호출 가능(데이터 손실 주의)

        /* 2-4. 연산 결과를 이용해 값 전달을 할 수 있음*/
        app3.testMethod(age * 3);
    }

    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}

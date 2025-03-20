package com.ohgiraffers.chap06.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다. */
        /*
        * static
        * : 정적 메모리 영역에 프로그램이 start 될 때 할당을 하는 키워드
        *   인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있음
        *   여러 인스턴스가 공유해서 사용할 목적의 공간
        *   하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식
        *   명확한 목적이 존재하지 않는 한 static 키워드 사용은 자제할 것
        *   의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때
        * */

        /* 1. static 키워드를 필드에서 사용 */
        /* StaticFieldTest 인스턴스 생성 */
        StaticFieldTest sft1 = new StaticFieldTest();

        /* 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        /* 두 필드의 값 1씩 증가 후 다시 값 확인 */
        sft1.increaseNonStaticCount();
        sft1.increaseStaticCount();

        System.out.println("non-static field : " + sft1.getNonStaticCount());
        System.out.println("static field : " + sft1.getStaticCount());

        /* 새로운 StaticFiledTest 인스턴스 생성 */
        StaticFieldTest sft2 = new StaticFieldTest();

        /* 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field : " + sft2.getNonStaticCount());       //새로운 객체 생성
        System.out.println("static field : " + sft2.getStaticCount());              //값 유지

        /*
        * 인스턴스 변수의 경우에는 sft1과 sft2 두 개의 인스턴스가 서로 값을 공유하지 못하고
        * 인스턴스를 생성할 때마다 0으로 초기화됨
        * 하지만 static 필드의 경우에는 클래스 변수 자체가 프로그램을 종료할 때까지 유지되고 있기 때문에 값을 유지하고 있음
        * 따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용함
        * */

        /* 2. static 메소드 확인 */
        /* 2-1. non-static 메소드 호출 */
        /* StaticMethodTest 인스턴스 생성 후 호출 */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /*
        * static 메소드도 이렇게 호출할 수는 있음
        * 하지만 static 메소드의 경우 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 함
        * static method는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
        * static 메소드를 호출하는 방식으로 호출해야 함
        * */
        smt.staticMethod();         //권장하지 않는 방식

        /* 2-2. static 메소드 호출 */
        /*
        * 클래스명.메소드명 으로 인스턴스를 생성하지 않고 호출할 수 있음
        * 예) Math 클래스의 메소드들
        * */
        StaticMethodTest.staticMethod();    //권장함
    }
}

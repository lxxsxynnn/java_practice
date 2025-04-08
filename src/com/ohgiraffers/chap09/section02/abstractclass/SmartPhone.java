package com.ohgiraffers.chap09.section02.abstractclass;

/* 두 개 이상의 클래스를 extends로 상속받으면 에러 발생함 */
public class SmartPhone extends Product /*, java.util.Scanner */ {

    /*
    * SmartPhone 클래스는 Product 클래스를 상속받아서 구현함
    * extends 키워드로 클래스를 상속받을 때 두 개 이상의 클래스는 상속하지 못함(모호성 제거)
    * 추상클래스가 가지는 추상메소드를 반드시 오버라이딩 해야 함(강제성 부여)
    * */
    public SmartPhone() {}

    @Override
    public void abstMethod(){

        System.out.println("Product 클래스의 abstMethod를 오버라이딩한 메소드 호출함...");
    }

    /* 추가적으로 메소드도 작성할 수 있음 */
    public void printSmartPhone(){

        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}

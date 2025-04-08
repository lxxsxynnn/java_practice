package com.ohgiraffers.chap09.section02.abstractclass;

public abstract class Product {

    /* 추상클래스는 필드를 가질 수 있음 */
    private int nonStaticField;
    private static int staticField;

    /*
    * 추상클래스는 생성자도 가질 수 있음
    * 하지만 직접적으로 인스턴스를 생성할 수는 없음
    * */
    public Product(){}

    /* 추상클래스는 일반적인 메소드를 가질 수 있음 */
    public void nonStaticMethod(){

        System.out.println("Product 클래스의 nonStaticMethod 호출함...");
    }

    public static void staticMethod(){

        System.out.println("Product 클래스의 staticMethod 호출함...");
    }

    /*
    * 추가적으로 미완성 메소드(추상메소드) 또한 만들 수 있음
    * 추상메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 작성해야 함
    * abstract는 상속을 막는 final 키워드와 상충하기 때문에 동시에 사용할 수 없음
    * */
    public abstract void abstMethod();
}

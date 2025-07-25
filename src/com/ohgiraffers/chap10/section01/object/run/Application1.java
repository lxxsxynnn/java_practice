package com.ohgiraffers.chap10.section01.object.run;

import com.ohgiraffers.chap10.section01.object.book.Book;

public class Application1 {

    public static void main(String[] args){
        /* 수업목표. Object 클래스의 toString() 메소드 오버라이딩 목적을 이해하고 활용할 수 있다. */
        /*
        * 모든 클래스는 Object 클래스의 후손
        * 따라서 Object 클래스가 가진 메소드를 자신의 것처럼 사용할 수 있음
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능
        *
        * Object 클래스의 메소드 중 관례 상 많이 오버라이딩해서 사용하는 메소드들이 있음
        * toString(), equals(), hashcode()
        * */

        /*
        * API 문서에서 java.lang.Object 클래스의 toString() 메소드의 기능과 선언부를 확인해보면
        * 인스턴스가 생성될 때 사용한 full class name과 @ 그리고 16진수 해시코드가 문자열로 반환됨
        * 16진수 해시코드는 인스턴스의 주소를 가리키는 값으로 인스턴스마다 모두 다르게 반환됨
        * */
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        /*
        * 동일한 값을 가지는 인스턴스도 다른 해시코드 값을 가지고 있음
        * 풀 클래스 이름과 @ 그리고 16진수 해시코드를 반환함
        * */
        System.out.println("book1.toString(): " + book1.toString());
        System.out.println("book2.toString(): " + book2.toString());
        System.out.println("book3.toString(): " + book3.toString());

        /*
        * toString()을 호출하지 않고 레퍼런스 변수만 출력하는 경우 동일하게 결과가 나옴
        * 이 경우 자동으로 toString() 메소드를 호출해줌
        * 그래서 이런 편리한 점을 이용하여 toString() 메소드를 재정의해서 사용하게 됨
        * */
        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);
    }
}

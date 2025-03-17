package com.ohgiraffers.chap06.section01.user_type;

public class Member {

    /*
    * 지금까지 우리는 클래스 내부에 메소드만 작성해봤음
    * 하지만 클래스 내부에는 메소드를 작성하지 않고 바로 변수를 선언할 수도 있음
    * 이것을 전역변수(필드 == 인스턴스변수 == 속성)라고 부름
    * */

    /*
    * 앞에서 사용했던 홍길동, 20 등의 값들은 한 명의 회원을 구성하고 있는 값들
    * 이런 값들의 명칭은 이름, 나이라고 하는 명사로 표현될 수 있는데 이것을 속성이라고 함
    * 어떠한 속성들을 가지고 있는지를 현 위치에 정의를 할 것
    * 정의를 하는 방법은 변수를 선언하는 것과 동일함
    * */
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;
}

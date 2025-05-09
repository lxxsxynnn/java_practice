package com.ohgiraffers.chap03.section03.math;

public class Application1 {

    public static void main(String[] args) {

        /* 수업목표. Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /*
        * API란?
        * Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻함
        * 더 쉽게 말해 누가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말
        * 모든 코드를 우리가 다 외울 수 없으니 API 문서를 별도로 제공해주고 있음
        * */

        /*
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
        * 모든 메소드는 static 메소드로 작성되어 있음
        * (객체의 상태를 관리하지 않고 기능만 제공하는 경우 메모리를 효율적으로 사용하기 위해 자주 사용되는 기법
        * */

        /* 1. 절대값 출력 */
        /* 1-1. 클래스의 full-name을 다 적은 경우 */
        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

        /* 1-2. import를 해서 사용 */
        /*
        * 클래스의 full-name 말고 클래스명만 작성하려면 import를 해야 함
        * 하지만 Math 클래스는 import하지 않아도 쓸 수 있음
        * java.lang 패키지에 속한 클래스이기 때문
        * System, String 또한 지금까지 따로 import를 하지 않고 사용할 수 있었던 것은 두 클래스 또한 java.lang 패키지에 속하기 때문
        * 워낙 자주 사용하는 패키지이다 보니 import 하지 않고 사용할 수 있도록 해 놓음
        * 컴파일러가 import java.lang.*; 이 코드를 자동으로 추가해서 컴파일하기 때문
        * */
        System.out.println("-1.25의 절대값 : " + Math.abs(-1.25));

        /* 2. 최댓값, 최솟값 출력 */
        System.out.println("10과 20 중 더 작은 것은 : " + Math.min(10, 20));
        System.out.println("20과 30 중 더 큰 것은 : " + Math.max(20, 30));

        /*
        * 수학적으로 많이 사용하는 고정된 값들도 이미 Math 안에 정의된 것이 있음
        * 필드라는 것을 이용한 것인데 이 부분은 나중에 다루게 될 것
        * */
        System.out.println("원주율 : " + Math.PI);

        /* 3. 난수 출력 */
        /*
        * 0부터 1 전까지 실수 형태의 난수를 발생시킴
        * 호출할 때마다 다른 값을 가짐
        * 난수는 프로그래밍에서 꽤나 자주 사용되는 편
        * */
        System.out.println("난수 발생 : " + Math.random());
    }
}

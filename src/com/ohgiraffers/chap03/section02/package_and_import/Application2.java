package com.ohgiraffers.chap03.section02.package_and_import;

/* 사용하려는 클래스까지 작성해야 함 */
import com.ohgiraffers.chap03.section01.method.Calculator;

/* static import의 경우 사용하려는 statix method까지 전부 써줘야 함*/
import static com.ohgiraffers.chap03.section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 임포트에 대해 이해할 수 있다. */
        /*
        * 임포트란?
        *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 함
        *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거로움
        *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문임
        *   import는 package 선언문과 class 선언문 사이에 작성하며
        *   어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가짐
        * */

        /* 다시 한 번 Calculator를 사용해서 메소드 호출해보기 */
        /* 1. non-static method의 경우 */
        Calculator calc = new Calculator();     //임포트 구문 추가할 것
        int min = calc.minNumberOf(50, 60);

        System.out.println("50과 60 중 더 작은 값은 : " + min);

        /* 2. static method의 경우 */
        int max = maxNumberOf(50, 60);

        System.out.println("50과 60 중 더 큰 값은 : " + max);

        /* 3. static method를 호출할 때 클래스명도 생략하고 사용(import static) */
        int max2 = maxNumberOf(100, 200);       //static import 구문 수동 추가

        System.out.println("100과 200 중 더 큰 값은 : " + max2);
    }
}

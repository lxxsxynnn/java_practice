package com.ohgiraffers.chap04.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement(){

        /* 수업목표. if-else문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /*
        * [if-else문 표현식]
        * if(조건식){
        *     조건식이 true일 때 실행할 명령문;
        * }else{
        *     조건식이 false일 때 실행할 명령문;
        * }
        * */

        /*
        * if문은 조건식의 결과값이 참(true)이면 if { } 안에 있는 코드를 실행하고
        * 조건식의 결과값이 거짓(false)이면 else { } 안에 있는 코드를 실행함
        * */

        /* 조건을 만족하는지 여부에 따라 둘 중 하나는 무조건 실행해야 하는 경우 많이 사용됨 */

        /*
        * 정수 한 개를 입력받아 그 수가 홀수면 "입력하신 정수는 홀수입니다." 라고 출력하고,
        * 홀수가 아니면 "입력하신 정수는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
        * 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력되도록 한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        /* 조건식은 반드시 true 혹은 false가 나오도록 작성해야 함 */
        /* 짝수인지 조건 확인 */
        if(num % 2 != 0){

            /* 조건문이 참일 때 출력할 내용 */
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {

            /* 조건식이 거짓일 때 출력할 내용 */
            System.out.println("입력하신 정수는 짝수입니다.");
        }

        /* 조건문과 상관없이 프로그램 종료 시 출력할 내용 */
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfElseStatement(){

        /* 수업목표. 중첩된 if-else문의 흐름을 이해하고 적용할 수 있다. */
        /* 중첩된 if-else문 실행 흐름 확인 */
        /* if-else문 안에서 또 다른 조건을 사용하여 if-else문을 사용할 수 있다. */

        /* 숫자를 하나 입력받아 양수이면 "입력하신 숫자는 양수입니다."를 출력하고
        * 음수이면 "입력하신 숫자는 음수입니다." 출력
        * 단, 0이면 "0입니다." 라고 출력할 것
        * 조건과 상관없이 프로그램이 종료될 때 "프로그래믈 종료합니다." 라고 출력되도록 한다.
        * */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        /* 0인지 아닌지 조건 확인 */
        if(num != 0){

            /* 0인 경우 다시 한 번 조건을 비교 */
            /* 0보다 더 큰 숫자인지 확인 */
            if(num > 0){

                /* 0보다 더 큰 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 양수입니다.");
            } else {

                /* 0보다 더 작은 경우 출력할 내용 */
                System.out.println("입력하신 숫자는 음수입니다.");
            }
        } else {

            /* 0인 경우 출력할 내용 */
            System.out.println("입력하신 숫자는 0입니다.");
        }

        /* 조건문과 상관없이 프로그램 종료 시 출력할 내용 */
        System.out.println("프로그램을 종료합니다.");
    }
}

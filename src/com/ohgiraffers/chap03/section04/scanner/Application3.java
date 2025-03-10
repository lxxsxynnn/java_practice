package com.ohgiraffers.chap03.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. Scanner 사용 시 주의사항에 대해 이해하고 사용 시 주의사항을 고려하여 사용할 수 있다. */
        /*
        * Scanner의 next 메소드들은 입력한 내용을 버퍼로부터 토큰 단위로 분리해서 읽어옴
        * 그래서 크게 두 가지 사항을 주의해야 함
        * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
        * 2. 정수, 실수, 논리값 입력 수 next()로 문자열 입력 받을 때
        * */

        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때 */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();                //공백이나 개행문자 전까지를 읽어옴
        System.out.println("str1 : " + str1);

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();                //정수값을 읽어옴
        System.out.println("num1 : " + num1);

        /*
        * 여기까지 작성하고 나면 작성 상(compile 시)에는 문제되지 않음
        * 처음 실행할 때 문자열에 "안녕"이라고 입력하고 정수를 입력하면 정상적으로 동작함
        * 하지만 "안녕하세요 반갑습니다"를 입력하면 동작 시(Runtime) 숫자를 입력하기도 전에 InputMismatchException이 발생함
        *
        * "안녕하세요 반갑습니다" <- 입력 시 공백을 기준으로 두 개의 토큰 "안녕하세요"와 "반갑습니다"로 분리가 됨
        * next()는 다음 토큰인 "안녕하세요"를 읽었고, nextInt()는 다음 토큰을 정수로 읽어야 하는데 "반갑습니다"가 나옴
        * 정수를 입력해야 하는데 "반갑습니다"를 읽으면 당연히 InputMismatchException이 발생
        * 공백이 있는 문자열을 받을거면 nextLine()을 이용하자
        *
        * 혹은 입력받은 버퍼는 줄 단위로 토큰을 분리하기 때문에 해당 라인의 토큰을 다 읽고 다음 줄로 이동시키고 싶을 때는
        * 한 라인의 모든 토큰을 읽어오는 sc.nextLine(); 호출을 중간에 한 번 넣어줘도 해결은 됨
        * */

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()으로 문자열을 입력받을 때 */
        System.out.print("다시 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num2 : " + num2);

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");

        sc.nextLine();

        String str2 = sc.nextLine();
        System.out.println("str2 : " + str2);

        /*
        * 입력 받을 시 nextLine()을 호출한 것이 아직 행을 바꾸지 않고 한 라인을 읽어들인다고 판단해서 아무것도 읽지 못하고 넘어간 뒤
        * 다음 출력구문을 실행시킨 것
        * */
    }
}

package com.ohgiraffers.chap03.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. Scanner의 nextLine()과 next()에 대해 구분하여 사용할 수 있다. */
        /*
        * nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전까지 읽어서 문자열로 반환함(공백문자 포함)
        * next() : 공백문자나 개행문자 전까지를 읽어서 문자열로 반환함(공백문자 불포함)
        * */

        /* 1. Scanner 객체 생성 */
        Scanner sc = new Scanner(System.in);

        /* 2. 문자열 입력 */
        /* 2-1. nextLine() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();        //안녕하세요 반갑습니다. <- 입력

        System.out.println(greeting1);          //안녕하세요 반갑습니다.

        /* 2-2. next() */
        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();           //안녕하세요 반갑습니다. <- 입력

        System.out.println(greeting2);          //안녕하세요
    }
}

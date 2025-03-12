package com.ohgiraffers.chap05.section01.array;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.(1) */
        /* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보시오. */

        /* 5명의 자바 점수를 저장할 배열을 하나 할당 */
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        /* 반복문을 이용하여 배열 인덱스에 하나씩 접근해서 점수를 입력받음 */
        for(int i = 0; i < 5; i++){
            System.out.print((i + 1) + "번째 학생의 자바 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }

        /* 합계와 평균 구하기 */
        double sum = 0.0;
        double avg = 0.0;

        /* 합계는 모든 인덱스의 값을 sum 변수에 누적해서 담아줌 */
        for(int i = 0; i < 5; i++){
            sum += scores[i];
        }

        /* 평균은 합계를 구한 값에서 배열의 길이(갯수)를 나눔 */
        avg = sum / scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
}

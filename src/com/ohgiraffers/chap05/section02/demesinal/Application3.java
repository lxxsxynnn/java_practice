package com.ohgiraffers.chap05.section02.demesinal;

public class Application3 {

    public static void main(String[] args) {
        /* 수업목표. 2차원 가변 배열을 선언 및 할당하여 사용할 수 있다. */
        /* 1. 배열의 선언 및 할당 */
        /*
         * 가변 배열의 경우 각 인덱스 별 배열을 따로 할당을 해야만 함
         * 선언과 동시에 모든 배열을 할당할 수 없으며, 할당할 배열의 갯수만 지정하고 각 인덱스에 서로 다른 길이의 배열을 따로 할당해야 함
         * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][];
         * 변수명[배열 인덱스] = new 자료형[배열의 길이];
         * */
        /* 1-1. 주소를 관리하는 배열의 주소를 보관하기 위한 변수 선언 */
        int[][] iarr = new int[3][];

        /* 1-2. 주소를 관리하는 배열의 각 인덱스마다 배열을 할당하여 주소값 대입 */
        iarr[0] = new int[3];
        //iarr[1] = new char[2];        //자료형이 다른 배열은 하나로 묶어서 관리할 수 없음
        iarr[1] = new int[2];

        int[] arr = new int[5];
        iarr[2] = arr;                  //미리 할당해 둔 배열을 이용해서도 활용 가능

        /* 2. 각 배열의 인덱스마다 접근하여 값 대입 후 출력 */
        /* 2-1. 각 배열의 인덱스에 접근해서 값 대입 후 출력 */
        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
        //iarr[0][3] = 4;               //존재하지 않는 인덱스의 접근하는 경우 ArrayIndexOutOfBoundsException이 발생하기 때문에 주의

        iarr[1][0] = 4;
        iarr[1][1] = 5;

        iarr[2][0] = 6;                 //배열이 할당되어 있지 않는 경우 NullPointerException 발생
        iarr[2][1] = 7;
        iarr[2][2] = 8;
        iarr[2][3] = 9;
        iarr[2][4] = 10;

        //iarr[3][0] = 11;              //존재하지 않는 배열에 접근하는 경우에도 ArrayIndexOutOfBoundsException 발생

        /* 정변배열 출력할 때처럼 변수라고 생각하고 하나씩 값을 출력해보기 */
        System.out.print(iarr[0][0] + " ");
        System.out.print(iarr[0][1] + " ");
        System.out.print(iarr[0][2] + " ");

        System.out.println();

        System.out.print(iarr[1][0] + " ");
        System.out.print(iarr[1][1] + " ");

        System.out.println();

        System.out.print(iarr[2][0] + " ");
        System.out.print(iarr[2][1] + " ");
        System.out.print(iarr[2][2] + " ");
        System.out.print(iarr[2][3] + " ");
        System.out.println(iarr[2][4] + " ");

        System.out.println();

        /* 가변배열 역시 반복문을 이용해서 값을 대입하고 출력할 수 있음 */

        /* 2-2. 반복문을 이용하여 값 대입 후 출력 */
        /* 배열 인덱스마다 저장할 값이 보관될 변수 선언 */
        int value = 0;

        /* 모든 배열에 순차적으로 접근하는 반복문 */
        for (int i = 0; i < iarr.length; i++) {

            /* 배열마다 인덱스에 차례로 접근하는 반복문 */
            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = ++value;
            }
        }

        /* 모든 배열에 순차적으로 접근하는 반복문 */
        for(int i = 0; i < iarr.length; i++){

            /* 배열마다 인덱스에 차례로 접근하는 반복문 */
            for(int j = 0; j < iarr[i].length; j++){
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

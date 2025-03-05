package com.ohgiraffers.chap01.section05.typecasting;

public class Application3 {
    public static void main(String[] args){

        /* 수업목표. 자동 형변환과 강제 형변환을 이용해 서로 다른 자료형끼리 연산을 수행할 수 있다. */
        /*
        * 자동 형변환과  강제 형변환을 이용한 다른 자료형끼리의 연산
        * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리 됨
        * */
        int inum = 10;
        long lnum = 100;

        /*
        * 자바에서는 같은 자료형끼리만 연산이 가능함
        * 따라서 서로 자료형이 다른 두 자료를 연산할 때 자료형이 같아지도록 형변환을 해 주어야 함
        * */

        /* 1. 두 수의 연산 결과를 int 형으로 변환 후 int 자료형 변수에 리턴 받음 */
        //int isum = inum + lnum;       //두 자료형의 연산 결과는 큰 쪽 자료형인 long이 되고, long형 값은 int형 변수에 담길 수 없음
        int isum = (int) (inum + lnum);

        System.out.println("isum: " + isum);

        /* 2. long 형 값을 int로 강제 형변환 하기 */
        long isum2 = inum + (int) lnum;

        System.out.println("isum2: " + isum2);

        /* 3. long 형 값을 int로 강제 형변환 하기 */
        long lsum = inum + lnum;

        System.out.println("lsum: " + lsum);

        /* 주의사항. int 미만의 연산의 처리 결과는 int형 */
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        short shortNum1 = 3;
        short shortNum2 = 4;

        int result1 = byteNum1 + byteNum2;
        int result2 = byteNum1 + shortNum1;
        int result3 = shortNum1 + byteNum1;
        int result4 = shortNum1 + shortNum2;

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
        System.out.println("result4 : " + result4);
    }
}

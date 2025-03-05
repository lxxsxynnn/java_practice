package com.ohgiraffers.chap01.section02.variable;

public class Application2 {
    public static void main(String[] args) {
    /*
    * 변수를 사용하는 방법
    * 1. 변수를 준비한다. (선언)
    * 2. 변수에 값을 대입한다. (값 대입 및 초기화)
    * 3. 변수를 사용한다.
    * */

    /*
    * 1. 변수 준비(메모리에 값을 저장할 수 있는 공간을 만드는 행위-선언)
    * 1-1. 변수 선언 방법
    * 자료형 변수명;
    * */

    /* 1-1-1. 숫자를 취급하는 자료형 */
    /* 정수 */
    byte bnum; // 1 byte
    short snum; //2 byte
    int inum; // 4 byte
    long lnum; // 8 byte

    /* 실수 */
    float fnum; // 4 byte
    double dnum; // 8 byte

    /* 1-1-2. 문자를 취급하는 자료형 */
    char ch; // 2 byte
    char ch2; // 2 byte

    /* 1-1-3. 논리값을 취급하는 자료형 */
    boolean isTrue; // 1 byte

    /* 위 8가지를 기본 자료형이라고 하고 이를 제외한 나머지를 참조 자료형이라고 함 */

    /* 1-1-4. 문자열을 취급하는 자료형 */
    String str; // 4 byte

    /* 2. 변수에 값 대입(선언된 공간에 값을 대입/최초로 값을 대입하는 행위를 초기화라고 함) */

        /* 2-1. 정수를 취급하는 자료형에 값 대입 */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L; // 뒤에 대문자 L을 붙여야 함(형변환)

        /* 2-2. 실수를 취급하는 자료형에 값 대입 */
        fnum = 3.14f; // 실수 뒤에 'f'를 붙여야 함
        dnum = 8.0;

        /* 2-3. 문자를 취급하는 자료형에 값 대입 */
        ch = 'a';
        ch2 = 97; // 아스키코드 변환하면 a > 그래서 숫자로도 저장 가능

        /* 2-4. 논리를 취급하는 자료형에 값 대입 */
        isTrue = true;
        isTrue = false; // true 또는 false 중 한 가지의 값만 사용 가능

        /* 2-5. 문자열를 취급하는 자료형에 값 대입 */
        str = "안녕하세요";


        /*
        * 위에서는 변수 선언과 값 대입을 따로 했지만 동시에 수행도 가능
        * 선언과 동시에 초기화 한다고 함
        * */
        int point = 100;
        int bonus = 10;

     /*
     * 3. 변수 사용(호출)
     * */

        /* 3-1. 변수에 저장된 값 출력하기 */
        System.out.println("bnum의 값 : " + bnum);
        System.out.println("snum의 값 : " + snum);
        System.out.println("inum의 값 : " + inum);
        System.out.println("lnum의 값 : " + lnum);
        System.out.println("fnum의 값 : " + fnum);
        System.out.println("dnum의 값 : " + dnum);
        System.out.println("ch의 값 : " + ch);
        System.out.println("ch2 값 : " + ch2);
        System.out.println("isTrue의 값 : " + isTrue);
        System.out.println("str의 값 : " + str);

        /* 3-2. 변수를 이용해서 연산하기 */
        System.out.println("point와 bonus의 값은 : " + (point + bonus));

        /* 3-3. 대입연산자의 왼쪽과 오른쪽에 사용하기*/

        /* 대입연산자의 왼쪽은 공간이라는 의미, 오른쪽은 값이라는 의미 */
        point = point + 100;
        // point 라는 공간에 point가 가지고 있는 값에 +100을 하라는 의미
        System.out.println("point + 100 ? " + point);
    }
}

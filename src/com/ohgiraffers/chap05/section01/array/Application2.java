package com.ohgiraffers.chap05.section01.array;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 사용 방법을 익혀 배열을 사용할 수 있다. */
        /*
        * 배열의 사용 방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        /* 1. 배열의 선언 */
        /*
        * 자료형[] 변수명;
        * 자료형 변수명[];
        * 으로 선언할 수 있음
        * */

        /* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것 */
        int[] iarr;
        char carr[];

        /* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있음
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참고하여 사용하기 때문에 참조자료형(reference type)이라고 함
        * */

        /* 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 함 */
        //iarr = new int[];               //크기를 지정해 주지 않아서 에러 발생
        iarr = new int[5];
        carr = new char[10];

        /* 위의 선언과 할당을 동시에 할 수도 있음 */
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];

        /*
        * heap 메모리는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역
        * stack에 저장된 주소로 heap에 할당된 배열을 찾아갈 수 있음
        * */
        System.out.println("iarr : " + iarr2);          //16진수 주소값 출력
        System.out.println("carr : " + carr2);          //16진수 주소값 출력, 임의로 char[]을 문자열로 못 바꾼다는 의미인데 신경쓰지 않아도 됨

        /*
        * hashcode() : 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환함
        * 동일객체인지 비교할 때 사용할 목적으로 쓰여지며, 동등객체를 동일객체 취급하기 위한 용도로 overring 해서 사용함
        * */
        /* 이 부분은 뒤에서 다루게 되니, 그 전까지는 쉽게 주소값이라고 생각하고 사용할 것 */
        System.out.println("iarr의 hashcode : " + iarr2.hashCode());
        System.out.println("carr의 hashcode : " + carr2.hashCode());

        /* 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있음 */
        /*
        * 필드 또한 뒤에서 다루게 될 것(일종의 변수라고 보면 됨)
        * 참고로 String의 문자열 길이는 메소드로 제공하고 있기 때문에 length()로 사용함
        * */
        System.out.println("iarr2의 길이 : " + iarr2.length);
        System.out.println("carr2의 길이 : " + carr2.length);

        /* Scanner를 통해 입력받은 정수로 배열 길이를 지정하여 배열을 할당할 수 있음 */
        Scanner sc = new Scanner(System.in);

        System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();

        double[] darr = new double[size];

        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 길이 : " + darr.length);

        /* 하지만 한 번 지정한 배열의 크기는 변경 불가 */

        /* 배열의 사이즈를 변경한 것이 아니고 새로운 배열을 생성하여 그 주소값을 레퍼런스 변수에 덮어쓴 것 */
        darr = new double[30];

        /* hashcode를 보면 다른 값을 가지고 있는 것을 확인할 수 있음 */
        System.out.println("수정 후 darr의 hashcode : " + darr.hashCode());
        System.out.println("수정 후 darr의 길이 : " + darr.length);

        /*
        * 한 번 할당된 배열은 지울 수 없음
        * 다만 레퍼런스 변수를 null로 변경하여 더 이상 주소를 참조할 수 없게 된 배열은
        * 일정 시간이 지난 후 heap의 old 영역으로 이동하여 GC(Garbage Collector)가 삭제시킴
        * 한 번 찾아갈 수 있는 주소값을 잃어버린 배열은 다시 참조 불가능함
        * */
        darr = null;

        /*
        * NullPointerException 발생
        * 아무 것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 될 때 발생하는 에러
        * */
        System.out.println("삭제 후 darr의 길이 : " + darr.length);       //NullPointerException 발생
    }
}

package com.ohgiraffers.chap06.section07.kindsofvariable;

public class KindsOfVariable {//클래스 영역의 시작

    /* 수업목표. 다양한 변수를 이해하고 사용할 수 있음 */
    /*
    * 클래스 영역에 작성하는 변수를 필드라고 함
    * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
    * */

    /* non-static field를 인스턴스 변수라고 함 (인스턴스 생성 시점에 사용 가능한 변수라는 의미) */
    private int globalNum;

    /* static field를 정적 필드(클래스 변수)라고 함 (정적(클래스) 영역에 생성되는 변수라는 의미) */
    private static int staticNum;

    public void testMethod(int num){//메소드 영역의 시작

        /*
        * 메소드 영역에서 작성하는 변수를 지역변수라고 함
        * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 함
        * 매개변수도 일종의 지역변수로 생각하면 됨
        * 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack에 생성됨
        * */
        int localNum;

        System.out.println(num);        //매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요없음

        /* 지역변수는 선언 외에 다시 사용(호출)하기 위해 반드시 초기화가 되어야 함 */
        //System.out.println(localNum);

        System.out.println(globalNum);  //전역변수는 클래스 전역에서 사용 가능
        System.out.println(staticNum);
    }   //메소드 영역의 끝

    /* 새로운 메소드를 만들고 전역변수와 지역변수에 대한 접근 */
    public void testMethod2(){
        //System.out.println(localNum);     //지역변수는 해당 지역(블럭 내)에서만 사용 가능
        System.out.println(globalNum);      //전역변수는 다른 메소드에서도 사용 가능
        System.out.println(staticNum);
    }
}//클래스 영역의 끝

package com.ohgiraffers.chap06.section05.parameter;

public class Application {

    public static void main(String[] args){

        /* 수업목표. 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 메소드의 파라미터 선언부에는 다양한 종류의 값을 인자로 전달하며 호출할 수 있음 */

        /*
        * 매개변수(parameter)로 사용 가능한 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 기본 인자
        * */

        /* 파라미터 타입 별 호출 테스트 기능을 제공하는 ParameterTest 클래스 작성 후 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();

        /* 1. 기본 자료형을 매개변수로 전달받는 메소드 호출 확인 */
        /* 기본자료형 8가지 모두 가능 */
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        /* 기본자료형은 인자로 전달하는 값과 매개변수로 전달하는 값과 자료형이 동일 */

        /* 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);

        /* 메소드 호출 후 값 변경 확인 */
        System.out.print("변경 후 원본 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 3. 클래스 자료형 */
        /* 사각형의 가로, 세로의 길이를 저장할 Rectangle이라는 클래스를 하나 추가 */
        Rectangle r1 = new Rectangle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        /* 메소드 호출 후 값 변경 확인 */
        System.out.println("============ 변경 후 사각형의 넓이와 둘레 ============");
        r1.calcArea();
        r1.calcRound();

        /* 4. 클래스 자료형 배열은 뒤에서 다룸 */

        /* 5. 가변인자 */
        /* 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변 배열을 활용할 수 있음 */
        //pt.testVariableLengthArrayParameter();                //인자가 아무것도 없는 경우 에러 발생
        pt.testVariableLengthArrayParameter("홍길동");     //가변인자는 전달하지 않아도 됨
        pt.testVariableLengthArrayParameter("유관순", "볼링");   //가변인자 1개만 전달도 가능
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");   //여러 개도 전달 가능
        pt.testVariableLengthArrayParameter("신사임당", new String[] {"테니스", "서예", "떡썰기"}); //배열도 가능

        /* 가변인자는 메소드 오버라이딩 시 유의해야 함 */

        /*
        * 메소드를 오버로딩하고 다시 돌아오면 위에 작성한 호출 구문에 컴파일 에러가 발생
        * 둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성이 발생했기 때문에 에러가 나는 것
        * 이렇게 가변배열을 매개변수로 이용한 메소드는 모호성으로 인해 오버로딩하지 않는 것이 좋음
        * */
    }
}

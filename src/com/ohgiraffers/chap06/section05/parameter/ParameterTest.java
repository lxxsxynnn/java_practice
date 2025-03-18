package com.ohgiraffers.chap06.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){

        /*
        * 배열의 주소가 전달됨
        * 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가리킴(얕은 복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + iarr);

        /* 배열의 값 출력 */
        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 배열의 0번 인덱스에 값 변경 */
        iarr[0] = 99;

        /* 값 변경 후 배열의 값 출력 */
        System.out.print("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(Rectangle rectangle){

        /*
        * 인스턴스도 주소가 전달됨
        * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달받은 인스턴스는 서로 동일한 인스턴스를 가리킴(얕은 복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + rectangle);

        /* 사각형의 넓이와 둘레 출력 */
        System.out.println("============ 변경 전 사각형의 넓이와 둘레 ============");
        rectangle.calcArea();
        rectangle.calcRound();

        /* 사각형의 너비와 높이 변경 */
        rectangle.setWidth(100);        //자동 형변환 적용됨
        rectangle.setHeight(100);

        /* 변경 후 사각형의 넓이와 둘레 출력 */
        System.out.println("============ 변경 후 사각형의 넓이와 둘레 ============");
        rectangle.calcArea();
        rectangle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String...hobby){

        /*
        * 가변길이의 배열은 몇 개가 매개변수로 전달될지 모르는 상황이기에 이름과 구분하기 위해 뒤쪽에 작성해야 함
        * 앞쪽에 작성하는 경우 에러 발생
        * */

        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++){
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }

    /* 오버로딩 시 주의해야 함 */
//    public void testVariableLengthArrayParameter(String...hobby){
//
//        System.out.println("취미의 갯수 : " + hobby.length);
//        System.out.print("취미 : ");
//        for(int i = 0; i < hobby.length; i++){
//            System.out.print(hobby[i] + " ");
//        }
//        System.out.println();
//    }
}

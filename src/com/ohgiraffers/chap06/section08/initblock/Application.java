package com.ohgiraffers.chap06.section08.initblock;

public class Application {

    public static void main(String[] args){

        /* 수업목표. 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있음 */
        /*
        * 초기화 블럭
        * 복잡한 초기화를 수행할 수 있는 블럭을 제공하며, 인스턴스 초기화 블럭과 정적 초기화 블럭으로 구분됨
        * 1. 인스턴스 초기화 블럭
        *    : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행이 됨
        *      인스턴스를 호출하는 시점마다 호출됨
        *      인스턴스 변수를 초기화하며 정적 필드에는 실행 시점바다 값을 덮어씀
        *   {
        *       초기화 내용 작성
        *   }
        * 2. 정적 초기화 블럭
        *    : 클래스가 로드될 때 한 번 동작
        *      정적 필드를 초기화하며, 인스턴스 변수는 초기화하지 못함
        *   static{
        *       초기화 내용 작성
        *   }
        * */

        /* 인스턴스 생성 */
        Product product = new Product();

        /* 1. 자료형 별 기본값으로 초기화된 내용 확인 */
        System.out.println(product.getInformation());

        /* 2. 명시적 초기화로 필드 초기화 확인 */
        /* 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어씀 */
        System.out.println(product.getInformation());

        /* 3. 초기화 블럭으로 필드 초기화 확인 */
        /* 명시적 초기값을 Product 클래스에 작성하고 다시 실행하면 기본값을 명시적 초기값이 덮어씀 */
        System.out.println(product.getInformation());

        /* 4. 매개변수 있는 생성자를 이용한 초기화 확인 */
        Product product2 = new Product("대륙폰", 300000, "샤오미");
        System.out.println(product2.getInformation());

        /*
        * 여기서 알 수 있는 초기화 순서는
        * 인스턴스 변수 : 기본값 -> 명시적 초기값 -> 인스턴스 초기화 블럭 -> 생성자
        * 클래스 변수 : 기본값 -> 명시적 초기값 -> 정적 초기화 블럭 -> 인스턴스 초기화 블럭 -> 생성자
        * */
    }
}

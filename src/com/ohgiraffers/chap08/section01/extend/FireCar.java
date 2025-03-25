package com.ohgiraffers.chap08.section01.extend;

public class FireCar extends Car {

    /* 1. extends 키워드를 이요하여 Car 클래스 상속 */
    /*
    * Car 클래스를 부모클래스로 FireCar 클래스를 자식클래스로 사용할 것
    * 클래스 선언부에 extends Car 를 추가해서 Car 클래스를 상속받으면
    * FireCar는 부모클래스인 Car가 가지고 있는 모든 멤버들을 상속받음
    * 하지만 생성자는 상속받지 못함
    * 또한 부모가 가지고 있는 private 멤버는 접근이 불가능함
    *  */

    /* 기본생성자 */
    public FireCar() {

        /*
        * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가함
        * 부모의 기본 생성자를 호출하는 구문임
        * 해당 생성자가 호출될 시 가장 먼저 Car 클래스 호출 내용이 출력될 것
        * 명시적, 묵시적 전부 사용 가능
        * */
        super();

        System.out.println("FireCar 클래스의 기본 생성자 호출됨...");
    }

    /* 2. soundHorn() 오버라이딩 */
    /*
    * 소방차의 경적 소리가 너무 작아 조금 더 키워보기
    * 경적소리를 내는 용도의 메소드 선언부는 그대로 두되 소방차 쪽에서 재정의 해볼 것
    * */

    /*
    * @Override 어노테이션
    * JDK 1.5부터 추가된 문법으로 오버라이팅 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킴
    * (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
    * 오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 함
    * */
    @Override
    public void soundHorn(){

        if(isRunning()){

            /*
            * 주행 중인 상태를 확인해야 함
            * runningStatus는 private 필드이기에 해당 클래스에서 접근이 불가능
            * 부모가 가지고 있는 public or protected 멤버인 isRunning() 메소드를 사용해야 주행 중인 상태인지 확인할 수 있음
            * 혹은 Car 클래스의 runningStatus를 protected로 변경하면 사용 가능하지만, 권장되지는 않음(캠슐화 위배)
            * this.isRunning() 혹은 super.isRunning() 둘 다 사용 가능하며
            * 컴파일러는 기본적으로 this.을 자동으로 추가함
            * (super.을 명시적으로 사용해야 하는 상황도 존재함)
            * */
            System.out.println("삐용삐용삐용삐용~~~");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다~ 비켜요 비켜~~");
        }
    }

    /* 3. 물 뿌리는 기능 추가 */
    public void sprayWater(){

        /* 소방차는 추가적으로 물 뿌리는 기능을 수행할 수 있음 */
        System.out.println("불이 난 곳을 발견했습니다. 물을 뿌립니다 ========================>>>>");
    }
}

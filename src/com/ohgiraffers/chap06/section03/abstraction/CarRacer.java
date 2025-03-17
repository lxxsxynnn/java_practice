package com.ohgiraffers.chap06.section03.abstraction;

public class CarRacer {

    /*
    * private : 외부에서는 Car에 접근할 수 없게 접근제한자로 막아둠
    * final : 한 번 Car를 생성하고 나면 더 이상 변경하지 못하도록 막아둠
    * */
    private final Car car = new Car();

    /* public 메소드 생성 -> 인터페이스(외부와 접점이 있는 매개체) */
    public void startUp(){
        car.startUp();
    }

    public void stepAccelerator(){
        car.go();
    }

    public void stepBreak(){
        car.stop();
    }

    public void turnOff(){
        car.turnOff();
    }
}

package com.ohgiraffers.chap06.section03.abstraction;

public class Car {

    private boolean isOn;           //초기에는 시동이 꺼진 false 상태
    private int speed;

    /* 시동이 걸려있는 상태인 경우에는 할 일이 없고, 시동이 걸려있지 않은 상태인 경우 시동을 검 */
    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
        }
    }

    /* 시동이 걸린 상태인 경우에만 호출시 마다 10km/h씩 속도를 증가시킴 */
    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 움직입니다.");
            speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + " km/h 입니다.");
        } else {
            System.out.println("차의 시동이 걸려있지 않았습니다. 먼저 시동을 걸어주세요.");
        }
    }

    /* 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있음 */
    public void stop(){
        if(isOn){
            if(this.speed > 0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("차의 시동이 걸려있지 않았습니다. 먼저 시동을 걸어주세요.");
        }
    }

    /* 시동이 걸려있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없음 */
    public void turnOff(){
        if(isOn){
            if(this.speed > 0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 우선 차를 멈춰주세요.");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 걸어주세요.");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요.");
        }
    }
}

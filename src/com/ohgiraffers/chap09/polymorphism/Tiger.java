package com.ohgiraffers.chap09.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어먹습니다.");
    }

    @Override
    public void run(){
        System.out.println("호랑이는 웬만해선 달리지 않습니다. 어슬렁어슬렁 걸어갑니다.");
    }

    @Override
    public void cry(){
        System.out.println("호랑이가 울부짖습니다. 어흥~~");
    }

    /* 호랑이는 추가적으로 물어뜯기를 할 수 있음 */
    public void bite(){
        System.out.println("호랑이가 물어뜯습니다. 앙!");
    }
}

package com.ohgiraffers.chap09.polymorphism;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 리턴타입에 활용할 수 있다. */
        /* 랜덤한 동물 인스턴스를 반환받을 것 */
        /* 1. getRandomAnimal() 추가 */

        /* 2. getRandomAnimal() 호출 */
        Application4 app4 = new Application4();

        Animal randomAnimal = app4.getRandomAnimal();
        randomAnimal.cry();

        /* 다형성을 적용하지 않고 반환받으려면 호랑이를 리턴받는 메소드와 토끼를 리턴받는 메소드를 따로 만들어야 함 */
    }

    public Animal getRandomAnimal() {

        int random = (int) (Math.random() * 2);

        return random == 0? new Rabbit(): new Tiger();
    }
}

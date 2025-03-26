package com.ohgiraffers.chap09.polymorphism;

public class Application3 {

    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 매개변수에 활용할 수 있다. */
        /* 1. 하단에 feed() 메소드 작성 */

        /* 2. feed() 메소드 호출 */
        Application3 app3 = new Application3();

        /* Animal 타입의 토끼와 호랑이 인스턴스를 만들어서 먹이를 줌 */
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        app3.feed(animal1);
        app3.feed(animal2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();

        app3.feed((Animal) animal3);    //명시적 형변환
        app3.feed((Animal) animal4);

        app3.feed(animal3);             //묵시적 형변환
        app3.feed(animal4);

        /* 인스턴스를 생성하며 바로 묵시적 형변환을 이용해 전달할 수도 있음 */
        app3.feed(new Rabbit());
        app3.feed(new Tiger());

        /* 다형성을 적용하지 않았다면 호랑이에게 먹이를 주는 메소드와 토끼에게 먹이를 주는 메소드를 별도로 작성해야 했을 것 */
    }

    public void feed(Animal animal){

        animal.eat();
    }
}

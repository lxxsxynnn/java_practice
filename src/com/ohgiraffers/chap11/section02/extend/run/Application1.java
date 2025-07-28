package com.ohgiraffers.chap11.section02.extend.run;

import com.ohgiraffers.chap11.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. extends 키워드를 이용하여 특정 타입만 사용하도록 제너릭 범위를 제한할 수 있다. */
        /*
        * 제너릭 클래스 작성 시 extends 키워드를 이용하면
        * 특정 타입만 사용하도록 제한을 걸 수 있다.
        * */

        /*
        * 토끼의 후손이거나 토끼인 경우에만 타입으로 사용 가능하다.
        * 그 외의 타입으로 타입 지정 시 컴파일 단계에서 에러를 발생시킨다.
        * */
        /* Animal 타입으로는 제너릭 클래스 인스턴스 생성이 불가능하다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();

        /* Mammal 타입으로는 제너릭 클래스 인스턴스 생성이 불가능하다. */
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();

        /* 전혀 다른 타입을 이용해서도 인스턴스 생성이 불가능하다. */
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        /* Rabbit 타입이나 Rabbit의 후손으로는 인스턴스 생성이 가능하다. */
        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 =  new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 =  new RabbitFarm<>();

        /* setter를 이용할 때에도 올바른 타입의 인스턴스를 인자로 전달해야 한다. */
//        farm4.setAnimal(new Snake());

        /*
        * 하지만 Rabbit이나 Rabbit의 후손타입으로는 가능하다.
        * 제너릭을 사용해서 올바른 타입을 타입변수로 지정하는 경우에는
        * 인스턴스 내부에 있는 타입 자체가 Rabbit 타입을 가지고 있는 것이
        * 보장되어 있기 때문에 형변환 생략이 가능하다.
        * */
        farm4.setAnimal(new Rabbit());
        ((Rabbit) farm4.getAnimal()).cry();
        farm4.getAnimal().cry();        //형변환 생략 가능

        farm5.setAnimal(new Bunny());
        ((Bunny) farm5.getAnimal()).cry();
        farm5.getAnimal().cry();        //형변환 생략 가능

        farm6.setAnimal(new DrunkenBunny());
        ((Bunny) farm6.getAnimal()).cry();
        farm6.getAnimal().cry();        //형변환 생략 가능
    }
}

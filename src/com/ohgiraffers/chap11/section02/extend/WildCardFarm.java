package com.ohgiraffers.chap11.section02.extend;

public class WildCardFarm {

    /* 매개변수로 전달받는 토끼농장을 구현할 떄 사용한 타입변수에 대해 제한할 수 있다. */

    /* 토끼농장에 있는 토끼가 어떤 토끼이던 상관없다. */
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    /* 토끼농장의 토끼는 Bunny이거나 그 후손타입으로 만들어진 토끼농장만 매개변수로 사용 가능 */
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    /* 토끼농장의 토끼는 Bunny이거나 그 부모 타입으로 만들어진 토끼농장만 매개변수로 사용 가능 */
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }
}

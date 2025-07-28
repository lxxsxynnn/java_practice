package com.ohgiraffers.chap11.section02.extend;

public class Bunny extends Rabbit{

    /* 버니도 토끼이다. Rabbit을 상속받는다. */

    /* cry() 메소드를 오버라이딩 하자 */
    @Override
    public void cry(){
        System.out.println("바니바니 바니바니 당근당근");
    }

    /* 버니를 상속받는 DrunkenBunny를 하나 더 만들자 */
}

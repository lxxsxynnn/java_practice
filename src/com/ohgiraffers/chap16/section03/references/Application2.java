package com.ohgiraffers.chap16.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 생성자 메서드 참조를 이해하고 사용할 수 있다. */
        /* 생성자도 메서드 참조를 할 수 있다. */
        Function<String, Account> function = Account::new;

        Account account1 = function.apply("홍길동");
        Account account2 = function.apply("유관순");

        System.out.println(account1);
        System.out.println(account2);
    }
}

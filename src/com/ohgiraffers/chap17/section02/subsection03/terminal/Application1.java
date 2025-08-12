package com.ohgiraffers.chap17.section02.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 최종 연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
        /*
        * Calculationg
        * 스트림에서는 다양한 메서드를 제공하는데, 먼저 최소/최대/총합/평균 등과 같은 결과를 알아보자.
        * */
        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        /* OptionalInt는 결과 없음을 나타내야 하는 명확한 요구가 있는 메서드 반환 형식으로 사용하기 위한 타입이다. */
        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt min = IntStream.range(1, 10).min();

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        int oddSum = IntStream
                        .range(1, 10)
                        .filter(i -> i % 2 ==1)
                        .sum();
        System.out.println("oddSum : " + oddSum);
    }
}

package com.ohgiraffers.chap12.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. LinkedHashSet에 대해 이해하고 사용할 수 있다. */
        /*
        * LinkedHashSet 클래스
        * HashSet이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * JDK 1.4부터 제공하고 있다.
        * */
        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");

        System.out.println("lhset : " + lhset);

        /* 오름차순 정렬을 원하면 같은 클래스 타입일 때에만 가능함 */

        /*
        * 만들어진 LinkedHashSet을 가지고 TreeSet으로 객체를 생성하면
        * 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬한다.
        * */
        TreeSet<String> tset = new TreeSet<>(lhset);
        System.out.println("tset : " + tset);
    }
}

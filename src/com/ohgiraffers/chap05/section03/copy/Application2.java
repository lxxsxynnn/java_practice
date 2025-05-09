package com.ohgiraffers.chap05.section03.copy;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */
        /*
        * 얕은 복사의 활용
        * 얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용함
        * */

        String[] names = {"홍길동", "유관순", "이순신"};

        /* 얕은 복사 확인을 위한 hashcode 출력 */
        System.out.println("names의 hashcode : " + names.hashCode());

        /*
        * 배열을 매개변수로 전달받는 출력기능을 하는 메소드 추가
        * 출력해보면 동일한 hashcode를 가지는 것을 볼 수 있음
        * 이처럼 다른 메소드에서 동일한 배열(객체)를 사용하도록 하고 싶은 경우 얕은 복사를 이용함
        * */

        /* 1. 인자와 매개변수로 활용 */
        print(names);

        /* 2. 리턴값으로 활용 */
        String[] animals = getAnimals();

        /* 리턴받은 결과도 얕은 복사인 것을 출력해보면 알 수 있음 */
        System.out.println("리턴 받은 animals의 hashcode : " + animals.hashCode());

        print(animals);
    }

    public static void print(String[] sarr){

        /* 전달받은 배열의 hashcode 출력 */
        System.out.println("sarr의 hashcode : " + sarr.hashCode());

        /* 전달받은 배열의 값 출력 */
        for(int i = 0; i < sarr.length; i++){
            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }

    public static String[] getAnimals(){
        String[] animals = new String[]{"낙타", "호랑이", "나무늘보"};

        /* 얕은 복사 확인을 위해 hashcode 출력 */
        System.out.println("새로 만든 animal의 hashcode : " + animals.hashCode());

        return animals;
    }
}

package com.ohgiraffers.chap05.section01.array;

public class Application5 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용할 수 있다.(2) */
        /* 랜덤한 카드를 한 장 뽑아서 출력해보자 */
        /* 먼저 모양과 카드 숫자 별로 값을 저장할 두 종류의 배열을 만들자 */
        String[] shapes = new String[] {"♠\uFE0E", "♣\uFE0E", "♥\uFE0E", "♦\uFE0E"};
        String[] cardNumbers = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};

        /* 배열 인덱스 범위 난수 발생 */
        int randomShapeIndex = (int)(Math.random() * shapes.length);
        int randomCardNumberIndex = (int)(Math.random() * cardNumbers.length);

        /* index를 이용해서 출력 */
        System.out.println("당신이 뽑은 카드는 " + shapes[randomShapeIndex] + cardNumbers[randomCardNumberIndex] + "입니다.");
    }
}

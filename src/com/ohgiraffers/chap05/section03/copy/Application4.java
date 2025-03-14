package com.ohgiraffers.chap05.section03.copy;

public class Application4 {

    public static void main(String[] args) {

        /* 수업목표. 배열의 깊은 복사를 사용한 자바 문법을 이해하고 이를 활용할 수 있다. */
        /*
        * 깊은 복사는 원본과 복사본 중 둘 중 한 가지 값을 변경해도 다른 하나에 영향을 주지 않음
        * 같은 값을 가지고 있는 서로 다른 배열이기 떄문
        * */
        /* 이러한 깊은 복사의 특성을 이용하는 자바의 구문이 있음 */

        /* 두 개의 같은 값을 가지는 배열을 만들기(깊은 복사) */
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        /* 각 배열의 인덱스에 10씩 누적 증가 시킴 */
        for(int i = 0; i< arr1.length; i++){
            arr1[i] += 10;
        }

        /* 반복문을 이용한 값 출력 */
        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i] + " ");        //정상적으로 10씩 증가된 값을 가지고 있음
        }
        System.out.println();

        /*
        * 향상된 for문 : jdk 1.5 버전부터 추가됨
        * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 반복문을 실행
        * */
        /* 값에 10씩 값을 누적시켜서 확인 */
        for(int i : arr2){      //for(꺼낼 값:탐색할 범위)
            i += 10;
        }

        for(int i = 0; i< arr2.length; i++){
            System.out.print(arr2[i] + " ");        //증가되지 않고 있음. 인덱스에 접근해서 값을 변경한 게 아니고 꺼낸 값을 복사해서 쓴 것
        }
        System.out.println();

        /*
        * 주의: 향상된 for문은 배열의 인덱스에 차례로 접근할 때는 편하게 사용할 수 있지만 값 변경은 불가
        * 변경하는 것이 아니고 사용하는 것이 목적일 때 편하게 사용 가능
        * */
        for(int i : arr2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

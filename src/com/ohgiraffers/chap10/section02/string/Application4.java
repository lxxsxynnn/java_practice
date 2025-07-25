package com.ohgiraffers.chap10.section02.string;

public class Application4 {
    public static void main(String[] args) {
        /* 수업목표. 이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다. */
        /*
        * 이스케이프(escape) 문자
        * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 쓰는 문자이다.
        * 이스케이프 문자          의미
        *      \n           개행(줄바꿈)
        *      \t           탭
        *      \'           작은 따옴표
        *      \"           큰 따옴표
        *      \\           역슬래쉬 표시
        * */

        /* 개행 문자 */
        System.out.println("안녕하세요.\n저는 홍길동입니다.");

        /* 탭 문자 */
        System.out.println("안녕하세요.\t저는 홍길동입니다.");

        /* 홑따옴표 문자 */
        System.out.println("안녕하세요. 저는 '홍길동'입니다.");      //이스케이프 문자 쓰지 않아도 됨
//        System.out.println(''');        //에러남     //홑따옴표 문자와 문자 리터럴 기호가 중복됨
        System.out.println('\'');         //하지만 홑따옴표 문자를 쓸 때는 이스케이프 문자를 사용해야 함

        /* 쌍따옴표 문자 */
//        System.out.println("안녕하세요. 저는 "홍길동" 입니다.");   //문자열 리터럴과 중복되어 에러남
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");    //이스케이프 문자 사용해야 함

        /* 역슬래쉬 문자 */
//        System.out.println("안녕하세요. 저는 \홍길동\ 입니다.");   //역슬래쉬를 표현하고 싶지안 에러 발생(이스케이프 문자)
        System.out.println("안녕하세요. 저는 \\홍길동\\ 입니다.");   //이스케이프 문자 사용해야 함

        /*
        * split 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
        * 이스케이프 문자 사용 안하는 특수문자
        * ~ ` ! @ # % & - _ = ; : ' \ " , < > /
        * 이스케이프 문자를 사용하는 특수문자(\\)
        * $ ^ * ( ) + | { } [ ] . ?
        *
        * (앞에 \\ 붙여야 한다.
        * 정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
        * 따라서 $를 기준으로 split하기 위해서는 정규표현식 문자가 아닌 $라는 구분자로 split하겠다는 의미로
        * 구분문자를 \$로 표현해야 한다.
        * 하지만, 역슬래쉬가 위에서 배운 이스케이프 문자의 역슬래쉬와 겹친다.
        * 따라서 \\$로 해야 역슬래쉬 + $로 인식해서 정규표현식을 탈출하는 문자가 된다.)
        */

        /* 아래 구문에서 구분자를 바꿔가며 몇 가지 테스트 해보자 */
        String str = "java$oracle$jdbc";
        String[] sarr = str.split("\\$");

        for(String s : sarr){
            System.out.println(s);
        }
    }
}

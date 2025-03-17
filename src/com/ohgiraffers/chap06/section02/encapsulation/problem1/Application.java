package com.ohgiraffers.chap06.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args){

        /* 수업목표. 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 이해할 수 있다.(1) */
        /* 필드에 올바르지 않은 값이 들어가도 통제가 불가능해짐 */

        /* 1번 몬스터 생성 */
        Monster monster1 = new Monster();
        /* 몬스터의 이름과 체력 변경 */
        monster1.name = "두치";
        monster1.hp = 200;

        /* 몬스터 정보 출력 */
        System.out.println("monster1's name: " + monster1.name);
        System.out.println("monster1's hp: " + monster1.hp);

        /* 2번 몬스터 생성 */
        Monster monster2 = new Monster();
        /* 몬스터의 이름과 체력 변경 */
        monster2.name = "뿌꾸";
        /* 몬스터2의 체력을 음수로 지정 */
        monster2.hp = -200;

        System.out.println("monster2's name: " + monster2.name);
        System.out.println("monster2's hp: " + monster2.hp);

        /*
        * 이처럼 검증되지 않은 값을 넣을 때 문제가 발생할 수 있음
        * 이를 해결하기 위해 Monster 클래스를 수정해보기
        * */

        /* 3번 몬스터 생성 */
        Monster monster3 = new Monster();
        monster3.name = "드라큘라";
        monster3.setHp(200);

        /*
        * 메소드를 이용해서 객체의 hp값을 변경할 수도 있음
        * 양수로 정상 입력된 경우
        * */
        System.out.println("monster3's name: " + monster3.name);
        System.out.println("monster3's hp: " + monster3.hp);

        /* 음수 입력을 제한하는지 확인하도록 4번 몬스터 한 마리 더 생성 */
        Monster monster4 = new Monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        /*
        * 출력해보면 hp가 적어도 음수로 나오지 않게 됨
        * 이렇게 잘못된 값을 검증하여 필드값을 수정하는 기능으로 위에서 발생하는 문제를 해결하였음
        * */
        System.out.println("monster4's name: " + monster4.name);
        System.out.println("monster4's hp: " + monster4.hp);
    }
}

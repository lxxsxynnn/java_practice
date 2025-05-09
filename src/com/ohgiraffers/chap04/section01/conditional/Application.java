package com.ohgiraffers.chap04.section01.conditional;

public class Application {
    public static void main(String[] args) {

        /* 여기서 테스트할 클래스들은 클래스 네이밍 규칙에 어긋나지만 정렬을 위해 이름 지은 것
        * 모든 메소드는 해당 메소드 내에서 호출할 것이기 때문에 하나 확인 후
        * 다음 메소드를 호출해 다른 것을 확인할 때 주석처리 해서 매번 실행되지 않도록 할 것
        * */
        A_if a = new A_if();
        /* 단독 if문 흐름 확인용 메소드 호출 */
        //a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 호출 */
        //a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        /* 단독 if-else문 흐름 확인용 메소드 호출 */
        //b.testSimpleIfElseStatement();

        /* 중첩 if-else문 흐름 확인용 메소드 호출 */
        //b.testNestedIfElseStatement();

        C_ifElseif c = new C_ifElseif();
        /* 단독 if-else-if문 흐름 확인용 메소드 호출 */
        //c.testSimpleIfElseifStatement();

        /* 중첩 if-else-if문 흐름 확인용 메소드 호출 */
        //c.testNestedIfElseifStatement();

        /* 중첩 if-else-if문 로직 개선 */
        //c.improvedNestedIfElseifStatement();

        D_switch d = new D_switch();
        /* switch문 흐름 확인용 메소드 호출 */
        //d.testSimpleSwitchStatement();

        /* 문자열값 비교 및 break 테스트 */
        d.testSwitchVendingMachine();
    }
}

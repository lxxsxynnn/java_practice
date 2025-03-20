package com.ohgiraffers.chap06.section06.singleton;

public class LazySingleton {

    /* 클래스가 초기화되는 시점에서는 정적 필드를 선언해두고 null로 초기화됨 */
    private static LazySingleton lazy;

    /* 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한함 */
    private LazySingleton() {}

    /* public 인터페이스를 인스턴스로 반환하도록 함 */
    public static LazySingleton getInstance() {

        /*
        * 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
        * 생성한 인스턴스가 있는 경우 만들어둔 인스턴스를 반환함
        * */
        if (lazy == null) {
            /* 인스턴스를 생성한 적이 없는 경우 새로운 인스턴스 생성 */
            lazy = new LazySingleton();
        }

        return lazy;
    }
}

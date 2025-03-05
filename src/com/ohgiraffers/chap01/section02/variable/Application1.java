package com.ohgiraffers.chap01.section02.variable;

public class Application1 {

    /*
    * 변수의 사용 목적
    * 1. 값에 의미를 부여하기 위해(의미 전달이 쉬워야 코드를 읽기 쉬워짐, 협업 및 유지보수에도 용이)
    * 2. 한 번 저장해둔 값을 재사용하기 위해(변수를 이용하여 코드를 작성하면 값을 변경할 때도 간편하게 변경 가능
    * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있음 ( => 변하는 값을 사용하기 위한 공간)
    * */

    public static void main(String[] args) {

        /* 1. 값에 의미 부여 */
        System.out.println("보너스를 표현한 급여 : " + (1000000 + 200000) + "원");
        /* 위와 같이 작성하면 어느 값이 보너스이고 어느 값이 급여인지 확인 불가 */

        int salary = 0;
        int bonus = 0;

        System.out.println("보너스를 포함한 급여" + (salary + bonus) + "원");
        /* 이렇게 의미를 부여하면 어느 값이 급여이고 보너스인지 구분 가능 */

        /* 2. 한 번 저장해둔 값을 재사용 */
        System.out.println("1번 고객에게 포인트를 " + 100 + " 포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + 100 + " 포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + 100 + " 포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + 100 + " 포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + 100 + " 포인트 지급하였습니다.");

        /* 여기서 포인트가 1000이 된다면? 모든 고객에 대해 값을 수정해야 함 */

        int point = 1000;
        System.out.println("1번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("2번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("3번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("4번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");
        System.out.println("5번 고객에게 포인트를 " + point + " 포인트 지급하였습니다.");

        /* 데이터가 5줄이 아니라 5만줄이 되면? > 값을 저장해두고 그 값만 수정해서 전체를 바꾸는 게 더 빠르고 효율적 */

        /* 3. 시간에 따라 변경되는 값을 저장하고 사용*/
        /* 변수는 하나의 값을 저장하고 사용하기 위한 공간보다는 변하는 값을 저장하는 공간에 가까움 */
        int sum = 0;

        sum += 10;
        System.out.println("sum = " + sum);
        sum += 10;
        System.out.println("sum = " + sum);
        sum += 10;
        System.out.println("sum = " + sum);

        /* 동일한 sum 이라는 변수를 출력했지만 시점에 따라  수행된 연산에 결과가 달라지면서 sum의 값이 달라짐*/

    }
}

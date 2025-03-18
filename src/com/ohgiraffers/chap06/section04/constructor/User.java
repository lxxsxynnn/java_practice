package com.ohgiraffers.chap06.section04.constructor;

public class User {

    private String id;

    private String pwd;

    private String name;

    private java.util.Date enrollDate;          //필드로 다른 클래스 자료형도 사용할 수 있음(ex. String)

    /*
    * 생성자의 작성 위치
    * 작성 위치는 문법상으로는 클래스 내부에 작성하면 되지만,
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례
    * */

    /*
    * 생성자의 사용 목적
    * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용
    * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하며 인스턴스를 생성할 목적으로 주요 사용됨
    * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가짐
    *    따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수도 있음(초기값 전달 강제화)
    * */

    /* 1. 기본 생성자(Default Constructor) */
    public User(){

        /*
        * 수행할 내용이 아무 것도 존재하지 않음
        * 호출 확인을 위해 출력 구문만 작성해보기
        * 메소드와 같이 수행할 명령들을 작성할 수 있음
        * */
        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    /* 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능(Compile Error) */
    //public User(){}

    /* 2. 매개변수가 있는 생성자 */
    /* 초기화할 필드가 여러 개인 경우, 초기화하고 싶은 필드의 갯수 별로 생성자를 여러 개 준비해둘 수 있음 */
    /* id, pwd, name의 초기화를 담당할 생성자 */
    public User(String id, String pwd, String name){

        /*
        * 동일한 이름의 생성자는 작성하지 못한다고 했는데 작성됨
        * 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자 혹은 메소드를
        * 한 클래스 내에 여러 개 작성할 수 있게 만든 기술(오버로딩)
        * 오버로딩 부분은 뒤에 별도의 챕터에서 다시 다루고 우선 지금은 매개변수 있는 생성자의 역할에 대해 알아보자
        * */

        /* 매개변수가 있는 생성자의 주 목적은 인스턴스 생성 시점에 매개변수로 전달받은 값을 이용해서 필드를 초기화함 */
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함...");
    }

    /* 3. id, pwd, name, enrollDate의 초기화를 담당할 생성자(모든 필드를 초기화하는 생성자) */
    public User(String id, String pwd, String name, java.util.Date enrollDate){

        /* 매개변수로 전달받은 값을 이용해 모든 필드를 초기화함 */
        /* 3-1. 각 필드에 접근하여 초기화 */
//        this.id = id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /* 3-2. 사전에 작성되어 있는 다른 생성자 함수를 이용하여 초기화 */
        /*
        * id, pwd, name 필드를 초기화하는 기능을 가진 생성자를 바로 위에서 작성했었음
        * 따라서 중복되는 초기화 내용이 발생하게 되는데, 이 중복되는 초기화 내용을 줄여서 작성할 수 있음
        * */

        /*
        * this() 사용하기
        * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문
        * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀함(메소드와 동일)
        * 리턴되어 돌아오지만 리턴값은 존재하지 않음
        * this()는 가장 첫 줄에 선언해야 하며, 그렇지 않은 경우 Compile Error가 발생함
        * */
        this(id, pwd, name);            //미리 작성한 세 개의 필드를 초기화하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;

        System.out.println("User 클래스의 모든 필드를 초기화하는 생성자 호출함...");
    }

    /* 4. 복사 생성자 */
    /*
    * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드값을 이용해서 새로운 인스턴스 생성 시 초기화 값으로 이용할 수 있음
    * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로 다른 주소값을 가지게 됨(깊은 복사)
    * */
    public User(User otherUser){

        /* 매개변수로 전달받은 인스턴스의 주소로 접근한 필드의 값을 이용해 새롭게 할당하는 필드 값을 초기화함 */
        /* 4-1. 모든 필드에 직접 접근하여 초기화 */
//        this.id = otherUser.id;
//        this.pwd = otherUser.pwd;
//        this.name = otherUser.name;
//        this.enrollDate = otherUser.enrollDate;

        /* 4-2. 기존에 작성된 생성자를 호출하여 초기화(this() 사용) */
        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);

        System.out.println("User 클래스의 복사생성자 호출함...");

        /* this의 주소와 otherUser의 주소가 서로 다른지 확인 */
        System.out.println("this의 hashcode : " + this.hashCode());
        System.out.println("otherUser의 hashcode : " + otherUser.hashCode());
    }

    public String getInformation(){

        return "User [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }
}

package com.ohgiraffers.chap06.section03.dto;

public class MemberDTO {
    private int number;                     //회원번호
    private String name;                    //회원명
    private int age;                        //나이
    private char gender;                    //성별
    private double height;                  //키
    private double weight;                  //몸무게
    private boolean isActivated;              //회원탈퇴여부(활성화여부)

    /*
    * 이렇게 필드만 만들고나면 private로 접근이 제한되기 때문에 각 영역에 접근할 수 없음
    * public으로 접근을 허용하는 설정자/접근자를 이용해 필드에 간접적으로 접근할 수 있도록 할 것
    * */

    /*
    * 설정자(setter)/접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재함
    * 설정자(setter) 작성 규칙
    * : 필드값을 변경할 목적의 매개변수를 변경하려는 필드와 같은 자료형으로 선언하고
    *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경함
    *   [표현식]
    *   public void set필드명(매개변수){
    *       필드 = 매개변수;
    *   }
    *   [작성예시]
    *   public void setName(String name){
    *       this.name = name;
    *   }
    * */

    /*
    * 접근자(getter) 작성 규칙
    * : 필드의 값을 반환 받을 목적의 메소드 집합을 의미
    *   각 접근자는 하나의 필드에만 접근하도록 함
    *   [표현식]
    *   public 반환형 get필드명(){
    *       return 반환값;
    *   }
    *   [작성예시]
    *   public String getName(){
    *       return this.name;
    *   }
    * */

    /* 설정자(setter) 메소드 */
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean isActivated) {
        this.isActivated = isActivated;
    }

    /* 접근자(getter) 메소드 */
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    /* boolean의 접근자는 get으로 시작하지 않고 is로 시작하는 것이 일반적인 관례 */
    public boolean isActivated() {
        return isActivated;
    }
}

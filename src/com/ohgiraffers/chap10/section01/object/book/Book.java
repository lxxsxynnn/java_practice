package com.ohgiraffers.chap10.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    /* 기본 생성자 */
    public Book(){}

    /* 모든 필드를 초기화하는 생성자 */
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /* setter/getter */
    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    /* 1. toString() 오버라이딩 */
    @Override
    public String toString() {
        return "BookVO [number=" + this.number
                + ", title=" + title
                + ", author=" + author
                + ", price=" + price
                + "]";
    }

    /* 2. equals() 오버라이딩 */
    @Override
    public boolean equals(Object obj) {

        /* 두 인스턴스의 주소가 같으면 이후 다른 내용을 비교할 것 없이 true를 반환 */
        if(this == obj){
            return true;
        }

        /*
        * this는 인스턴스가 생성되면 주소값이 저장됨 null일 수 없음
        * 따라서 전달받은 레퍼런스 변수에 null 값이 저장되어 있다면
        * 비교하려는 두 개의 인스턴스는 서로 다른 인스턴스임
        * */
        if(obj == null){
            return false;
        }

        /* 전달받은 레퍼런스 변수를 Book 타입으로 형변환하여 각 필드별로 비교를 시작함 */
        Book other = (Book) obj;

        /* number 필드의 값이 서로 같지 않은 경우 서로 다른 인스턴스임 */
        if(this.number != other.number){
            return false;
        }

        /*
        * title 필드의 값이 null인 경우
        * 매개변수로 전달받은 인스턴스의 title 필드에도 null이 저장되어 있어야 서로 같은 값을 가짐
        * 그렇지 않은 경우 false를 리턴하고 종료함
        * */
        if(this.title == null){

            /* title 필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false 반환 */
            if(other.title != null){
                return false;
            }
        } else if(!this.title.equals(other.title)){

            /*
            * String 클래스의 equals()는 이미 해당 기능을 오버라이딩 해두었기 때문에
            * 같은 값을 가지는 지 비교함
            * */

            /*
            * title 필드가 null이 아닌 경우
            * 두 인스턴스의 title 필드값이 같아야 함
            * 그렇지 않은 경우 false 반환
            * */
            return false;
        }

        /* 작가의 경우도 마찬가지로 비교함 */
        if(this.author == null){

            if(other.author != null){
                return false;
            }

        } else if(!this.author.equals(other.author)){

            return false;
        }

        /* price 필드가 서로 다른 값을 가지면 false 반환 */
        if(this.price != other.price){
            return false;
        }

        /* 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true 반환 */
        return true;
    }

    /* 3. hashCode() 오버라이딩 */
    @Override
    public int hashCode() {

        /* 곱셈 연산을 누적시켜야 하기 때문에 0이 아닌 값으로 초기화 */
        int result = 1;

        /*
        * 필드마다 곱해줄 소수값을 선언
        * 31은 소수이기 때문에 연산 시 동일한 hashCode값이 나오지 않을 확률을 증가시킴
        * 31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값임
        * */
        final int PRIME = 31;

        /*
        * 31과 필드값을 이용하여 새로운 hashCode를 연산함
        * 여기서 포인트는 필드값이 같은 경우 동일한 hashCode를 반환하면 됨
        * */
        result = PRIME * result + this.number;

        /*
        * String 클래스의 hashCode 메소드는 이미 재정의되어 있음
        * 같은 값을 가지는 문자열은 동일한 hashCode 값을 반환함
        * */
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}

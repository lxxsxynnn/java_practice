package com.ohgiraffers.chap08.section02.superkeyword;

import java.util.Date;

public class Product {

    private String code;            //상품코드
    private String brand;           //제조사
    private String name;            //상품명
    private int price;              //가격
    private Date manufacturingDate; //제조일자

    /* 기본생성자 */
    public Product(){

        System.out.println("Product 클래스의 기본 생성자 호출함...");
    }

    /* 모든 필드를 초기화하는 생성자 */
    public Product(String code, String brand, String name, int price, Date manufacturingDate) {

        /*
        * 아무 클래스도 상속받지 않았는데 super()가 호출됨
        * java.lang.Object 클래스의 생성자를 호출하는 것
        * 모든 클래스는 Object 클래스의 후손이기 때문
        * */
        super();

        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufacturingDate = manufacturingDate;

        System.out.println("Product 클래스의 매개변수 있는 생성자 호출함...");
    }

    /* setter/getter */

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    /* 모든 필드값을 문자열로 반환하는 메소드 */
    public String getInformation() {
        return "Product[" +
                "code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturingDate=" + manufacturingDate +
                ']';
    }
}

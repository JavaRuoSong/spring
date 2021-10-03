package com.atguigu.spring5;

/**
 * @author shkstart
 * @create 2021-10-01 16:42
 */
public class Book {
    private int price;
    private String name;
    private String address;


    public Book() {
    }

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }



    public void setAddress(String address) {
        this.address = address;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("price:"+price+"name:"+name);
    }
}

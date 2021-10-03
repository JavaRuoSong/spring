package com.atguigu.spring5;

/**
 * @author shkstart
 * @create 2021-09-20 14:22
 */
public class User {

    private String name;
    private int age;
    private String  gender;
    private Book book;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void add(){
        System.out.println("add...........");
    }

    public void show(){

        System.out.print("name:"+name+"age:"+age+"gender:"+gender+"book");
        book.show();
    }
}

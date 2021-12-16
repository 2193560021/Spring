package com.lyy;

/**
    演示使用set方法进行注入属性

 */
public class Book {
    //创建属性
    private String bname;
    private String author;

    //创建属性对应的set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void testDemo(){
        System.out.println(bname + "::" + author);
    }
}

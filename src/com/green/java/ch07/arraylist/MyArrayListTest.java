package com.green.java.ch07.arraylist;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.add(6, 100);


        System.out.println(myList.toString());
        //[10,20,30]
     //   myList.print();
    }
}

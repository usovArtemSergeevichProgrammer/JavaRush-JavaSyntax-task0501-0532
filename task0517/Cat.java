package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private String address;
    private String color;
    private int weight;
    private int age;

    public Cat(String name){
        this.name = name;
        this.color = "White";
        this.weight = 5;
        this.age = 1;
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.color = "White";
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age){
        this.name = name;
        this.color = "Green";
        this.weight = 3;
        this.age = age;
    }

    public Cat(int weight, String color){
        this.color = color;
        this.weight = weight;
        this.age = 5;
    }

    public Cat(int weight, String color, String address){
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.age = 5;
    }
    public static void main(String[] args) {

    }
}

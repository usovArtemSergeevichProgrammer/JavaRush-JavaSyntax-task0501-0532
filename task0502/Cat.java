package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код

        int count = 0;

        if(this.age == anotherCat.age){
            count += 1;
        }else if(this.age > anotherCat.age){
            count += 2;
        }

        if(this.strength == anotherCat.strength){
            count += 1;
        } else if(this.strength > anotherCat.strength){
            count +=2;
        }

        if(this.weight == anotherCat.weight){
            count +=1;
        } else if(this.weight > anotherCat.weight){
            count +=2;
        }

        if (count >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}

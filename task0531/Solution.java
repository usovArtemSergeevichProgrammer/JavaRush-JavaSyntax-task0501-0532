package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        int minimum = min(num1, num2, num3, num4, num5);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int num1, int num2, int num3, int num4, int num5) {
        int minimum = min(num1, min(min(num2, num3), min(num4, num5)));
        return minimum;
    }
}

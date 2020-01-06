package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
        int border = Integer.parseInt(reader.readLine());
        int count = 1;
        while (border > 0) {
            int num = Integer.parseInt(reader.readLine());
            if(count==1){
                maximum =num;
                count--;
            }
            if (num > maximum) {
                maximum = num;
            }
            border--;
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}

package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int sum = 0;

        while (true) {
            String str = bufferedReader.readLine();
            if (str.equals("сумма")) {
                break;
            }

            int num = Integer.parseInt(str);
            sum += num;
        }

        System.out.println(sum);
    }
}

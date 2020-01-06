package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        int summ = 0;
        int count = 0;

        while(true){
            int num = Integer.parseInt(bufferedReader.readLine());
            if(num == -1){
                break;
            }
            summ += num;
            count++;
        }

        System.out.println((double)summ/count);

    }
}


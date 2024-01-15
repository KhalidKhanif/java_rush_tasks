package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        int result = (int) Math.floor(3.14 * radius * radius);
        
        System.out.println(result);
    }
}
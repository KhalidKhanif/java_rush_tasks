package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания

Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно), то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.
Пример ввода: Amigo 18 Пример вывода: Amigo, явитесь в военкомат
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner =  new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();

        if (age>=18 && age<=28){
            System.out.println(name+militaryCommissar);
        }
    }
}

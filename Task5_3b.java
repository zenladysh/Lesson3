package com.company;

import java.util.Scanner;

public class Task5_3b {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите b");
        int numB = in.nextInt();
        if (numB >= 10) {

            for (int i = 10; i <= numB; i++) {

                double powB = Math.pow(i,2);
                System.out.println(powB);
            }
        } else {
            System.out.println("Проверьте b");
        }

    }

}

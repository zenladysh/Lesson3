package com.company;

import java.util.Scanner;

public class Task5_3d {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int numA = in.nextInt();
        System.out.println("Введите b");
        int numB = in.nextInt();
        if (numB > numA) {

            for (int i = numA; i <= numB; i++) {

                System.out.println(i);
            }
        } else {
            System.out.println("Проверьте a и b");
        }

    }
}

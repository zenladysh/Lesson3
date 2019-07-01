package com.company;

import java.util.Scanner;

public class Task5_3c {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int numA = in.nextInt();
        if (numA <= 50) {

            for (int i = numA; i <= 50; i++) {

                double powA = Math.pow(i,3);
                System.out.println(powA);
            }
        } else {
            System.out.println("Проверьте a");
        }

    }

}


package com.company;

import java.util.Scanner;

public class Task5_32 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        double sum1 = 1;
        for (double i = 2; i <= n; i++) {

             sum1 += 1/i;
        }
        System.out.printf("Сумма равна %.4f ",sum1);

    }
}

package com.company;

import java.util.Scanner;

public class Task5_38 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите n");
        int n = in.nextInt();
        System.out.println("Введите вариант задачи(a или b)");
        String var = in.next();
        switch (var) {
            case "a":
                double sum1 = 0.5;
                for (double i = 3; i <= n; i++) {
                    if (i % 2 != 0) {
                        sum1 += 1 / i;
                    } else {
                        sum1 -= 1 / i;
                    }
                }
                System.out.printf("Расстояние от дома равно %.4f", sum1);
                break;
            case "b":

                double sum2 = 0.5;
                for (double i = 3; i <= n; i++) {

                        sum2 += 1 / i;

                }
                System.out.printf("Общий путь равен %.4f", sum2);
                break;
        }
    }
}


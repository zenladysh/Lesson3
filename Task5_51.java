package com.company;

import java.util.Scanner;

public class Task5_51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число n");
        int countVar = in.nextInt();


        Scanner inX = new Scanner(System.in);
        double varX[] = new double[countVar + 1];


        for (int i = 1; i > 0; i++) {

            System.out.println("Введите a" + i);
            varX[i] = inX.nextInt();
            System.out.println("a" + i + "=" + varX[i]);
            if (i == countVar)
                break;
        }
        double sum = 0;
        for (int i = 1; i > 0; i++) {

            sum += varX[i];

            if (i == countVar)
                break;

        }
        double numAverage = sum/countVar;
        System.out.printf("Среднее арифметическое равно %.3f " ,numAverage);
    }
}

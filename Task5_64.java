package com.company;

import java.util.Scanner;

public class Task5_64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int countDistr = 12;
        System.out.println("Количество районов "+countDistr);

        double countPop[] = new double[countDistr + 1];
        double areaDistr[] = new double[countDistr + 1];


        for (int i = 1; i > 0; i++) {

            System.out.println("Введите количество населения для района №" + i);
            countPop[i] = in.nextInt();
            System.out.println("Введите площадь района №" + i);
            areaDistr[i] = in.nextInt();
            if (i == countDistr)
                break;
        }
        double densityPop[] = new double[countDistr + 1];
        System.out.println("|Район|Плотность населения|");

        for (int i = 1; i > 0; i++) {

            densityPop[i] = countPop[i]/areaDistr[i];
            System.out.println("|  "+i+"  |   "+densityPop[i]+"  |");
            if (i == countDistr)
                break;

        }

    }
}

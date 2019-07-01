package com.company;

import java.util.Scanner;

public class Task5_71 {
    public static void main(String[] args) {
        double deposSum = 1000;
        int countMonth = 12;
        double percDepos = 2;
        double incrSum[] = new double[countMonth + 1];
        System.out.println("Выберите вариант задачи (a или b)");
        Scanner in = new Scanner(System.in);
        String varEx = in.next();
        switch (varEx) {
            case "a":
                for (int i = 1; i > 0; i++) {
                    incrSum[i] = deposSum * percDepos / 100;
                    deposSum = deposSum + incrSum[i];
                    System.out.printf("Прирост вклада за " + i + "-й месяц равен: %.3f \n", incrSum[i]);
                    if (i == 10)
                        break;
                }
                break;
            case "b":
                for (int i = 1; i > 0; i++) {
                    incrSum[i] = deposSum * percDepos / 100;
                    deposSum = deposSum + incrSum[i];
                    if (i>=3)
                    System.out.printf("Cумма вклада после " + i + "-го месяца равна: %.3f \n", deposSum);
                    if (i == countMonth)
                        break;
                }
        }
    }
}

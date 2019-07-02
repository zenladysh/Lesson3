package com.company;

import java.util.Scanner;

public class Task7_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число n");
        int countVar = in.nextInt();

        int varX[] = new int[countVar + 1];

        for (int i = 1; i <= countVar; i++) {

            System.out.println("Введите a" + i);
            varX[i] = in.nextInt();
            System.out.println("a" + i + "=" + varX[i]);

        }
        int k = 1;
        while (k != 0) {
            System.out.println("Выберите вариант задачи (a,b,c):");
            System.out.println("Для выхода введите 0");
            String varEx = in.next();


            switch (varEx) {
                case "a":
                    int sum1 = varX[1];
                    for (int i = 2; i <= countVar; i++) {


                        if (i % 2 == 0) {
                            sum1 -= varX[i];
                        } else {
                            sum1 += varX[i];
                        }
                    }
                    System.out.println("Ответ: " + sum1);
                    break;
                case "b":
                    int sum2 = varX[1] + varX[countVar];
                    System.out.println("Ответ: " + sum2);
                    break;
                case "c":
                    int sum3 = varX[1] - varX[2];
                    System.out.println("Ответ: " + sum3);
                    break;
                case "0":
                    k=0;
                 break;
            }
        }
    }
}

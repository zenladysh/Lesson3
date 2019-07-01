package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество неизвестных");
        int countVar = in.nextInt();


        Scanner inX = new Scanner(System.in);
        int varX[] = new int[countVar + 1];


        for (int i = 1; i > 0; i++) {

            System.out.println("Введите неизвестную № " + i);
            varX[i] = inX.nextInt();
            System.out.println("X" + i + "=" + varX[i]);
            if (i == countVar)
                break;
        }

        boolean exit = false;
        do {
            System.out.println("1 - Сложить числа");
            System.out.println("2 - Отнять числа");
            System.out.println("3 - Умножить числа");
            System.out.println("4 - Разделить числа");
            System.out.println("5 - Возвести в степень число");
            System.out.println("6 - Взять корень числа");
            System.out.println("0 - Выйти");

            Scanner inChoise = new Scanner(System.in);
            System.out.println("Выберите действие");
            int numChoise = inChoise.nextInt();

            switch (numChoise) {
                case 1:
                    int numAdd = 0;
                    for (int i = 1; i > 0; i++) {

                        numAdd += varX[i];

                        if (i == countVar)
                            break;

                    }
                    System.out.println("Сумма чисел равна "+numAdd);
                    break;
                case 2:
                    int numSub = 0;
                    for (int i = 1; i > 0; i++) {

                        numSub -= varX[i];

                        if (i == countVar)
                            break;

                    }
                    System.out.println("Разница чисел равна "+numSub);
                    break;
                case 0:
                    exit = true;
                    break;
            }

        } while (!exit);
    }
}
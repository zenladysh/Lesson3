package com.company;

import java.util.Scanner;

public class Task6_49 {
    public static void main(String[] args) {

        System.out.println("ВВедите вариант задачи(a или b)");
        Scanner in = new Scanner(System.in);
        String varEx = in.next();

        System.out.println("ВВедите число");

        int num = in.nextInt();
        int numOut = num;
        switch (varEx) {
            case "a":

                int j = 0;
                for (int i = 1; i > 0; i++) {
                    if (num % 10 == 3) {
                        j++;

                        num = num / 10;
                    } else {
                        num = num / 10;

                    }
                    if (num == 0)
                        break;
                }

                System.out.println("Число "+numOut+" содержит цифру 3: " + j + " раз(а)");
                break;
            case "b":
                int k = 0;
                int m = 0;
                for (int n = 1; n > 0; n++) {
                    if (num % 10 == 2) {
                        k++;

                        num = num / 10;
                    } else if (num % 10 == 5) {
                        m++;
                        num = num / 10;

                    } else {
                        num = num / 10;
                    }
                    if (num == 0)
                        break;
                }

                System.out.println("Число "+numOut+" содержит цифру 2: " + k + " раз(а)");
                System.out.println("Число "+numOut+" содержит цифру 5: " + m + " раз(а)");
                break;
        }
    }
}
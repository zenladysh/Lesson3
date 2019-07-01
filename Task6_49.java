package com.company;

import java.util.Scanner;

public class Task6_49 {
    public static void main(String[] args) {
        
        System.out.println("ВВедите число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
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

        System.out.println("Число содержит цифру 3: " + j + " раз(а)");
    }
}

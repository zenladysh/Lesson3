package com.company;

import java.util.Scanner;

public class Task7_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a=in.nextInt();
        System.out.println("Введите b");
        int b=in.nextInt();
        System.out.println("Введите c");
        int c=in.nextInt();
        System.out.println("Числа кратные "+c+":");
        for (int i = a; i <= b; i++) {
            if (i % c == 0)

                System.out.println(i);
        }

    }
}

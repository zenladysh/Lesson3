package com.company;

public class Task6_34 {
    public static void main(String[] args) {

        int num[] = new int[16];
        int j=1;
        System.out.println("15 первых натуральных чисел, \n делящихся на 19 без остатка:");
        for (int i = 100; i > 0; i++) {

            if (i % 19 == 0) {
            num[j]=i;
                System.out.println(j+")"+num[j]+ ";");
                j++;
            }
            if (j==16)
                break;
        }


    }
}

package com.company;

import java.util.Scanner;

public class Task6_82 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ВВедите число");

        int num = in.nextInt();
        int numOut = num;

        int numMax = num % 10;
        int numMin = num % 10;

        for (int i = 1; i > 0; i++) {
            num = num / 10;

            if (num % 10 > numMax) {
                numMax = num % 10;

            } else if (num == 0) {
                break;

            } else if (num % 10 < numMin) {
                numMin = num % 10;
            }
        }
        //System.out.println("Максимальная цифра: "+numMax + "; " +"Минимальная цифра: "+numMin);
        if((numMax-numMin)%2==0){
            System.out.println("Разница максимальной и минимальной цифры числа "+ numOut +" является четной");
        } else
        System.out.println("Разница максимальной и минимальной цифры числа "+ numOut +" является нечетной");
    }
}

package com.company;

public class Task5_12 {
    public static void main(String[] args){
        double p0 = 1.29; // кг/м3
        double z = 1.25/10000;
        System.out.println("|  h  |  p  |");
        for (int h=0;h<=1000;){
            double p=p0*Math.pow(Math.E,-h*z);
            System.out.println("|  "+h+"  |  "+p+"  |");
            h=h+100;
        }
    }
}

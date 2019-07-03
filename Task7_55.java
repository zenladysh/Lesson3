package com.company;

public class Task7_55 {
    public static void main(String[] args) {
        int countMember = 23; //Количество участников;
        double[] timeFinal = new double[countMember];
        double bestTime = 0;
        int j = 1;
        int jBest = 0;
        System.out.println("РЕЗУЛЬТАТЫ УЧАСТНИКОВ");
        System.out.println("|  № уч.  |  Время  |");
        for (int i = 0; i < countMember; i++) {
            timeFinal[i] = Math.random() * 10; 
            System.out.printf("|    %02d    |  %.3f  | \n", j, timeFinal[i]);
            if (timeFinal[i] > bestTime) {
                bestTime = timeFinal[i];
                jBest = j;
            }

            j++;

        }

        System.out.printf("Лучший результат участника под номером: %02d ; время: %.3f",jBest, bestTime);

    }
}

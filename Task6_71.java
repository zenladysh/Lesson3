package com.company;

public class Task6_71 {
    public static void main(String[] args) {
        int countStud = 10;
        int heightStud[] = new int[]{178, 177, 169, 167, 163, 161, 159, 158, 155, 154};
        for (int i = 0; i <countStud-1;i++) {
            if (heightStud[i] < heightStud[i + 1]) {

                System.out.println("Ученики перечислены не в порядке убывания");
                break;
            }
            if (i == (countStud - 2)){
                System.out.println("Ученики перечислены в порядке убывания");
            break;}

        }


    }
}

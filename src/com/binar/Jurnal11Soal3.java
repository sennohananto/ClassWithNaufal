package com.binar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jurnal11Soal3 {
    public static void main(String[] args) {
        ArrayList<Integer> listPoint = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int jumlahLoop = sc.nextInt();

        Integer currentLoop = 1;
        Integer input;
        do{
            input = sc.nextInt();
            listPoint.add(input);
        }while(currentLoop <= jumlahLoop);



        for (int num : listPoint) {
            Collections.frequency(listPoint,num);
        }


        listPoint.forEach(integer -> System.out.print(integer+" "));
    }
}

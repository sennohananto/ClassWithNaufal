package com.binar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jurnal11Soal2 {
    public static void main(String[] args) {
        ArrayList<Integer> listPoint = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        Integer input;
        do{
            input = sc.nextInt();
            if(input!=-1){
                listPoint.add(input);
            }
        }while(input!=-1);

        Collections.sort(listPoint);
        Collections.reverse(listPoint);

        listPoint.forEach(integer -> System.out.print(integer+" "));
    }
}

package com.binar;

import java.util.Scanner;

public class Jurnal13Soal1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String name1, name2;
        int jam;

        name1 = sc.next();
        name2 = sc.next();
        jam = sc.nextInt();

        System.out.println(sapaOrang(name1, jam));
        System.out.println(sapaOrang(name2, jam));

    }

    static String sapaOrang(String name, int jam){
        String waktu = "";
        if(jam>=6 && jam<=11){
            waktu = "pagi";
        }else if(jam >=12 && jam<=14){
            waktu = "siang";
        }else if(jam >=15 && jam<=17){
            waktu = "sore";
        }else if(jam >= 18 && jam <=5){
            waktu = "malam";
        }

        String hasil = "Halo, "+name+". Selamat "+waktu;
        return hasil;
    }
}

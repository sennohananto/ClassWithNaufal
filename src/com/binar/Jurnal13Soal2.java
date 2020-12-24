package com.binar;

import java.util.Scanner;

public class Jurnal13Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lirik = sc.nextLine();
        System.out.println(replaceVokal(lirik));
    }

    public static String replaceVokal(String lirik){

        lirik = lirik.toLowerCase();

        int panjangLirik = lirik.length();

        char vokalPengganti = 'z';
        switch (panjangLirik % 5){
            case 0 :
                vokalPengganti = 'a';
                break;
            case 1:
                vokalPengganti = 'e';
                break;
            case 2:
                vokalPengganti = 'i';
                break;
            case 3:
                vokalPengganti = 'o';
                break;
            case 4:
                vokalPengganti = 'u';
                break;
        }

        String hasil = lirik.replaceAll("[aiueoAIUEO]",String.valueOf(vokalPengganti));

        return hasil;
    }
}

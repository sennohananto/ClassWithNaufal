package com.binar;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jurnal11Soal1 {
    public static void main(String[] args) {
        ArrayList<String> listMahasiswa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input;
        do{
            input = sc.next();
            listMahasiswa.add(input);
        }while(!input.equals("-"));

        Random random = new Random();
        System.out.println("Mahasiswa Terpilih : "+ listMahasiswa.get(random.nextInt(listMahasiswa.size())));
    }

}

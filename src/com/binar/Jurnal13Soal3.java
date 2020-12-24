package com.binar;

import java.util.Scanner;

public class Jurnal13Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double hasil = permukaanKerucut(h,r);
        System.out.printf("%.3f", hasil);
    }

    public static double permukaanKerucut(double h, double r){
        double hasil = Math.PI * r * (r + Math.sqrt((h*h) + (r*r)));

        return hasil;
    }
}

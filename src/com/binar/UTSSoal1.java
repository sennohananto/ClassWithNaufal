package com.binar;

import java.util.Scanner;

public class UTSSoal1 {
    //              Stars
    //1       *     +0
    //2      ***    +1
    //3     *****   +2
    //4      ***
    //5       *

    //Baris         Stars
    //1       *     +0
    //2      ***    +1
    //3     *****   +2
    //2      ***    +1
    //1       *     +0


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Segitiga ATAS
        //Handle Per Baris
        for (int line = 1; line <= n; line++){
            //Handle Menulis Spasi
            for (int space = line; space <= n-1; space++){
                System.out.print(" ");
            }
            //Handle Menulis Bintang
            for (int stars = 1; stars <= line+line-1 ; stars++){
                System.out.print("*");
            }
            System.out.println();

        }


        //Segitiga Bawah
        for (int line = n-1; line >= 1; line--){
            //Handle Menulis Spasi
            for (int space = line; space <= n-1; space++){
                System.out.print(" ");
            }
            //Handle Menulis Bintang
            for (int stars = 1; stars <= line+line-1 ; stars++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

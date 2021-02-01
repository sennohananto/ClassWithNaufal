package com.binar;

import java.util.Scanner;

public class UTSSoal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = sc.nextLine();

        String[] arrayOfWord = pesan.split(" ");

        String result = "";


        for (int i = 0; i < arrayOfWord.length; i++) {
            result = result+arrayOfWord[i].substring(0,arrayOfWord[i].length()-2)+" ";
        }

        System.out.println(result);
    }
}
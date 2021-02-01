package com.binar;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;


// 16 7 4 2 17 13 10 15 6 1
// 16 7 4 2 17 13 10 15 6 1

public class UTSSoal2 {
    public static void main(String[] args) {
        int jumlahToples, jumlahPermen;
        ArrayList<Integer> listNomorToples = new ArrayList<>();
        ArrayList<Integer> listIsiToples = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        jumlahToples = sc.nextInt();
        jumlahPermen = sc.nextInt();

        int loop = 1;

        while (loop <= jumlahToples){
            listIsiToples.add(sc.nextInt());
            listNomorToples.add(loop);
            loop++;
        }

        //Memulai Pencarian dua toples yang jumlah Permennya sebanyak N

        //Kaki kiri
        for (int kakiKiri = 0; kakiKiri <= listIsiToples.size()-1; kakiKiri++){
            for (int kakiKanan = 0; kakiKanan <= listIsiToples.size()-1; kakiKanan++){
                if (kakiKiri != kakiKanan) {
                    if(listIsiToples.get(kakiKiri) + listIsiToples.get(kakiKanan) == jumlahPermen){
                        if(listNomorToples.get(kakiKanan)>0 && listNomorToples.get(kakiKiri)>0){
                            System.out.println((listNomorToples.get(kakiKiri))+" "+(listNomorToples.get(kakiKanan)));
                        }
                        listNomorToples.set(kakiKanan, -1);
                        listNomorToples.set(kakiKiri, -1);
                        break;
                    }
                }
            }
        }
    }
}

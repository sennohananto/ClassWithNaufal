package com.binar;

import java.util.Scanner;

//Object Oriented Programming
//Class -> Blueprint / Cetak Biru -> Cetakan Agar

//Class --> Cetakan Agar
//Object --> Agar yang bisa dimakan

//Class --> Attribute | Field & Method | Function | Prochedure


//Agar
//Atribut : warna, bentuk, rasa, tinggi, lebar, panjang, merek, kadarGula
//Method : pecah, mencair, mengembut, mengerut

public class MainOOP {
    //Class
    //Object
    //Attribute | Field
    //Method | Function | Prochedure
    //Constructor
        //Method yang dipanggil untuk membuat object
        //Ciri khas: Nama Method = Nama Class
    //Method Overloading
        // method dengan nama yang sama, bisa melakukan aksi yang berbeda
        //Method dianggap sama JIKA
        //1. nama method sama persis
        //2. parameter sama persis
        // a. Jumlah parameter sama
        // b. Tipe data parameter sama
        // c. Urutan tipe data parameter sama
    //Inheritance
    //Encapsulation
    //Access Modifier

    public static void main(String[] args) {
        Manusia seorangSenno = new Manusia("Senno","Programmer","Banten",23);

        seorangSenno.berjalan();

        seorangSenno.memakan();
        seorangSenno.memakan(3);
        seorangSenno.memakan("Sate");
        seorangSenno.memakan(7,"Sop iga");
    }

    //API Dibuat pakai Golang
    //Login --> Username Password --> API --> Cek Bener? --> Masuk HomePage

    //Dart --> Basprog Flutter      --> Multiplatform (penyesuaian untuk ios)
    //JavaScript --> React Native   -->
    //Kotlin / Java --> A.S         --> Performa, Keamanan, dan Update
}

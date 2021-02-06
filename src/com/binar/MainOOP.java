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
    //Access Modifier (Public, Private, Protected, Default)


    //Overriding (Untuk menimpah suatu method)
    //Polymorphism (Satu Object bisa melakukan aksi yang berbeda-beda)
        //Dynamic Polymorphism -> Overloading
        //Static Polymorphism -> Overriding

    // Abstract Class
        // Class yang memiliki method Abstract
        // tidak bisa dibuat objectnya / tidak bisa di instansiasi
        // Untuk menggunakan Abstract Class wajib di turunkan / extend dari kelas lain

    public static void main(String[] args) {
//        Manusia seorangSenno = new Manusia("Senno","Programmer","Banten",23);
//
//        seorangSenno.berjalan();
//
//        seorangSenno.memakan();
//        seorangSenno.memakan(3);
//        seorangSenno.memakan("Sate");
//        seorangSenno.memakan(7,"Sop iga");

        //Deklarasi Object | Instantitation (Pembuatan suatu Object)
//        Mahasiswa mhs = new Mahasiswa("Naufal","Mahasiswa","Bogor");
//        mhs.memakan(3);
//        mhs.memakan("Bakso");
//        mhs.memakan(3,"Sop Buntut");
//
//        mhs.berjalan();

        PersegiPanjang persegiPanjang = new PersegiPanjang(6,2);
        System.out.println("Luas Persegi Panjang : "+ persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang : "+ persegiPanjang.hitungKeliling());

        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi : "+persegi.hitungLuas());
        System.out.println("Keliling Persegi : "+persegi.hitungKeliling());

        Manusia manusiaLagi = new Mahasiswa("Senno","Mhs","Banten");
    }

    //API Dibuat pakai Golang
    //Login --> Username Password --> API --> Cek Bener? --> Masuk HomePage

    //Dart --> Basprog Flutter      --> Multiplatform (penyesuaian untuk ios)
    //JavaScript --> React Native   -->
    //Kotlin / Java --> A.S         --> Performa, Keamanan, dan Update
}

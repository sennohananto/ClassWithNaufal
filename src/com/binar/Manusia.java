package com.binar;

public class Manusia {
    //Atribut
    protected String nama, pekerjaan, alamat;
    protected int umur;

    //Constructor Method
    //Method yang dijalankan untuk membuat object

    public Manusia(String nama, String pekerjaan, String alamat, int umur) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.umur = umur;
    }

    public Manusia(){
    }

    //Method
    public void berjalan(){
        System.out.println(nama +" sedang berjalan");
    }

    public void memakan(){
        System.out.println(nama +" sedang makan ");
    }

    public void memakan(String namaMakanan){
        System.out.println(nama +" sedang memakan "+ namaMakanan);
    }

    public void memakan(int jumlahPiring){
        System.out.println(nama +" sedang makan sebanyak "+ jumlahPiring);
    }

    public void memakan(String namaMakanan, int jumlahPiring){
        System.out.println(nama +" sedang makan"+ namaMakanan + " sebanyak "+ jumlahPiring);
    }

    public void memakan(int jumlahMangkok, String namaSop){
        System.out.println(nama +" sedang makan"+ namaSop + " sebanyak "+ jumlahMangkok);
    }

    public void belajar(){
        System.out.println("Belajar seperti manusia pada umumnya");
    }

    //Method dianggap sama JIKA
    //1. nama method sama persis
    //2. parameter sama persis
        // a. Jumlah parameter sama
        // b. Tipe data parameter sama
        // c. Urutan tipe data parameter sama

    //Encapsulation --> Cara untuk membungkus suatu informasi(Class, Atrib, method)
    //Encapsulation dilakukan dengan menambahkan ACCESS MODIFIER
    //Access Modifier:
        //Public --> Bisa diakses DARI MANA SAJA
        // Private --> HANYA bisa diakses oleh KELASNYA SENDIRI
        //Protected --> HANYA BISA diakses Oleh KELASNYA SENDIRI
    //                  dan KELAS TURUNANNYA
    // , Default
}
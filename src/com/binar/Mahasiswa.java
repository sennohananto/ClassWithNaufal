package com.binar;

public class Mahasiswa extends Manusia implements AnakYangBerbakti {
    public Mahasiswa(String nama, String pekerjaan, String alamat){
        super.nama = nama;
        super.pekerjaan = pekerjaan;
        super.alamat = alamat;
    }
    
    private void introduce(){
        System.out.println("Hello nama saya "+ super.nama);
    }

    @Override
    public void berjalan() {
        System.out.println("Mahasiswa bernama "+super.nama +" sedang berjalan");
    }


    @Override
    public void membantuIbu() {

    }

    @Override
    public void tidakKorupsi() {

    }

    @Override
    public void membantuAyah() {

    }
}

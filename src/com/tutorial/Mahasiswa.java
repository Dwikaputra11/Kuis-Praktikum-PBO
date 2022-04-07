package com.tutorial;

import com.tutorial.beasiswa.BeasiswaMahasiswa;

public class Mahasiswa implements BeasiswaMahasiswa {
    private String nama;
    private int umur;
    private double total;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void lolos(){
        System.out.println("Selamat! " + nama + "(" + umur + " tahun)" +
                "dinyatakan diterima pada program BEASISWA MAHASISWA karena" +
                "mencapai nilai yang diharapkan pada tahap seleksi.");
    }
    public void tidakLolos(){
        System.out.print("Mohon maaf, " + nama + "(" + umur + " tahun)" +
                "dinyatakan tidak diterima pa");
        if(umur < 16 || umur > 24){

        }
    }

    @Override
    public double nilaiKontenJurnal(double n) {
        return n*0.6;
    }

    @Override
    public double nilaiRelevansiData(double n) {
        return n*0.25;
    }

    @Override
    public double nilaiProblemSolving(double n) {
        return n*0.15;
    }
}

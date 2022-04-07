package com.tutorial;

import com.tutorial.beasiswa.BeasiswaMahasiswa;

public class Mahasiswa implements BeasiswaMahasiswa {
    private String nama;
    private int umur;
    private double nilaiJurnal;
    private double nilaiRelevansi;
    private double nilaiProblemSolving;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        nilaiJurnal = 0;
        nilaiRelevansi = 0;
        nilaiProblemSolving = 0;
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

    public double getTotal() {
        return nilaiProblemSolving() + nilaiKontenJurnal() + nilaiRelevansiData();
    }

    public double getNilaiJurnal() {
        return nilaiJurnal;
    }

    public void setNilaiJurnal(double nilaiJurnal) {
        this.nilaiJurnal = nilaiJurnal;
    }

    public double getNilaiRelevansi() {
        return nilaiRelevansi;
    }

    public void setNilaiRelevansi(double nilaiRelevansi) {
        this.nilaiRelevansi = nilaiRelevansi;
    }

    public double getNilaiProblemSolving() {
        return nilaiProblemSolving;
    }

    public void setNilaiProblemSolving(double nilaiProblemSolving) {
        this.nilaiProblemSolving = nilaiProblemSolving;
    }

    public void lolos(){
        System.out.println("Selamat! " + nama + "(" + umur + " tahun)" +
                "dinyatakan diterima pada program BEASISWA MAHASISWA karena" +
                "mencapai nilai yang diharapkan pada tahap seleksi.");
    }
    public void tidakLolos(){
        System.out.print("Mohon maaf, " + nama + "(" + umur + " tahun)" +
                "dinyatakan tidak diterima pada program BEASISWA MAHASISWA karena ");
        if(umur < 16 || umur > 24){
            System.out.println("memiliki usia yang tidak sesuai dengan prasyaratan penerima beasiswa");
        }else if (getTotal() < kkm){
            System.out.println("belum mencapai nilai yang diharapkan pada tahap seleksi");
        }
    }

    @Override
    public double nilaiKontenJurnal() {
        return nilaiJurnal*0.6;
    }

    @Override
    public double nilaiRelevansiData() {
        return nilaiRelevansi*0.25;
    }

    @Override
    public double nilaiProblemSolving() {
        return nilaiProblemSolving*0.15;
    }
}

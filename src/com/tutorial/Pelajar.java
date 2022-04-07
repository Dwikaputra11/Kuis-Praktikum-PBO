package com.tutorial;

import com.tutorial.beasiswa.BeasiswaPelajar;

public class Pelajar implements BeasiswaPelajar {
    private String nama;
    private int umur;
    private double nilaiEsai;
    private double nilaiVisualisasi;
    private double nilaiDesignThinking;

    public Pelajar(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
        nilaiEsai = 0;
        nilaiVisualisasi = 0;
        nilaiDesignThinking = 0;
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

    public double getNilaiEsai() {
        return nilaiEsai;
    }

    public void setNilaiEsai(double nilaiEsai) {
        this.nilaiEsai = nilaiEsai;
    }

    public double getNilaiVisualisasi() {
        return nilaiVisualisasi;
    }

    public void setNilaiVisualisasi(double nilaiVisualisasi) {
        this.nilaiVisualisasi = nilaiVisualisasi;
    }

    public double getNilaiDesignThinking() {
        return nilaiDesignThinking;
    }

    public void setNilaiDesignThinking(double nilaiDesignThinking) {
        this.nilaiDesignThinking = nilaiDesignThinking;
    }

    public double getTotal(){
        return nilaiKontenEsai() + nilaiTeknikVisualisasi() +nilaiDesignThinking();
    }

    public void lolos(){
        System.out.println("Selamat! " + nama + "(" + umur + " tahun)" +
                "dinyatakan diterima pada program BEASISWA PELAJAR karena" +
                "mencapai nilai yang diharapkan pada tahap seleksi.");
    }
    public void tidakLolos(){
        System.out.print("Mohon maaf, " + nama + "(" + umur + " tahun)" +
                "dinyatakan tidak diterima pada program BEASISWA PELAJAR karena ");
        if(umur < 16 || umur > 24){
            System.out.println("memiliki usia yang tidak sesuai dengan prasyaratan penerima beasiswa");
        }else if (getTotal() < kkm){
            System.out.println("belum mencapai nilai yang diharapkan pada tahap seleksi");
        }
    }

    @Override
    public double nilaiKontenEsai() {
        return nilaiEsai*0.5;
    }

    @Override
    public double nilaiTeknikVisualisasi() {
        return nilaiVisualisasi*0.2;
    }

    @Override
    public double nilaiDesignThinking() {
        return nilaiDesignThinking*0.3;
    }
}

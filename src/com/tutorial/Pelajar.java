package com.tutorial;

import com.tutorial.beasiswa.BeasiswaPelajar;

public class Pelajar implements BeasiswaPelajar {

    @Override
    public double nilaiKontenEsai(double n) {
        return n*0.5;
    }

    @Override
    public double nilaiTeknikVisualisasi(double n) {
        return n*0.2;
    }

    @Override
    public double nilaiDesignThinking(double n) {
        return n*0.3;
    }
}

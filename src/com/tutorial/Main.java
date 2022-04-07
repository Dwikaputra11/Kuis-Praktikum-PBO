package com.tutorial;

import java.util.Scanner;

public class Main {
    public static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        boolean redo = false;
        while(!redo){
            switch (opsi){
                case 1:
                    mahasiswa();
                    break;
                case 2:
                    pelajar();
                    break;
                default:
                    redo = true;
            }
        }

    }

    public static int menu(){
        System.out.print("""
                +---------------------------------+
                | Pendaftaran Beasiswa PT. Benang |
                +---------------------------------+
                Terdapat 2 program beasiswa yang dibuka:
                \t1. Beasiswa Pelajar
                \t2. Beasiswa Mahasiswa
                Pilih beasiswa yang didaftar:\040
                """);
        return in.nextInt();
    }

    public static void mahasiswa(){
        String nama;
        int umur;
        boolean redo = true;

        while(redo) {
            System.out.println("=== FORM PENDAFTARAN ===");
            System.out.print("Nama Lengkap\t: ");
            nama = in.next();
            System.out.print("Usia\t\t: ");
            umur = in.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(nama, umur);
            formNilaiMahasiswa(mahasiswa);

            switch (subMenu()) {
                case 1:
                    if (umur >= 16 && umur <= 24 && mahasiswa.getTotal() >= 87.5)
                        mahasiswa.lolos();
                    else
                        mahasiswa.tidakLolos();
                    break;
                case 2:
                    formNilaiMahasiswa(mahasiswa);
                    break;
                case 3:
                    redo = false;
                    break;
            }
        }
    }

    public static void formNilaiMahasiswa(Mahasiswa mahasiswa) {
        System.out.println("--- Form Penilaian ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0 - 100\n");

        System.out.println("Nilai Struktur dan Konten Jurnal\n");
        mahasiswa.setNilaiJurnal(inputValidNumber());
        System.out.println("Nilai Relevansi Data\n");
        mahasiswa.setNilaiRelevansi(inputValidNumber());
        System.out.println("Kemampuang Problem Solving\n");
        mahasiswa.setNilaiProblemSolving(inputValidNumber());
    }

    public static void pelajar(){
        String nama;
        int umur;
        boolean redo = true;

        while(redo) {
            System.out.println("=== FORM PENDAFTARAN ===");
            System.out.print("Nama Lengkap\t: ");
            nama = in.next();
            System.out.print("Usia\t\t: ");
            umur = in.nextInt();

            Pelajar pelajar = new Pelajar(nama, umur);
            formNilaiPelajar(pelajar);

            switch (subMenu()) {
                case 1:
                    if (umur >= 16 && umur <= 24 && pelajar.getTotal() >= 87.5)
                        pelajar.lolos();
                    else
                        pelajar.tidakLolos();
                    break;
                case 2:
                    formNilaiPelajar(pelajar);
                    break;
                case 3:
                    redo = false;
                    break;
            }
        }
    }
    public static void formNilaiPelajar(Pelajar pelajar) {
        System.out.println("--- Form Penilaian ---");
        System.out.println("Keterangan: Nilai yang valid berada di antara 0 - 100\n");

        System.out.println("Nilai Struktur dan Konten Esai\n");
        pelajar.setNilaiEsai(inputValidNumber());
        System.out.println("Nilai Teknik Visualisasi\n");
        pelajar.setNilaiVisualisasi(inputValidNumber());
        System.out.println("Nilai Design Thinking\n");
        pelajar.setNilaiDesignThinking(inputValidNumber());
    }
    public static double inputValidNumber(){
        double n = 0;
        boolean correct = false;
        while(!correct){
            try {
                n = in.nextDouble();
                correct = true;
            }catch (NumberFormatException e){
                System.out.print("");
            }
        }
        return n;
    }

    public static int subMenu(){
        boolean redo = true;
        int n = 0;
        while(redo) {
            System.out.println("+++ MENU +++");
            System.out.println("\t1. Tampilkan Hasil");
            System.out.println("\t2. Ubah Nilai");
            System.out.println("\t3. Keluar");
            System.out.print("Pilih: ");
            try {
                n = in.nextInt();
                if(n > 3 || n < 1)
                    throw new NumberFormatException("");
                else redo = false;
            }catch (NumberFormatException e){
                System.out.print(e);
            }
        }
        return n;
    }
}

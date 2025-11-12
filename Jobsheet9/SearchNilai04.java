package Jobsheet9;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang di input : ");
        int panjangArray = sc.nextInt();
        int[] arrNilai = new int[panjangArray];
        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        boolean isKeyValid = false;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                isKeyValid=false;
                break;
            } else {
                isKeyValid = true;
            }
        }
        if (isKeyValid) {
            System.out.println("Nilai Yang dicari tidak ditemukan ");
        } else {
            System.out.println("Nilai " + key + " ketemu ke-" +(1+hasil));
        }
    }
}

/*
Percobaan 4 
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di 
atas. 
menghentikan loop for segera setelah elemen yang dicari ditemukan, sehingga tidak perlu memeriksa sisa elemen (efisiensi).
2. Modifikasi kode program pada percobaan 4 di atas sehingga program dapat menerima 
input berupa banyaknya elemen array nilai, isi array, dan sebuah nilai (key) yang ingin 
dicari. Lalu cetak ke layar indeks posisi elemen dari nilai (key) yang dicari. Contoh hasil 
program:
package Jobsheet9;

import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak nilai yang di input : ");
        int panjangArray = sc.nextInt();
        int[] arrNilai = new int[panjangArray];
        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari : ");
        int key = sc.nextInt();
        boolean isKeyValid = false;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                isKeyValid=false;
                break;
            } else {
                isKeyValid = true;
            }
        }
        if (isKeyValid) {
            System.out.println("Nilai Yang dicari tidak ditemukan ");
        } else {
            System.out.println("Nilai " + key + " ketemu ke-" +(1+hasil));
        }
    }
}

 */
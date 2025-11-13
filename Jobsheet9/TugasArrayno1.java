package Jobsheet9;

import java.util.Scanner;

public class TugasArrayno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int panjangArray = sc.nextInt();
        int [] nilaiMahasiswa = new int[panjangArray];
        int total=0;
        int tertinggi=0,terendah=100;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa : ");
            nilaiMahasiswa[i]=sc.nextInt();
            total+=nilaiMahasiswa[i];
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" : "+nilaiMahasiswa[i]);
            if (tertinggi<nilaiMahasiswa[i]) {
                tertinggi=nilaiMahasiswa[i];
            }
            if (terendah>nilaiMahasiswa[i]) {
                terendah=nilaiMahasiswa[i];
            }
        }
        int rataRata=total/nilaiMahasiswa.length;
        System.out.println("============================================");
        System.out.println("Rata - rata = "+ rataRata);
        System.out.println("Nilai tertinggi = "+tertinggi);
        System.out.println("Nilai terendah = "+terendah);

    }
}

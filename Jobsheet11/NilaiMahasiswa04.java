package Jobsheet11;

import java.util.Arrays;
import java.util.Scanner;

public class NilaiMahasiswa04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlM = sc.nextInt();
        int[] mahasiswa = new int[jmlM];
        isianArray(mahasiswa);
        tampilArray(mahasiswa);
        System.out.println("Total = " + hitTot(mahasiswa));

    }
    public static void isianArray(int[] tempMahasiswa) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tempMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa : ");
            int nilai = sc.nextInt();
            tempMahasiswa[i]=nilai;
        }
    }
    public static void tampilArray(int[] tempMahasiswa) {
        for (int i = 0; i < tempMahasiswa.length; i++) {
            System.out.println("Nilai ke- "+ (i+1) + " : " + tempMahasiswa[i]);
        }
    }
    public static  int hitTot (int[] tempMahasiswa) {
        int total = 0;
        for (int i = 0; i < tempMahasiswa.length; i++) {
            total +=tempMahasiswa[i];
        }
        return total;
    }
}

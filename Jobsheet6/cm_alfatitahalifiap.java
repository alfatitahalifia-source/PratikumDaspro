package Jobsheet6;

import java.util.Scanner;

public class cm_alfatitahalifiap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM :");
        String nim = sc.nextLine(); 


        System.out.println("--- MATA KULIAH 1 : Algoritma dan Pemograman");
        System.out.print("Nilai UTS : ");
        int nilaiUtsalgoritma = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int nialiUasalgoritma = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int nilaiTugasalgoritma = sc.nextInt();


        System.out.println("--- MATA KULIAH 2 : Struktur Data ");
        System.out.print("Nilai UTS : ");
        int nilaiUtsstruktur = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int nialiUasstruktur = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int nilaiTugasstruktur = sc.nextInt();

    }
}

package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]=sc.nextInt();
        } 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total +=nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rta nili = "+rata2);
    }
}
/*
Percobaa 3
1. Modifikasi kode program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)
agar program dapat menampilkan banyaknya mahasiswa yang lulus, yaitu mahasiswa 
yang memiliki lebih besar dari 70 (>70).
package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i]=sc.nextInt();
        } 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total +=nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Lulus!");
            }if (nilaiMhs[i] < 70) {
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Tidak lulus" );
            }    
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nili = "+rata2);
    }
}
2. Modifikasi program pada praktikum percobaan 3 di atas (ArrayRataNilaiXX.java)sehingga 
program menerima jumlah elemen berdasarkan input dari pengguna dan mengeluarkan 
output seperti berikut ini:
package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah mahasiswa : ");
        int panjangArray = sc.nextInt();
        int [] nilaiakhir = new int[panjangArray];
        int totalLulus=0,totalTidakLulus=0,jmlLulus=0,JmlTidakLulus=0;
        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiakhir[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70) {
                totalLulus+=nilaiakhir[i];
                ++jmlLulus;
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Lulus!");
            }if (nilaiakhir[i] < 70) {
                totalTidakLulus+=nilaiakhir[i];
                ++JmlTidakLulus;
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Tidak lulus" );
            }
        }
        int rataLulus = totalLulus/jmlLulus;
        int rataTidakLulus = totalTidakLulus/JmlTidakLulus;
        System.out.println("Nilai Rata-rata Lulus : "+rataLulus);
        System.out.println("Nilai Rata-rata Tidak Lulus : "+rataTidakLulus);
    }
}

 */

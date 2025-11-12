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
/*
Percobaan 2
1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:
Jalankan program. Apakah terjadi perubahan? Mengapa demikian?
package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiakhir = new int[10];
        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiakhir[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke- "+i+" adalah "+ nilaiakhir[i]);
        }
    }
}
Perulangan pertama: i = 1 elemen nilaiAkhir[0] tidak pernah diisi sedangkan Perulangan terakhir: i = 10 mencoba akses nilaiAkhir[10], padahal indeks terakhir adalah 9

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
i < 10 berarti jumlah perulangannya selalu tetap 10, sedangkan i < nilaiAkhir.length berarti jumlah perulangannya menyesuaikan ukuran array.
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program 
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai 
> 70):
package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiakhir = new int[10];
        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiakhir[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70) {
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Lulus!");
            }
        }
    }
}
4.Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan 
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus, 
seperti ilustrasi output berikut:
package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nilaiakhir = new int[10];
        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiakhir[i]=sc.nextInt();
        }
        for (int i = 0; i < nilaiakhir.length; i++) {
            if (nilaiakhir[i] > 70) {
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Lulus!");
            }if (nilaiakhir[i] < 70) {
                System.out.println("Nilai akhir ke- "+i+" adalah "+ "Tidak lulus" );
            }
        }
    }
}
 */
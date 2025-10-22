package jobsheed7;

import java.util.Scanner;

public class SiakadWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai,jml,i=0;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jml=sc.nextInt();
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + ": " );
            nilai = sc.nextInt();

            if (nilai < 0 || nilai > 100) {
                System.out.print("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100 ) {
                System.out.println("Nilai mahasiswa ke-"+ (i + 1) + " adalah A" );
                System.out.println("Bagus, pertahankan nilainya!");
            }else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah B+");
            }else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah B");
            }else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah C+");
            }else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah C");
            }else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah D");
            }else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1 ) + "adalah E");
            }
                i++;
        }
    }
}

//JAWABAN PERTANYAAN 
//1.a.Maksud dari nilai < 0 || nilai > 100 ) adalah jika nilai lebih kecil 0 atau nilai lebih besar 100 untuk membatasi kondisi tersebut
//  b. Maksud dari continue adalah untuk melewati/skip dan melanjutkan ke berikutnya.
//2.jadi i++ ditulis di akhir while agar perulangan dapat dijalankan dan memastikan kondisi berjalan dan perulangan berhenti sedangkan jika 1++ ada di awal perulangan tidak berjalan/tidak berhenti
//3.19 kali



package jobsheed7;

import java.util.Scanner;

public class SiakadFor04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//deklarasi scanner//

        double nilai, tertinggi = 0, terendah = 100; //deklarasi variabel//
        int jumlahmahasiswalulus=0, jumlahmahasiswatidaklulus=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + i +" : ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai<terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jumlahmahasiswalulus++;
            }else {
                jumlahmahasiswatidaklulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : "+ terendah);
        System.out.println("Jumlah mahasiswa lulus "+ jumlahmahasiswalulus );
        System.out.println("Jumlah mahasiswa tidak lulus "+ jumlahmahasiswatidaklulus );
    }
}


//JAWABAN PERTANYAAN//
//1. Komponen perulangan ada inilisalisasi yang ditulis dengan int i = 1,kondisi ditulis dengan i <=10 dan perubahan kondisi yaitu yang i++
//2. jika di balik maka nilai tertinggi tidak bisa berubah
//3. Jika nilai lebih besar dari pada tertinggi maka nilai menjadi tertinggi , jika nilai lebih kecil dari pada terendah maka nilai menjadi terendah dan berulang sampai bats yang di tentukan


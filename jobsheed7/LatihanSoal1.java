package jobsheed7;

import java.util.Scanner;

public class LatihanSoal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahtiket,hargatiket = 50000,totalharga=0;
        double diskon;
        do {
            System.out.print("Masukkan jumlah tiket : ");
            jumlahtiket=sc.nextInt();
            if (jumlahtiket > 4) {
                diskon=0.10;
            } else if (jumlahtiket > 10) {
                diskon=0.15;
            }else if (jumlahtiket < 0){
            System.out.println("Gagal, Coba Lagi !!! ");
            }else{
                totalharga= jumlahtiket*hargatiket;
                break;
            }
        } while (true);
        System.out.println("Total Penjualan Tiket : " + totalharga);
    } 
}


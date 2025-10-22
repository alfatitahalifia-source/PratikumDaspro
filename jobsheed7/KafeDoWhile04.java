package jobsheed7;

import java.util.Scanner;

public class KafeDoWhile04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti;
        String namaPelanggan;
        int hargakopi=1200,hargateh=7000,hargaroti=20_000;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar):");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalakan");
                break;
            }
        System.out.print("Jumlah kopi: ");
        kopi = sc.nextInt();
        System.out.print("Jumlah teh : ");
        teh = sc.nextInt();
        System.out.print("Jumlah roti : ");
        roti = sc.nextInt();
        int totalHarga = (kopi * hargakopi)+ (teh * hargateh) + (roti * hargaroti);
        System.out.println("Total yang harus dibayar : Rp " + totalHarga);
        sc.nextInt();
        } while (true);
        
    }
}

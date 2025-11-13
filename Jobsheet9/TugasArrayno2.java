package Jobsheet9;

import java.util.Scanner;

public class TugasArrayno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Pesanan : ");
        int jumlahPesanan=sc.nextInt();
        sc.nextLine();
        String [] namaMenu = new String[jumlahPesanan];
        int [] hargaMenu = new int[jumlahPesanan];
        int total = 0;

        for (int i = 0; i < hargaMenu.length; i++) {
            System.out.print("Masukkan Nama Menu : ");
            namaMenu[i]=sc.nextLine();
            System.out.print("Masukkan Harga Menu : ");
            hargaMenu[i]=sc.nextInt();
            sc.nextLine();
            total+=hargaMenu[i];
            System.out.println("==================================");
        }
        for (int i = 0; i < hargaMenu.length; i++) {
            System.out.println((i+1)+". "+namaMenu[i]+" = " + hargaMenu[i]);
        }
        System.out.println("Total Biaya "+total);
    }
}

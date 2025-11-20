package Jobsheet10;

import java.util.Scanner;

public class BiokopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris,kolom;
        String nama,text;
        String[][]penoton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();
            penoton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n) :");
            text = sc.nextLine();

            if (text.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}

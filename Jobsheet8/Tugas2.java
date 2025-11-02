package Jobsheet8;
import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Politeknik  : ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();
        String[] namaPoliteknik = new String[jumlahPoliteknik];
        String[][][] atlet = new String[jumlahPoliteknik][4][5]; 

        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1));
            System.out.print("Nama Politeknik: ");
            namaPoliteknik[i] = sc.nextLine();
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("Masukkan 5 atlet untuk cabang " + cabor[j] + ":");
                for (int k = 0; k < 5; k++) {
                    System.out.print("  Atlet " + (k + 1) + ": ");
                    atlet[i][j][k] = sc.nextLine();
                }
            }
        }
        System.out.println("DATA ATLET PORSENI 2024");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik: " + namaPoliteknik[i]);
            for (int j = 0; j < cabor.length; j++) {
                System.out.println("  Cabang: " + cabor[j]);
                for (int k = 0; k < 5; k++) {
                    System.out.println("    - " + atlet[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}

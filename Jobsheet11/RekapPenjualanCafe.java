package Jobsheet11;

import java.util.Arrays;
import java.util.Scanner;

public class RekapPenjualanCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah menu : ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari ke- ");
        int jmlHari = sc.nextInt();
        int [][]dataPenjualanKafe =new int[jmlMenu][jmlHari];
        dataPenjualan(dataPenjualanKafe);
        tampilArray(dataPenjualanKafe);
        maxArray(dataPenjualanKafe);
        rataArray(dataPenjualanKafe);
        

        
    }
    public static void dataPenjualan(int[][] tempKafe) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tempKafe.length; i++) {
            System.out.println("Menu ke- "+(1+i));
            for (int j = 0; j < tempKafe[i].length; j++) {
                System.out.print("Hari ke- "+(1+j) + " : " );
                int data=sc.nextInt();
                tempKafe[i][j]=data;
            }
        }
    }
    public static void tampilArray(int[][] tempKafe) {
        for (int i = 0; i < tempKafe.length; i++) {
            System.out.println("Menu ke- " + (1+i));
            for (int j = 0; j < tempKafe[i].length; j++) {
                System.out.println("Hari ke- " + (1+j) + " : " + tempKafe[i][j]);
            }
        }
    }
    public static void maxArray(int[][] tempKafe) {
        int max=tempKafe[0][0];
        int min=tempKafe[0][0];
        for (int i = 0; i < tempKafe.length; i++) {
            
            for (int j = 0; j < tempKafe[i].length; j++) {
                if (max<tempKafe[i][j]) {
                    max=tempKafe[i][j];
                }
                if (min>tempKafe[i][j]) {
                    min=tempKafe[i][j];
                }
            }
        }
        System.out.println("Nilai Tertinggi = " + max);
        System.out.println("Nilai Terendah = " + min);
    }
    public static void rataArray(int[][] tempKafe) {
        for (int i = 0; i < tempKafe.length; i++) {
            int totalMenu =0;
            for (int j = 0; j < tempKafe[i].length; j++) {
                totalMenu+=tempKafe[i][j];
            }
            int rataRata = totalMenu / tempKafe[i].length;
            System.out.println("Menu "+ (i+1) + " : " + rataRata);
        }
    }
}

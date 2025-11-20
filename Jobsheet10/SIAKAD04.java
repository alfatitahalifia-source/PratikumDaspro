package Jobsheet10;

import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai=new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuiah " + (j+1) + ": ");
                nilai[i][j]=sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }
        System.out.println("\n=========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");
        
        for (int k = 0; k < nilai.length; k++) {
            double totalPerMatkul = 0;
            for (int a = 0; a < nilai.length; a++) {
                totalPerMatkul += nilai[k][a];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMatkul/4);
        }
    }
}

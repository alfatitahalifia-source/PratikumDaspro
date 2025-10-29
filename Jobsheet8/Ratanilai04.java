package Jobsheet8;

import java.util.Scanner;

public class Ratanilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nilai,totalnilai,ratanilai;
        
            for (int i = 1; i <= 5; i++) {
                System.out.println("Input nilai Mahasiswa ke = " + i);
                totalnilai=0;
                for (int j = 1; j <=5; j++) {
                System.out.print("Nilai ke- " + j + " = ");
                nilai=sc.nextInt();
                totalnilai+=nilai;
                }
            ratanilai=totalnilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa " + i + ratanilai );
            }
    }
}

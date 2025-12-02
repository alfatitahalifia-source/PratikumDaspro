package Jobsheet11;

import java.util.Scanner;

public class kubus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah sisi : ");
        double sisi = sc.nextDouble();
        System.out.println("Volume = "+volumeKubus(sisi));
        System.out.println("Luar permukaan kubus = "+luarPermukaanKubus(sisi));

    }
    public static double volumeKubus (double sisi){
        return sisi * sisi * sisi;
    }
    public static double luarPermukaanKubus (double sisi) {
        return 6 * sisi * sisi;
    }
    
}

package jobsheed7;

import java.util.Scanner;

public class LatihanSoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total=0;
        do {
        System.out.println("============Jenis Kendaraan===============");
        System.out.println("Mobil = 1");
        System.out.println("Motor = 2");
        System.out.println("Keluar = 0");
        System.out.print("Masukkan Jenis Kendaraan : ");
        jenis=sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi : ");
                durasi=sc.nextInt();
                if (durasi > 5) {
                    total +=12500;
                }else if (jenis == 1) {
                    total+=durasi*3000;
                }else if (jenis == 2){
                    total+=durasi*2000;
                }
                System.out.println("Total : " +total);
            }
            
        }while (jenis!= 0);
    }
}
package Jobsheet9;

import java.util.Scanner;

public class TugasArray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama-nama Makanan yang di cari = ");
        String namaMenu=sc.nextLine();
        boolean isKeyValid = false;
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice" };
        for (int i = 0; i < menu.length; i++) {
            if (namaMenu.equalsIgnoreCase(menu[i])) {
                isKeyValid=false;
                break;
            }else{
                isKeyValid=true;
            }
        }
        if (isKeyValid) {
            System.out.println("Makanan yang dicari tidak ditemukan ");
        }else{
            System.out.println("Makanan tersedia ");
        }
    }
}

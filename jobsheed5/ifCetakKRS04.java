import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("---Cetak KRS SIAKAD---");
    System.out.println("Apakah UKT sudah lunas ? (true/false):");
    boolean uktLunas = sc.nextBoolean();
   if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");

    }else{
        System.out.println("Registrasi diolak.Silahkan lunasi UKT terlebih dahulu");
        sc.close();
    }
    System.out.println("--- Versi Ternari Operator ---");
    String hasil = sc.next();
        if(uktLunas){
            System.out.println("Pembayaran UKT terverifikasi.\nSilahkan cetak KRS dan minta tanda tangan DPA");
        }else{
            System.out.println("Registrasi diolak.Silahkan lunasi UKT terlebih dahulu");
                sc.close();
    }
        }
        

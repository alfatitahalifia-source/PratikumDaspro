package Jobsheet8;

import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i--) {
            System.out.print("*");
        }
    }
}


//JAWABAN PERCOBAAN 1 
//1.Maka binatng yang di hasilkan ada 6 bukan 5 karena mulainya dari 0 bukan dari 1.
//2.Tidak bisa mengeluarkan outputnya "*" karena kondisi awal salah.
//3.Maka perulangan akan infinite loop karena nilai I makin kecil dan tak pernah > N.

package Jobsheet8;

import java.util.Scanner;

public class Square04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N = ");
    int N = sc.nextInt();
    for (int i = 1; i <= N ; i++) {
        for (int j = 0; j <= N; j++) {
            System.out.print("*");
        }    
    System.out.println();
    }
}
}


//JAWABAN PERCOBAA 2//
//1.Output baris menjadi 6 karena dimulai dari 0
//2.Output tiap kolom mencetak 6 karena mulai dari 0
//3.Perulangan luar untuk baris , sedangkan perulangan dalam untuk kolom
//4.membuat baris baru di perulangan luar , jika di hapus bintang akan menjadi 1 baris
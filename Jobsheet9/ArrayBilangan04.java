package Jobsheet9;

public class ArrayBilangan04 {
    public static void main(String[] args) {
        int [] bil={5,13,-7,17};

        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
        }
    }
}

//Jawaban Pertanyaan
/*
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
jika menggunakan tipe data int maka akan eror,sehingga harus di ubah menjadi double.
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus 
pada saat deklarasi array.
package Jobsheet9;

public class ArrayBilangan04 {
    public static void main(String[] args) {
        int [] bil={5,13,-7,17};

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);
    }
}
3. Apa keluaran dari program? Jelaskan maksud dari statement tersebut.
5
13
-7
17
menampilkan lopingan dari 0 sampai 4.
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran 
dari program? Mengapa demikian?
maka akan terjadi ArrayIndexOutOfBoundsException karena mencoba mengakses elemen di luar batas array (bil[4] tidak ada).
 */
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survey[i].length; j++) {
                int temp = 0;
                while (true) {
                    System.out.print("Masukkan nilai ke-" + (j + 1) + " : ");
                    temp = sc.nextInt();
                    if (temp > 0 && temp < 6) {
                        survey[i][j] = temp;
                        break;
                    } else {
                        System.out.println("Nilai Tidak Falid");
                    }
                }
            }
            System.out.println();
        }
        for (int i = 0; i < survey.length; i++) {
            double total = 0;
            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];
            }
            total /= 6;
            System.out.println("Rata2 responden " + (i + 1) + " : " + total);
        }
        for (int i = 0; i < 6; i++) {
            double total2 = 0;
            for (int j = 0; j < survey.length; j++) {
                total2 += survey[j][i];
            }
            total2 /= survey.length;
            System.out.println("Rata2 pertanyaan " + (i + 1) + " : " + total2);
        }
        double total=0;
        for (int i = 0; i < survey.length; i++) {

            for (int j = 0; j < survey[i].length; j++) {
                total += survey[i][j];
            }
        } 
        total/=(survey.length*survey[0].length);
        System.out.println("Rata2 Semua :"+total);
    }
}

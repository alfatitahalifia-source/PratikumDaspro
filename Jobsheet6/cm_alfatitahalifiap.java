package Jobsheet6;

import java.util.Scanner;

public class cm_alfatitahalifiap {
    public static void main(String[] args) {

        //deklarsi scanner
        Scanner sc=new Scanner(System.in);

        System.out.println("--- INPUT DATA MAHASISWA ---");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM :");
        String nim = sc.nextLine(); 


        System.out.println("--- MATA KULIAH 1 : Algoritma dan Pemograman");
        System.out.print("Nilai UTS : ");
        int nilaiUtsalgoritma = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int nialiUasalgoritma = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int nilaiTugasalgoritma = sc.nextInt();
        System.out.print("Nilai kuis : ");
        int nilaikuizalgoritma = sc.nextInt();
        System.out.print("Nilai Case Method :");
        int nilaiCMalgoritma = sc.nextInt();

        double nilaibatasankuisalgoritma=(100);
        String nilaiangkaalgoritma="";
        if (nilaibatasankuisalgoritma >=100) {
            nilaiangkaalgoritma = "salah" ;
        } else {
            nilaiangkaalgoritma = "salah";
            
        }

        System.out.println("--- MATA KULIAH 2 : Struktur Data ");
        System.out.print("Nilai UTS : ");
        int nilaiUtsstruktur = sc.nextInt();
        System.out.print("Nilai UAS : ");
        int nialiUasstruktur = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        int nilaiTugasstruktur = sc.nextInt();
        System.out.print("Nilai kuis : ");
        int nilaikuizstruktur = sc.nextInt();
        System.out.print("Nilai Case Method :");
        int nilaiCMstruktur = sc.nextInt();

        double nilaibatasanCMstruktur=(100);
        String nilaiangkaCM="";
        if (nilaibatasanCMstruktur >=100) {
            nilaiangkaCM = "salah" ;
        } else {nilaiangkaCM = "salah" ;
            
        }


        double nilaiAkhiralgoritma=(nilaiUtsalgoritma*0.3)+(nialiUasalgoritma*0.4)+(nilaiTugasalgoritma*0.3);
        String nilaihurufalgoritma = "";
        if (nilaiAkhiralgoritma <= 39) {
            nilaihurufalgoritma = "E";
        }else if (nilaiAkhiralgoritma <= 50) {
            nilaihurufalgoritma = "D";
        }else if (nilaiAkhiralgoritma <= 60){
            nilaihurufalgoritma = "C";
        }else if (nilaiAkhiralgoritma <= 65){
            nilaihurufalgoritma = "C+";
        }else if (nilaiAkhiralgoritma <= 73){
            nilaihurufalgoritma = "B";
        }else if(nilaiAkhiralgoritma <= 80){
            nilaihurufalgoritma = "B+";
        }else if (nilaiAkhiralgoritma <= 100){
            nilaihurufalgoritma = "A";
        }
        String statusalgoritma = "";
        if (nilaiAkhiralgoritma >= 60){
            statusalgoritma = "LULUS";
        }else{
            statusalgoritma = "TIDAK LULUS";
        }

        double nilaiAkhirstuktur=(nilaiUtsstruktur*0.3)+(nialiUasstruktur*0.4)+(nilaiTugasstruktur*0.3);
        String nilaihurufstruktur = "";
        if (nilaiAkhirstuktur <= 39) {
            nilaihurufstruktur = "E";
        }else if (nilaiAkhirstuktur <= 50) {
            nilaihurufstruktur = "D";
        }else if (nilaiAkhirstuktur <= 60){
            nilaihurufstruktur = "C";
        }else if (nilaiAkhirstuktur <= 65){
            nilaihurufstruktur = "C+";
        }else if (nilaiAkhirstuktur <= 73){
            nilaihurufstruktur = "B";
        }else if(nilaiAkhirstuktur <= 80){
            nilaihurufstruktur = "B+";
        }else if (nilaiAkhirstuktur <= 100){
            nilaihurufstruktur = "A";
        }
        String statusstruktur = "";
        if (nilaiAkhirstuktur >= 60){
            statusstruktur = "LULUS";
        }else{
            statusstruktur = "TIDAK LULUS";
        }
        
        double rataratanilaiakhir=(nilaiAkhiralgoritma+nilaiAkhirstuktur)/2;
        String statussemester="";
        if (statusalgoritma.equals("LULUS")&& statusstruktur.equals("LULUS")){


            if(rataratanilaiakhir<=70) {
                statussemester="LULUS";
            }else{
                statussemester="TIDAK LULUS";
            }

            
        }else{
            statussemester="TIDAK LULUS";
        }

        System.out.println("=== HASIL PENILAIAN AKADEMIK ===");
        System.out.println("Nama : " + nama);
        System.out.println(" NIM  :"+ nim);
        System.out.println("Mata Kuliah\t\t\t\tUTS\tUAS\tTugas\tNilai akhir\tNilai Huruf\tStatus");
        System.out.println("==============================================================================================================");
        System.out.println("Algoritma dan Pemograman\t\t"+nilaiUtsalgoritma+"\t"+nialiUasalgoritma+"\t"+nilaiTugasalgoritma+"\t"+nilaiAkhiralgoritma+"\t\t"+nilaihurufalgoritma+"\t\t"+statusalgoritma);
        System.out.println("Sruktur Data\t\t\t\t"+nilaiUtsstruktur+"\t"+nialiUasstruktur+"\t"+nilaiTugasstruktur+"\t"+nilaiAkhirstuktur+"\t\t"+nilaihurufstruktur+"\t\t"+statusstruktur+"\t\t"+nilaiangkaalgoritma);
        System.out.println();
        System.out.println("Rata rata Nilai Akhir\t: "+statussemester);
        System.out.println("Status Semester\t\t: "+statussemester);
        
    
    }
}

package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cetak KRS siakad");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        // Versi IF–ELSE
        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan");
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan");
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan");
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan");
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan");
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan");
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan");
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan");
        } else {
            System.out.println("Semester tidak valid");
        }

         Tambahkan baris baru: transformasi ke bentuk ternary operato
        String pesan = (semester == 1) ? "KRS Semester 1 ditampilkan" :
                       (semester == 2) ? "KRS Semester 2 ditampilkan" :
                       (semester == 3) ? "KRS Semester 3 ditampilkan" :
                       (semester == 4) ? "KRS Semester 4 ditampilkan" :
                       (semester == 5) ? "KRS Semester 5 ditampilkan" :
                       (semester == 6) ? "KRS Semester 6 ditampilkan" :
                       (semester == 7) ? "KRS Semester 7 ditampilkan" :
                       (semester == 8) ? "KRS Semester 8 ditampilkan" :
                       "Semester tidak valid";

        System.out.println("Hasil dengan ternary operator: " + pesan);

        sc.close();
    }
}

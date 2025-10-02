package jobsheet5;

import java.util.Scanner;

public class IfElseGenapGanjil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Program Cek Genap/Ganjil ---");
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Output: Genap");
        } else {
            System.out.println("Output: Ganjil");
        }

        sc.close();
    }
}

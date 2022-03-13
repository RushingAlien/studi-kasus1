package studikasus;

import java.util.Scanner;

public class MainKaryawan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah karyawan   : ");
        int jumlahKaryawan = scan.nextInt(); scan.nextLine();
        System.out.println();
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Masukkan nama karyawan     : ");
            String nama = scan.nextLine();
            System.out.print("Masukkan alamat            : ");
            String alamat = scan.nextLine();
            System.out.print("Masukkan nomor telepon     : ");
            String nomorTelepon = scan.nextLine();
            System.out.print("Masukkan jenis kelamin     : ");
            String jenisKelamin = scan.nextLine();
            System.out.print("Masukkan kategori karyawan : ");
            String kategoriKaryawan = scan.nextLine();
            System.out.println();
            Karyawan karyawan = new Karyawan(nama, alamat, nomorTelepon, jenisKelamin, kategoriKaryawan);
            karyawan.getInfo();
            karyawan.tingkahLaku();
        }
        scan.close();
    }
}

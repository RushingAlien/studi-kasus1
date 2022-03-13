package studikasus;

import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data mobil: ");
        int jumlahMobil = scan.nextInt(); scan.nextLine();
        System.out.println();
        for (int i = 0; i < jumlahMobil; i++) {
            System.out.print("Masukkan nomor plat     : ");
            String noPlat = scan.nextLine();
            System.out.print("Masukkan merk mobil     : ");
            String merkMobil = scan.nextLine();
            System.out.print("Masukkan warna mobil    : ");
            String warnaMobil = scan.nextLine();
            System.out.print("Masukkan tahun produksi : ");
            int tahunKeluaranMobil = scan.nextInt(); scan.nextLine();
            System.out.println();
            Mobil mobil = new Mobil(noPlat, merkMobil, warnaMobil, tahunKeluaranMobil);
            mobil.getInfo();
            mobil.tingkahLaku();
            System.out.println();
        }
        scan.close();
    }
}

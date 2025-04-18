package StokTurun;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        double harga = input.nextDouble();
        int stok = input.nextInt();
        input.nextLine();
        Produk p1 = new Produk(nama, harga, stok);

        String nama1 = input.nextLine();
        double harga1 = input.nextDouble();
        int stok1 = input.nextInt();
        Produk p2 = new Produk(nama1, harga1, stok1);

        int tambah = input.nextInt();
        int kurang = input.nextInt();

        int tambah1 = input.nextInt();
        int kurang1 = input.nextInt();

        p1.tambah(tambah);
        p1.kurang(kurang);
        p2.tambah(tambah1);
        p2.kurang(kurang1);

        p1.display();
        p2.display();


    }
}

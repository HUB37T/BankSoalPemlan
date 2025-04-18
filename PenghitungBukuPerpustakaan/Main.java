package PenghitungBukuPerpustakaan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = Integer.parseInt(input.nextLine());

        Perpustakaan a[] = new Perpustakaan[jlh];

        for (int i = 0; i < jlh; i++) {
            String isi = input.nextLine();
            String tes[] = isi.split(" ");

            a[i] = new Perpustakaan(tes[0],tes[1],tes[2]);
        }

        for (int i = 0; i < jlh; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Total buku: "+Perpustakaan.getJlh());
    }
}

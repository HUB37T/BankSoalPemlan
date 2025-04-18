package SewainDong;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Kendaraan kendaraan = new Kendaraan();
        for (int i = 0; i < n; i++) {
            int jenis = input.nextInt();
            input.nextLine();
            String merk = input.nextLine();
            String model = input.nextLine();
            String tahun = input.nextLine();
            int hari = input.nextInt();
            switch (jenis) {
                case 1:
                    int jlh = input.nextInt();
                    Kendaraan a = new Mobil1(merk,model,tahun,hari,jlh);
                    kendaraan.add(a);
                    break;
                case 2:
                    String transmisi = input.nextLine();
                    Kendaraan b = new Motor1(merk,model,tahun,hari,transmisi);
                    kendaraan.add(b);
                    break;
            }
        }
        System.out.println("=============================" +
                "\nInformasi Kendaraan" +
                "\n=============================");
        kendaraan.display();
    }
}

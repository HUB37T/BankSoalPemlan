package SistemReservasiHotelLatulipe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();

        Tamu a[] = new Tamu[jlh];
        input.nextLine();
        for (int i = 0; i < jlh; i++) {
            String nama = input.nextLine();
            int jumlah = input.nextInt();
            input.nextLine();
            String jenis = input.nextLine();
            String metode = input.nextLine();
            switch (jenis){
                case "Member":
                    a[i] = new Member(nama,jumlah,metode);
                    break;
                case "Biasa":
                    a[i] = new Biasa(nama,jumlah,metode);
                    break;
                case "VIP":
                    a[i] = new VIP(nama,jumlah,metode);
                    break;
            }
        }
        for (int i = 0; i < jlh; i++) {
            System.out.println(a[i]);
        }
    }
}

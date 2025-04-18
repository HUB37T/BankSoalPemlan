package TokoMajuMundur;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String nomor = input.nextLine();
        String pin = input.nextLine();
        double saldo = input.nextDouble();
        Kartu a = new Kartu(nama, nomor, pin, saldo);
        System.out.println("Akun berhasil dibuat");

        while(true) {
            String pilihan = input.nextLine();
            switch (pilihan) {
                case "pembelian":
                    if(Kartu.cekgagal(a)) System.out.println("Kartu anda terblokir");
                    else {
                        if (Kartu.verifikasiPIN(a, input)) {
                            double harga = input.nextDouble();
                            input.nextLine();
                            a.Pembelian(harga);
                        }
                    }
                    break;
                case "topup":
                    if(Kartu.cekgagal(a)) System.out.println("Kartu anda terblokir");
                    else {
                        if (Kartu.verifikasiPIN(a, input)) {
                            double nominal = input.nextDouble();
                            input.nextLine();
                            a.topUp(nominal);
                        }
                    }
                    break;
                case "cek":
                    a.cek();
                    break;
                case "exit":
                    System.out.println("Terimakasih telah berbelanja");
                    return;
            }
        }
    }
}

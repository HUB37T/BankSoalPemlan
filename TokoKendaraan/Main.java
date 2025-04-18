package TokoKendaraan;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();
        input.nextLine();
        Vehicle a = new Vehicle();
        for (int i = 0; i < jlh; i++) {
            String b = input.nextLine();
            String c[] = b.split(" ");
            switch (c[0]) {
                case "GasCar":
                    String nama = c[1];
                    String nomor = c[2];
                    String tahun = c[3];
                    String kapasitas = c[4];
                    Vehicle x = new Mobil(nama, nomor, tahun, kapasitas);
                    a.add(x);
                    break;
                case "ElectricCar":
                    String nama1 = c[1];
                    String nomor1 = c[2];
                    String tahun1 = c[3];
                    String kapasitas1 = c[4];
                    Vehicle y = new MobilListrik(nama1, nomor1, tahun1, kapasitas1);
                    a.add(y);
                    break;
                case "Motorcycle":
                    String nama2 = c[1];
                    String nomor2 = c[2];
                    String tahun2 = c[3];
                    String kapasitas2 = c[4];
                    Vehicle z = new Motor(nama2, nomor2, tahun2, kapasitas2);
                    a.add(z);
                    break;
                default:
                    return;
            }
        }
        a.displayAll();
    }
}

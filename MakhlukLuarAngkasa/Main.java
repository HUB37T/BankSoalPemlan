package MakhlukLuarAngkasa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = Integer.parseInt(input.nextLine());

        Alien a[] = new Alien[jlh];

        for (int i = 0; i < jlh; i++) {
            String isi = input.nextLine();
            String tes[] = isi.split(" ");
            double penghasilan = Double.parseDouble(tes[2]);
            switch (tes[1]) {
                case "Humanoid":
                    a[i] = new Humanoid(tes[0],tes[1],penghasilan);
                    break;
                case "Reptiloid":
                    a[i] = new Reptiloid(tes[0],tes[1],penghasilan);
                    break;
                case "Bot":
                    a[i] = new Bot(tes[0],tes[1],penghasilan);
                    break;
            }
        }
        for (int i = 0; i < jlh; i++) {
            System.out.println(a[i].getNama() + " (" + a[i].getSpesies() +") membayar pajak sebesar "+ a[i].bayarPajak());
        }
        System.out.println("Total alien terdaftar: "+Alien.getJlh());
    }
}

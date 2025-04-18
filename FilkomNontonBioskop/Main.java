package FilkomNontonBioskop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String judul = input.nextLine();
        int durasi = input.nextInt();
        double harga = input.nextDouble();
        input.nextLine();
        Bioskop bioskop = new Bioskop(judul,durasi,harga);
        while(true){
            String kursi = input.nextLine();
            bioskop.JualTiket(kursi);
            String pilihan = input.nextLine();
            if(pilihan.equalsIgnoreCase("tidak")){
                break;
            }
        }
        bioskop.display();
    }
}

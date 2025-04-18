package SimulatorKendaraanCerdas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();

        Kendaraaan a[] = new Kendaraaan[jlh];
        input.nextLine();
        for (int i = 0; i < jlh; i++) {
            String isi = input.nextLine();
            String b[] = isi.split(" ");
            switch (b[0]) {
                case "Mobil":
                    a[i] = new Mobill(b[1], b[2], b[3]);
                    break;
                case "Motor":
                    a[i] = new Motorr(b[1], b[2], b[3]);
                    break;
                case "Truk":
                    int e = Integer.parseInt(b[4]);
                    if(b.length <= 5){
                        a[i] = new Truk(b[1], b[2], b[3], e);
                    }
                    else{
                        a[i] = new Truk(b[1], b[2], b[3], e, b[5]);
                    }
                    break;
            }
        }
        for (int i = 0; i < jlh; i++) {
            a[i].display();
        }
        System.out.println("Total kendaraan: " + Kendaraaan.getJumlah());
    }
}

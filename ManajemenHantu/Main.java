package ManajemenHantu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        Makhluk a[] = new Makhluk[jumlah];
        input.nextLine();
        for (int i = 0; i < jumlah; i++) {
            String isi = input.nextLine();
            String tes[] = isi.split(" ");
            switch (tes[0]) {
                case "BinatangBuas":
                    a[i] = new BinatangBuas(tes[1],tes[2],tes[3],tes[4]);
                    break;
                case "Naga":
                    a[i] = new Naga(tes[1],tes[2],tes[3],tes[4]);
                    break;
                case "Phoenix":
                    a[i] = new Phoenix(tes[1],tes[2],tes[3],tes[4]);
                    break;
            }
        }
        for (int i = 0; i < jumlah; i++) {
            a[i].display();
        }
        System.out.println("Total makhluk yang dibuat: "+Makhluk.getJumlah());
    }
}

package PTJalanMulus;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = input.nextInt();

        Perusahaan a[] = new Perusahaan[jlh];
        for (int i = 0; i < jlh; i++) {
            int pilihan = input.nextInt();
            input.nextLine();
            String merk = input.nextLine();
            String model = input.nextLine();
            double tarif = input.nextDouble();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    int kapasitas = input.nextInt();
                    int lama = input.nextInt();
                    a[i] = new Mobil2(merk,model,tarif,lama,kapasitas);
                    break;
                case 2:
                    String d = input.nextLine();
                    boolean tes = false;
                    int lama2 = input.nextInt();
                    if(d.equalsIgnoreCase("1"))  tes = true;
                    a[i] = new Motor2(merk, model, tarif,lama2, tes );
                    break;
            }
        }
        for (int i = 0; i < jlh; i++) {
            String c = Integer.toString(i+1);
            System.out.print("Nomor Registrasi: ");
            Perusahaan.getNomor();
            System.out.print(c);
            System.out.println();
            System.out.println(a[i]);
            System.out.println();
        }
        System.out.println("Total Kendaraan: "+jlh);
    }
}

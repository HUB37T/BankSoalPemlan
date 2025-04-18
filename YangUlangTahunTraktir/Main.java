package YangUlangTahunTraktir;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        String ktp = input.nextLine();
        String tgl = input.nextLine();
        double gaji = input.nextDouble();
        input.nextLine();
        String ultah = input.nextLine();
        boolean tes = false;
        if(ultah.equalsIgnoreCase("true")) tes = true;

        int jenis = input.nextInt();
        switch (jenis){
            case 1:
                double tunjangan = input.nextDouble();
                Pegawai a = new Manager(nama,ktp,tgl,gaji,tes,tunjangan);
                a.display();
                System.out.println(a.hitungGaji());
                break;
            case 2:
                int jumlah = input.nextInt();
                double upah = input.nextDouble();
                Pegawai b = new StaffTetap(nama,ktp,tgl,gaji,tes,jumlah,upah);
                b.display();
                System.out.println(b.hitungGaji());
                break;
            case 3:
                int jumlah2 = input.nextInt();
                double harga = input.nextDouble();
                Pegawai c = new StaffKontrak(nama,ktp,tgl,gaji,tes,jumlah2,harga);
                c.display();
                System.out.println(c.hitungGaji());
                break;
            case 4:
                int bulan = input.nextInt();
                Pegawai d = new StaffMagang(nama,ktp,tgl,gaji,tes,bulan);
                d.display();
                System.out.println(d.hitungGaji());
                break;
            default:
                System.out.println("Null");
                break;
        }
    }
}

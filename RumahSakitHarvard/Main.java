package RumahSakitHarvard;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jlh = Integer.parseInt(input.nextLine());

        Pasien a[] = new Pasien[jlh];
        Dokter b[] = new Dokter[jlh];

        input.nextLine();

        for (int i = 0; i < jlh; i++) {
            String isi = input.nextLine();
            String tes[] = isi.split(" ");
            String nama = tes[0];
            String umur = tes[1];
            String keluhan = tes[2];
            String Dokter = tes[3];
            String tipe = tes[4];
            String rawat = tes[5];
            if(rawat.equals("true")){
                a[i] = new Pasien(nama,umur,keluhan,true);
            }
            else{
                a[i] = new Pasien(nama,umur,keluhan,false);
            }
            if(tipe.equals("Umum")){
                b[i] = new DokterUmum(Dokter);
            }else{
                b[i] = new DokterSpesialis(Dokter);
            }

        }
        for (int i = 0; i < jlh; i++) {
            System.out.println("Pasien: "+a[i].getNama()+", Umur: "+a[i].getUmur() + ", Keluhan: "+a[i].getKeluhan());
            System.out.println("Dokter: "+b[i].getNama()+" ("+b[i].getTipe()+")");
            System.out.println("Tagihan: "+b[i].getHarga(a[i]));
            System.out.println();
        }
        System.out.println("Total pasien ditangani: "+ Pasien.getJlh());
    }
}

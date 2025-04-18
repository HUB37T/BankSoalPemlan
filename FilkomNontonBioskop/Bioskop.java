package FilkomNontonBioskop;

import java.util.ArrayList;
import java.util.List;

public class Bioskop {
    private final String judul;
    private final int durasi;
    private final double harga;
    private int jumlah;
    private List<Tiket> jual;

    public Bioskop(String judul, int durasi, double harga) {
        this.judul = judul;
        this.durasi = durasi;
        this.harga = harga;
        this.jumlah = 0;
        this.jual = new ArrayList<>();
    }
    String getJudul() {
        return judul;
    }
    int getDurasi() {
        return durasi;
    }

    public void JualTiket(String kursi){
        Tiket tiket = new Tiket(this, harga, kursi);
        jumlah++;
        jual.add(tiket);
    }
    void display(){
        System.out.println("Total tiket terjual: "+jumlah);
        System.out.println("Detail tiket yang terjual:");
        for (Tiket t : jual) {
            System.out.println("- Film: "+getJudul()+", Durasi: "+getDurasi()+" menit, Harga: $"+t.getHarga()+", Kursi: "+t.getKursi());
        }
    }

}

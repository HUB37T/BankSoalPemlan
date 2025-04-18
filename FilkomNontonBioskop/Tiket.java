package FilkomNontonBioskop;

public class Tiket {
    private Bioskop bioskop;
    private double harga;
    private String kursi;

    public Tiket(Bioskop bioskop, double harga, String kursi) {
        this.bioskop = bioskop;
        this.harga = harga;
        this.kursi = kursi;
    }
    double getHarga() {
        return harga;
    }
    String getKursi() {
        return kursi;
    }
}

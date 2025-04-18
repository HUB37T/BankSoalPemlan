package BarokahMart;

public class Mart {
    private String nama;
    private double harga;
    private int stok;
    private String kode;
    public Mart(String nama, double harga, int stok, String kode) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kode = kode;
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public String getKode() {
        return kode;
    }

    @Override
    public String toString() {
        return "Product: " + nama +
                "\nPrice: " + harga +
                "\nQuantity: " + stok;
    }
}

package BarokahMart;

public class Cleaning extends Mart{

    public Cleaning(String nama, double harga, int stok, String kode) {
        super(nama, harga, stok, kode);
    }

    double hitung(){
        return getHarga() * getStok() * 0.9;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStock Value: Rp " +hitung();
    }
}

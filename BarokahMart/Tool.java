package BarokahMart;

public class Tool extends Mart{
    public Tool(String nama, double harga, int stok, String kode) {
        super(nama, harga, stok, kode);
    }
    double hitung(){
        return (getHarga() + 100) * getStok();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nStock Value: Rp " +hitung();
    }

}

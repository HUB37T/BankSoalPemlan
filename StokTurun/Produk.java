package StokTurun;

public class Produk {
    private String nama;
    private double harga;
    private int stok;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    double getHarga() {
        return (double) harga * stok;
    }
    String getNama() {
        return nama;
    }
    int getStok() {
        return stok;
    }
    void tambah(int a){
        stok += a;
    }
    void kurang(int a){
        if(a>stok) System.out.println("Stok "+getNama()+" tidak mencukupi.");
        else stok -= a;
    }
    void display(){
        System.out.println("Nama: "+getNama()+
                ", Total Harga: $"+getHarga()+
                ", Stok: "+getStok());
    }
}

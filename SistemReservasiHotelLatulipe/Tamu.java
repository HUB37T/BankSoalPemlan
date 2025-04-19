package SistemReservasiHotelLatulipe;

public class Tamu {
    private String nama;
    private int jumlahMalam =0;
    private final long harga = 750000;
    private String metode;

    public Tamu(String nama, int jumlahMalam, String metode) {
        this.nama = nama;
        this.jumlahMalam += jumlahMalam;
        this.metode = metode;
    }

    public String getNama() {
        return nama;
    }
    public long hitung(){
        return harga * jumlahMalam;
    }
    public double getMetode() {
        if(metode.equalsIgnoreCase("Cash")) return 1.03;
        else if(metode.equalsIgnoreCase("Credit Card")) return 1.05;
        else return 0.98;
    }
    public int getJumlahMalam() {
        return jumlahMalam;
    }
    public String getMetode2() {
        return metode;
    }

    @Override
    public String toString() {
        return "Nama: "+nama +
                "\nJumlah Malam: "+jumlahMalam;
    }
}

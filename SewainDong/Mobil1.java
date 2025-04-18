package SewainDong;

public class Mobil1 extends Kendaraan{
    private long harga = 250000;
    private int hari;
    private long penumpang = 25000;
    private int jlh;
    private long pajak = 50000;
    public Mobil1(String merk, String model, String tahun, int hari, int jlh){
        super(merk, model, tahun);
        this.hari = hari;
        this.jlh = jlh;
    }
    public long hitung(){
        return harga * hari + penumpang * jlh + pajak;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nKapasitas: " + jlh + " penumpang" +
                "\nBiaya Sewa: Rp" + hitung() +
                "\n=============================";

    }
}

package SewainDong;

public class Motor1 extends Kendaraan{
    private int jlh;
    private long harga = 100000;
    private String transmisi;
    public Motor1(String merk, String model, String tahun, int jlh, String transmisi){
        super(merk, model, tahun);
        this.jlh = jlh;
        this.transmisi = transmisi;
    }
    long hitung(){
        long tot = 50000 + harga * jlh;
        long tes = tot;
        if(transmisi.equalsIgnoreCase("matic")){
            Math.floor(tes *= 1.2);
        }
        return tes;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nJenis Transmisi: " + transmisi.toUpperCase() +
                "\nBiaya Sewa: Rp" + hitung() +
                "\n=============================";

    }
}

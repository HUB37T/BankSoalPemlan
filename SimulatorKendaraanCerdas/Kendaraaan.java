package SimulatorKendaraanCerdas;

public class Kendaraaan {
    private String merk;
    private String kecepatan;
    private String penumpang;
    private static int jumlah = 0;
    public Kendaraaan(String merk, String kecepatan, String penumpang) {
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.penumpang = penumpang;
        jumlah++;
    }
    public String getMerk() {
        return merk;
    }
    public String getKecepatan() {
        return kecepatan;
    }
    public String getPenumpang() {
        return penumpang;
    }
    public static int getJumlah() {
        return jumlah;
    }
    void display(){

    }
}

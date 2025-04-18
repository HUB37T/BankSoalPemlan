package SimulatorKendaraanCerdas;

public class Truk extends Kendaraaan{
    private int berat;
    private String jenis;
    public Truk(String merk, String kecepatan, String penumpang, int berat) {
        super(merk, kecepatan, penumpang);
        this.berat = berat;
    }
    public Truk(String merk, String kecepatan, String penumpang, int berat, String jenis) {
        super(merk, kecepatan, penumpang);
        this.berat = berat;
        this.jenis = jenis;
    }
    void jalan(){
        System.out.println("[Truk] " +  getMerk() +" berjalan dengan kecepatan " + getKecepatan() +" km/jam, membawa " + getPenumpang() +" penumpang.");
    }
    void muatBarang(int berat){
        this.berat = berat;
        System.out.println(getMerk() + " memuat barang seberat " + berat + " kg.");
    }

    void muatBarang(int berat, String jenis){
        this.berat = berat;
        this.jenis = jenis;
        System.out.println(getMerk() + " memuat barang seberat " + berat + " kg berupa " + jenis + ".");
    }
    void display(){
        super.display();
        jalan();
        if(jenis != null){
            muatBarang(berat,jenis);
        }
        else muatBarang(berat);
    }
}

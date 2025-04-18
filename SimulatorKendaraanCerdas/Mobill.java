package SimulatorKendaraanCerdas;

public class Mobill extends Kendaraaan{
    public Mobill(String merk, String kecepatan, String penumpang) {
        super(merk, kecepatan, penumpang);
    }
    void jalan(){
        System.out.println("[Mobil] " +  getMerk() +" berjalan dengan kecepatan " + getKecepatan() +" km/jam, membawa " + getPenumpang() +" penumpang.");
    }
    void display(){
        super.display();
        jalan();
    }

}

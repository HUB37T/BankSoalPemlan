package SimulatorKendaraanCerdas;



public class Motorr extends Kendaraaan {
    public Motorr(String merk, String kecepatan, String penumpang) {
        super(merk, kecepatan, penumpang);
    }
    void jalan(){
        System.out.println("[Motor] " +  getMerk() +" berjalan dengan kecepatan " + getKecepatan() +" km/jam, membawa " + getPenumpang() +" penumpang.");
    }
    void display(){
        super.display();
        jalan();
    }
}

package SewainDong;
import java.util.*;

public class Kendaraan {
    private String merk;
    private String model;
    private String tahun;
    private List<Kendaraan> kendaraan = new ArrayList<Kendaraan>();

    public Kendaraan() {

    }

    public Kendaraan(String merk, String model, String tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }
    public void add(Kendaraan a) {
        kendaraan.add(a);
    }

    @Override
    public String toString() {
        return "Merk: "+ merk+
                "\nModel: " + model +
                "\nTahun Produksi: " + tahun;
    }

    public void display(){
        for(Kendaraan a : kendaraan){
            System.out.println(a);
        }
    }
}

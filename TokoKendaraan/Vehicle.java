package TokoKendaraan;

import java.util.*;
public class Vehicle {
    private String nama;
    private String nomor;
    private String tahun;
    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Vehicle() {

    }
    public Vehicle(String nama, String nomor, String tahun) {
        this.nama = nama;
        this.nomor = nomor;
        this.tahun = tahun;
    }
    public void add(Vehicle v) {
        vehicles.add(v);
    }

    @Override
    public String toString() {
        return "Nama Pemilik: "+nama +
                "\nNomor Kendaraan: " + nomor +
                "\nTahun Produksi: " + tahun;
    }
    public void displayAll() {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}

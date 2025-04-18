package TokoKendaraan;

public class Mobil extends Vehicle {
    private String kapasitas;
    public Mobil(String nama, String nomor, String tahun, String kapasitas){
        super(nama, nomor, tahun);
        this.kapasitas = kapasitas;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nJenis Kendaraan: Mobil Bensin" +
                "\nKapasitas: " + kapasitas + " liter" +
                "\n---------------------------";
    }
}

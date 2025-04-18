package TokoKendaraan;

public class MobilListrik extends Vehicle{
    private String kapasitas;
    public MobilListrik(String nama, String nomor, String tahun, String kapasitas) {
        super(nama, nomor, tahun);
        this.kapasitas = kapasitas;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nJenis Kendaraan: Mobil Listrik" +
                "\nKapasitas: " + kapasitas + " kWh" +
                "\n---------------------------";
    }
}

package TokoKendaraan;

public class Motor extends Vehicle {
    private String kapasitas;
    public Motor(String nama, String nomor, String tahun, String kapasitas){
        super(nama, nomor, tahun);
        this.kapasitas = kapasitas;
    }
    @Override
    public String toString(){
        return super.toString() +
                "\nJenis Kendaraan: Sepeda Motor" +
                "\nKapasitas: " + kapasitas + " cc" +
                "\n---------------------------";
    }
}

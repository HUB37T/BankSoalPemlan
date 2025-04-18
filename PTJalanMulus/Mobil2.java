package PTJalanMulus;

public class Mobil2 extends Perusahaan{
    private int kapasitas;
    public Mobil2(String merk, String model, double tarif, int hari, int kapasitas) {
        super(merk, model, tarif, hari);
        this.kapasitas = kapasitas;
    }

    public double hitung(){
        if(kapasitas > 4){
            return (getTarif() * getHari() * 0.9);
        }
        else return getTarif() * getHari();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTarif Dasar: Rp " + getTarif() +
                "\nKapasitas Penumpang: "+kapasitas +
                "\nBiaya Sewa: Rp "+hitung();
    }
}

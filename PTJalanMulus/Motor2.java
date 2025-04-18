package PTJalanMulus;

public class Motor2 extends Perusahaan{
    private boolean driver;
    private String tes;
    public Motor2(String merk, String model, double tarif, int hari, boolean driver) {
        super(merk, model, tarif, hari);
        this.driver = driver;
        if(driver) tes = "Ya";
        else tes = "Tidak";
    }

    public double hitung(){
        if(driver){
            return (getTarif() * getHari()) + (100000 * getHari());
        }
        else return getTarif() * getHari();
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nTarif Dasar: Rp " + getTarif() +
                "\nDengan Driver: "+tes +
                "\nBiaya Sewa: Rp "+hitung();
    }
}

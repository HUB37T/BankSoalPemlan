package RumahSakitHarvard;

public class DokterUmum extends Dokter{
    public DokterUmum(String nama) {
        super(nama);
    }
    public long getHarga(Pasien p){

        if(p.getRawatInap()){
            return 50000 + 100000;
        }
        else {
            return 50000;
        }
    }
    public String getTipe(){
        super.getTipe();
        return "Umum";
    }
}

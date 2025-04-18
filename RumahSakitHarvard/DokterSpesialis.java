package RumahSakitHarvard;

public class DokterSpesialis extends Dokter{
    public DokterSpesialis(String nama){
        super(nama);
    }
    public long getHarga(Pasien p){

        if(p.getRawatInap()){
            return 100000 + 100000;
        }
        else {
            return 100000;
        }
    }
    public String getTipe(){
        super.getTipe();
        return "Spesialis";
    }
}

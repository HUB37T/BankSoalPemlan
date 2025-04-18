package YangUlangTahunTraktir;

public class Manager extends Pegawai{

    private double tunjangan;

    public Manager(String nama, String ktp, String tgl, double gaji, boolean ultah, double tunjangan) {
        super(nama, ktp, tgl, gaji,ultah);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        if(isUltah()){
            return (getGaji() * 1.1) + tunjangan;
        }
        else {
            return getGaji() + tunjangan;
        }
    }

}

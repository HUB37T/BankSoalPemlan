package YangUlangTahunTraktir;

public class StaffKontrak extends Pegawai{
    private int proyek;
    private double upah;
    public StaffKontrak(String nama, String ktp, String tgl, double gaji, boolean ultah,int proyek, double upah) {
        super(nama, ktp, tgl, gaji,ultah);
        this.proyek = proyek;
        this.upah = upah;
    }

    @Override
    public double hitungGaji(){
        return getGaji() + proyek * upah;
    }
}

package YangUlangTahunTraktir;

public class StaffTetap extends Pegawai{
    private int jam;
    private double upah;
    public StaffTetap(String nama, String ktp, String tgl, double gaji, boolean ultah,int jam, double upah) {
        super(nama, ktp, tgl, gaji,ultah);
        this.jam = jam;
        this.upah = upah;
    }

    @Override
    public double hitungGaji(){
        return getGaji() + jam * upah;
    }

}

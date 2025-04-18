package YangUlangTahunTraktir;

public class StaffMagang extends Pegawai{
    private int bulan;
    public StaffMagang(String nama, String ktp, String tgl, double gaji, boolean ultah,int bulan) {
        super(nama, ktp, tgl, gaji,ultah);
        this.bulan = bulan;
    }

    @Override
    public double hitungGaji(){
        if(isUltah()) return getGaji() * bulan + 10;
        else return getGaji() * bulan;
    }
}

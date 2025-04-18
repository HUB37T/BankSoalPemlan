package YangUlangTahunTraktir;

public abstract class Pegawai {
    private String nama;
    private String ktp;
    private String tgl;
    private double gaji;
    private boolean ultah;

    public Pegawai(String nama, String ktp, String tgl, double gaji, boolean ultah) {
        this.nama = nama;
        this.ktp = ktp;
        this.tgl = tgl;
        this.gaji = gaji;
        this.ultah = ultah;
    }
    public double hitungGaji(){
        return 0;
    }
    public String getNama() {
        return nama;
    }
    public String getKtp() {
        return ktp;
    }
    public String getTgl() {
        return tgl;
    }
    public double getGaji() {
        return gaji;
    }
    public boolean isUltah() {
        return ultah;
    }
    void display(){
        System.out.println(getNama());
        System.out.println(getKtp());
        System.out.println(getTgl());
        System.out.println(getGaji());
    }
}

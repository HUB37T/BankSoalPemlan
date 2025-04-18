package RumahSakitHarvard;

public class Pasien {
    private String nama;
    private String umur;
    private String keluhan;
    private boolean rawatInap;
    private static int jlh = 0;

    public Pasien(String nama, String umur, String keluhan,boolean rawatInap) {
        this.nama = nama;
        this.umur = umur;
        this.keluhan = keluhan;
        this.rawatInap = rawatInap;
        jlh++;
    }
    public static int getJlh(){
        return jlh;
    }
    public String getNama() {
        return nama;
    }
    public String getUmur() {
        return umur;
    }
    public String getKeluhan() {
        return keluhan;
    }
    public boolean getRawatInap() {
        return rawatInap;
    }
}

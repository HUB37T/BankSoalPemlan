package PenghitungBukuPerpustakaan;

public class Perpustakaan {
    private String judul;
    private String penulis;
    private String thn;
    private static int jlh = 0;
    public Perpustakaan(String judul, String penulis, String thn) {
        this.judul = judul;
        this.penulis = penulis;
        this.thn = thn;
        jlh++;
    }
    public static int getJlh(){
        return jlh;
    }

    @Override
    public String toString() {
        return "Judul: "+ judul + ", Penulis: "+ penulis +", Tahun: " + thn;
    }
}

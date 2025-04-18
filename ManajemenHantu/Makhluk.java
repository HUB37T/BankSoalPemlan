package ManajemenHantu;

public class Makhluk {
    private String nama;
    private String kesehatan;
    private String kekuatanSerang;
    private String elemen;
    private static int jumlah = 0;
    public Makhluk(String nama, String kesehatan, String kekuatanSerang, String elemen) {
        this.nama = nama;
        this.kesehatan = kesehatan;
        this.kekuatanSerang = kekuatanSerang;
        this.elemen = elemen;
        jumlah++;
    }
    public String getNama() {
        return nama;
    }
    public String getKesehatan() {
        return kesehatan;
    }
    public String getKekuatanSerang() {
        return kekuatanSerang;
    }
    public String getElemen() {
        return elemen;
    }
    public static int getJumlah() {
        return jumlah;
    }
    void display(){

    }
}

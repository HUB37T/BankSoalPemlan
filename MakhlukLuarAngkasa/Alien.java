package MakhlukLuarAngkasa;

public class Alien {
    private String nama;
    private String spesies;
    private double penghasilan;
    private static int jlh =0;
    public Alien(String nama, String spesies, double penghasilan) {
        this.nama = nama;
        this.spesies = spesies;
        this.penghasilan = penghasilan;
        jlh++;
    }
    public static int getJlh(){
        return jlh;
    }
    public String getNama() {
        return nama;
    }

    public String getSpesies() {
        return spesies;
    }

    public double getPenghasilan() {
        return penghasilan;
    }

    public double bayarPajak() {
        return 0;
    }

    public double bayarPajak(double penghasilanBaru) {
        this.penghasilan = penghasilanBaru;
        return bayarPajak();
    }

}

package PTJalanMulus;

public abstract class Perusahaan {
    private String merk;
    private String model;
    private double tarif;
    private static final String nomor = "VEH";
    private int hari;
    public Perusahaan(String merk, String model, double tarif,int hari) {
        this.merk = merk;
        this.model = model;
        this.tarif = tarif;
        this.hari = hari;
    }
    public String getMerk() {
        return merk;
    }
    public String getModel() {
        return model;
    }
    public double getTarif() {
        return tarif;
    }
    public static void getNomor() {
        System.out.print(nomor);
    }
    public int getHari() {
        return hari;
    }

    @Override
    public String toString() {
        return "Merek: "+ merk+
                "\nModel: "+model;
    }
}

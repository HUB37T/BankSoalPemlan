package MakhlukLuarAngkasa;

public class Humanoid extends Alien{

    public Humanoid(String nama, String spesies, double penghasilan){
        super(nama, spesies, penghasilan);
    }

    @Override
    public double bayarPajak() {
        return getPenghasilan() * 0.1;
    }
}
